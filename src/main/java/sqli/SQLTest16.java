package sqli;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLTest16 {

  public void sqlTest16(int x, String d, String y) {
    String yUnsafe = null;
    try {
      int u = x + 1;
      System.out.println(d + "blabla");
      yUnsafe = y;
      String id = getid("?");
      String sql =
              "INSERT INTO banned_ip(id, ip) VALUE('"
                      + UUID.randomUUID().toString()
                      + "','"
                      + id
                      + "')";
      PreparedStatement statement = getJDBCConnection().prepareStatement(sql);
      // Setting the query parameters
      statement.setString(1, yUnsafe);
      statement.execute();
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfdsf");
  }

  Connection getJDBCConnection() {
    return null;
  }

  public String getid(String x) {
    String id = x;
    return id;
  }
}