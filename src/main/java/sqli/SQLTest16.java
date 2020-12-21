package sqli;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLTest16 {

  public void sqlTest16(int x,String d,String y) {
    try {
      int u=x+1;
      System.out.println( d+"blabla");
      String id = getid(y);
      String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + id + "')";
      Statement statement = getJDBCConnection().createStatement();
      statement.execute(sql);
    } catch (SQLException exception) {
      exception.printStackTrace();
    }
    System.out.print("sdfdsf");
  }

  Connection getJDBCConnection() {
    return null;
  }

  public String getid(String x){
    String id = x;
    return id;
  }
}
