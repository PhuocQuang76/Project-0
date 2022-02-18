package com.revature.Controllers;

import com.revature.dto.EmployeeDTO;
import com.revature.services.DirectorService;
import com.revature.services.EmployeeService;
import io.javalin.http.Context;

import java.sql.SQLException;
import java.util.List;

public class DirectorController {
    private final DirectorService directorService = new DirectorService();

    public void handleGetDirectorList(Context ctx) throws SQLException {
        List<String> directorList = directorService.getAllDirector();
        // prepare response
        ctx.json(directorList);
    }
}
