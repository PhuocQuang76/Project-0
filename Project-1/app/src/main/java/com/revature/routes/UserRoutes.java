package com.revature.routes;

import com.revature.controllers.UserController;
import io.javalin.Javalin;

public class UserRoutes extends Route{
    private UserController userController;

    public UserRoutes(UserController userController){
        this.userController = userController;
    }

    @Override
    public void registerLocalRoutes(Javalin app){
        app.get("/user", userController.createUser);
    }

}
