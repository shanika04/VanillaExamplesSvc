package sqli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLTest1 {

	public void sqlTest1(String ip) {
		try {
			Statement statement = getJDBCConnection().createStatement();
			String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
			statement.execute(sql);
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		System.out.print("sdfsf");
	}

	Connection getJDBCConnection() {
		return null;
	}
}