package com.revature.Controllers;

import com.revature.models.Manager;
import com.revature.services.ManagerService;

import io.javalin.http.Context;
import java.util.List;

public class ManagerController {
    private final ManagerService  managerService= new ManagerService();
    public void handleGetAllManager(Context ctx) throws Exception {

        List<String> managers = managerService.getAllManager();
        ctx.json(managers);
    }

    public void handleGetManagerSalary(Context ctx){
        List<String> managerS = managerService.getManagerSalary();
        ctx.json(managerS);
    }
}
