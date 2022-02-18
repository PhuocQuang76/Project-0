package com.revature.daos;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DirectorDao {

    public List<String> getAllDirector() throws SQLException;
}
