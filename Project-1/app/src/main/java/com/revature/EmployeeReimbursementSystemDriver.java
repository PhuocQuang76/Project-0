package com.revature;

import com.revature.controllers.AuthController;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoJDBC;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.routes.AuthRoutes;
import com.revature.routes.Route;
import com.revature.services.AuthService;
import com.revature.services.UserService;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class EmployeeReimbursementSystemDriver {

    private static UserDao userDao = new UserDaoJDBC();
    private static UserService userService= new UserService(userDao);

    private static AuthService authService = new AuthService(userDao);
    private static AuthController authController = new AuthController(authService, userService);

    public static void main(String[] args) {
        User u1 = userService.createNewUser("name11@revature.net", "name11", "last11", Role.EMPLOYEE,"name11");
        User u2 = userService.createNewUser("name12@revature.net", "name12", "last12", Role.EMPLOYEE,"password");
        System.out.println(u1);
        System.out.println(u2);

    }
}
