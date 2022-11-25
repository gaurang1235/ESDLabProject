package com.example.project1.DAO.Implementation;

import com.example.project1.BEAN.Employees;
import com.example.project1.BEAN.LoginDetails;
import com.example.project1.DAO.LoginDAO;
import com.example.project1.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class LoginDAOImpl implements LoginDAO {

    @Override
    public void createLogin(LoginDetails loginDetails) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction tx = session.beginTransaction();

            session.persist(loginDetails);

            tx.commit();
        }
        catch(HibernateException ex){
            System.out.print(ex.getLocalizedMessage());
        }
    }

    @Override
    public Employees login(String email, String pass) {
        try(Session session = HibernateSessionUtil.getSession()){

            List<Object> result = new ArrayList<Object>(session.createQuery("FROM LoginDetails WHERE email = :email AND password = :pass").setParameter("email", email).setParameter("pass",pass).list());

            if(result.size()==0)
                return null;

            LoginDetails ldt = (LoginDetails) result.get(0);


            List<Object> result1 = new ArrayList<Object>(session.createQuery("FROM Employees WHERE email = :email").setParameter("email", ldt.getEmail()).list());

            if(result1.size()==0)
                return null;

            Employees emp = (Employees) result1.get(0);

            return emp;
        }
        catch (HibernateException ex){
            System.out.print(ex.getLocalizedMessage());
        }

        return null;
    }
}
