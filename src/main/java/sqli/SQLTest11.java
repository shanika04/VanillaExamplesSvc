package testProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLTest11 {

    public void sqlTest11(String ip) {
        try {
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('"
                    + UUID.randomUUID().toString() + "','" + ip + "')";
            getJDBCConnection().createStatement().execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.print("sdfdsf");
    }

    Connection getJDBCConnection() {
        return null;
    }
}