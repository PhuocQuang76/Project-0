package com.revature;

import com.revature.Controllers.*;
import com.revature.loggingwith4j.LoggingUtil;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.*;

public class JavalinRouteApp {

   private TeamController teamController = new TeamController();
   private EmployeeController employeeController = new EmployeeController();
   private ManagerController managerController = new ManagerController();
   private DirectorController directorController = new DirectorController();
   private AuthController authController = new AuthController();
   private LoggingUtil loggingUtil = new LoggingUtil();

   private Javalin app = Javalin.create().routes(() -> {
      path("/team", ()->{
         get(teamController::handleGetAllTeam);
         path("{id}",()->{
            get(teamController::handleGetMemberOfParticularTeam);
         });
      });

      path("/employee",()->{
         post(employeeController::handleCreateNewEmployee);
         get(employeeController::handleGetAllActiveEmployee);
         path("{id}",()->{
            put(employeeController::handleUpdateEmployee);
         });
      });

      path("/salary/{id}", ()-> {
         before(authController::authorizeHRToken);
         get(employeeController::handleViewEmployeeSalaryRange);
         //before(authController::authorizeHRToken);
         put(employeeController::handleUpdateEmployeeSalary);
      });

      path("/manager", () ->{
         get(managerController::handleGetAllManager);
         path("/salary", ()->{
            get(managerController::handleGetManagerSalary);
         });
      });


      path("/director", () -> {
         get(directorController::handleGetDirectorList);
      });

      path("login", ()->{
         post(authController::authenticateLogin);
      });

      before("*",loggingUtil::logRequest);

   });

   public void start(int port){
      app.start(port);
   }
}
