package com.example.project1.DAO.Implementation;

import com.example.project1.BEAN.Departments;
import com.example.project1.DAO.DepartmentDAO;
import com.example.project1.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentDAOImpl implements DepartmentDAO {

    @Override
    public void createDepartment(Departments department) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction tx = session.beginTransaction();

            session.persist(department);

            tx.commit();
        }catch(HibernateException ex){
            System.out.print(ex.getLocalizedMessage());
        }
    }
}
