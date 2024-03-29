package com.dbController;


import com.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    public static boolean Login(String username, String password) throws SQLException, ClassNotFoundException {

        String SQL = "SELECT * FROM users WHERE username=? AND password=?";

        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, username);
        stm.setObject(2, password);
        ResultSet rst = stm.executeQuery();

        if (rst.next()) {

            if(rst.getString(1).equals(username)){
                return true;
            }
            String pwd = rst.getString(2);

            if (pwd.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
