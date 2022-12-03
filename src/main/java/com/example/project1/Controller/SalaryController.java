package com.example.project1.Controller;

import com.example.project1.BEAN.Employee_Salary;
import com.example.project1.DAO.Employee_SalaryDAO;
import com.example.project1.DAO.Implementation.Employee_SalaryDAOImpl;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("salary")
public class SalaryController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSalary(@QueryParam("empId") int empId){
        Employee_SalaryDAO esalDao = new Employee_SalaryDAOImpl();

        List<Employee_Salary> esal = esalDao.getSalary(empId);

        if(esal==null)
            return Response.status(403).build();
        return Response.ok().entity(esal).build();
    }

    //curl -v http://localhost:8080/Project1-1.0-SNAPSHOT/api/salary?empId=103


    //Extra Functionality
//    @DELETE
//    public Response deleteSalary(@QueryParam("empId") int empId){
//        Employee_SalaryDAO esal_Dao = new Employee_SalaryDAOImpl();
//
//        if(esal_Dao.deleteSalary(empId))
//            return Response.status(200).build();
//        else
//            return Response.status(404).build();
//    }
}
