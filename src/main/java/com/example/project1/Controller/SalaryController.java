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
}
