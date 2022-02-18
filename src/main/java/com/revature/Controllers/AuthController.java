package com.revature.Controllers;

import com.revature.models.Employee;
import com.revature.services.EmployeeService;
import io.javalin.http.Context;
import io.javalin.http.ForbiddenResponse;
import io.javalin.http.UnauthorizedResponse;

import java.util.Locale;

public class AuthController {
    private final EmployeeService employeeService = new EmployeeService();
    public void authenticateLogin(Context ctx) throws Exception {
        // interpret request
        String username = ctx.formParam("username");
        String password = ctx.formParam("password");

        // fulfill the request
        String positionType =  employeeService.getByUsernameAndPassword(username, password);

        // preparing response
        if(positionType == null){
            throw new UnauthorizedResponse("Incorrect credentials");
        } else {
            String simpleToken = positionType.toUpperCase() +"-TOKEN"; // "HUMAN RESOURCE-TOKEN" or "STAFF-TOKEN"
            ctx.header("Authorization", simpleToken);
            ctx.status(200);
        }
    }

    public void authorizeHRToken(Context ctx){
        String authHeader = ctx.header("Authorization");
        if(authHeader != null){
            if(authHeader.equals("HUMAN RESOURCE-TOKEN")){
                return;
            } else {
                throw new ForbiddenResponse("you are unable to access this feature");
            }
        }
        throw new UnauthorizedResponse("please login and try again");
    }
}
