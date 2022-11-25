package com.example.project1.DAO.Implementation;

import com.example.project1.BEAN.Employee_Salary;
import com.example.project1.BEAN.Employees;
import com.example.project1.DAO.Employee_SalaryDAO;
import com.example.project1.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Employee_SalaryDAOImpl implements Employee_SalaryDAO {

    @Override
    public void createSalary(Employee_Salary s) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction tx = session.beginTransaction();

            session.persist(s);

            tx.commit();
        } catch(HibernateException ex){
            System.out.print(ex.getLocalizedMessage());
        }
    }

    @Override
    public List<Employee_Salary> getSalary(int empId) {

        List<Employee_Salary> esal = new ArrayList<>();

        try(Session session = HibernateSessionUtil.getSession()){

            List<Object> result1 = new ArrayList<Object>(session.createQuery("FROM Employees WHERE employee_id = :empid").setParameter("empid", empId).list());

            if(result1.size()==0)
                return null;

            Employees emp = (Employees) result1.get(0);


            for (
                    final Object sal : session
                    .createQuery("FROM Employee_Salary WHERE employee_id=:e_id")
                    .setParameter("e_id", emp).list()
            )
                esal.add((Employee_Salary) sal);
        }
        catch (HibernateException exception) {
            System.out.println(exception.getLocalizedMessage());
        }

        return esal;
    }
}
