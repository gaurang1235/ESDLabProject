package com.example.project1.DAO.Implementation;

import com.example.project1.BEAN.Employees;
import com.example.project1.DAO.EmployeeDAO;
import com.example.project1.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void createEmployee(Employees employee) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction tx = session.beginTransaction();

            session.persist(employee);

            tx.commit();
        }
        catch(HibernateException ex){
            System.out.print(ex.getLocalizedMessage());
        }
    }

//    @Override
//    public Employees login(Employees employee) {
//        try(Session session = HibernateSessionUtil.getSession()){
//            Employees emp = (Employees) session.createQuery("FROM Employees WHERE email = :email").setParameter("email", employee.getEmail());
//            return emp;
//        }
//        catch (HibernateException ex){
//            System.out.print(ex.getLocalizedMessage());
//        }
//
//        return null;
//    }
}
