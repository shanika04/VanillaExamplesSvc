package sqli;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLTest21 {

  public void sqlTest21(String ip) {
    try {
      String sql =
              "INSERT INTO banned_ip(id, ip) VALUE('"
                      + UUID.randomUUID().toString()
                      + "','"
                      + "?"
                      + "')";
      PreparedStatement statement = getJDBCConnection().prepareStatement(sql);
      // Setting the query parameters
      statement.setString(1, ip);
      sink(sql, statement);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void sink(String sql, Statement statement) {
    try {
      statement.execute();
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfdsf");
  }

  Connection getJDBCConnection() {
    return null;
  }
}