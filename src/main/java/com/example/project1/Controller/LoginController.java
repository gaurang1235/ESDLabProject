package com.example.project1.Controller;

import com.example.project1.BEAN.Employees;
import com.example.project1.BEAN.LoginDetails;
import com.example.project1.DAO.Implementation.LoginDAOImpl;
import com.example.project1.DAO.LoginDAO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("employee")
public class LoginController {

    LoginDAO loginDAO = new LoginDAOImpl();

    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(LoginDetails dt)
    {
        Employees loggedinemployee = loginDAO.login(dt.getEmail(), dt.getPassword());

        if(loggedinemployee==null)
            return Response.status(403).build();
        else
            return Response.ok().entity(loggedinemployee).build();
    }
}
