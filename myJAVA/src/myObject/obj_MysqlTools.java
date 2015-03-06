package myObject;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.ErrorManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages;

public class obj_MysqlTools {

	// private static java.sql.Connection connection;
	// private static Statement statement;
	private static String databaseName = "";
	private static String urlPath = "jdbc:mysql://localhost/";
	private static String urlParam = "?useUnicode=true&characterEncoding=Big5";
	private static String url = "jdbc:mysql://localhost/?useUnicode=true&characterEncoding=Big5";
	private static String url2 = "jdbc:mysql://localhost/mytest?useUnicode=true&characterEncoding=Big5";
	private static String user = "root";
	private static String password = "mysql";
	private static java.sql.Connection connection;
	private static Statement statement;

	public static void connectionDriver() {
		try {
			// 註冊driver 連結JDBC資料庫驅動程式
			Class.forName("com.mysql.jdbc.Driver");
			JOptionPane.showMessageDialog(null,
					"mysql driver installation is successful !!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"mysql driver installation failed !!");
			System.exit(0);
		}
	}

	public static void connectionDatabase(String databaseName) {
		// 取得connection
		try {

			connection = DriverManager.getConnection(urlPath + databaseName
					+ urlParam, user, password);
			JOptionPane.showMessageDialog(null, "connection " + databaseName
					+ "is successful !");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "connection " + databaseName
					+ "is failed !!");
			System.exit(0);
		}
	}

	public static void createDatabase(String databaseName) {
		connectionDatabase("");
		try {

			statement = (Statement) connection.createStatement();
			statement.executeUpdate("CREATE DATABASE " + databaseName);
			JOptionPane.showMessageDialog(null, "create " + databaseName
					+ "database successful !");
			statement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (statement != null) {
				JOptionPane.showMessageDialog(null, databaseName
						+ "database Already exists");
			} else {
				JOptionPane.showMessageDialog(null, databaseName
						+ "database Unable to start");
			}
		}
	}

	public static void deleteDatabase(String databaseName) {
		connectionDatabase(databaseName);
		try {

			statement = (Statement) connection.createStatement();
			statement.executeUpdate("DROP DATABASE " + databaseName);
			JOptionPane.showMessageDialog(null, "delete" + databaseName
					+ "database successful !");
			statement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, databaseName
					+ "database Does not exist !");
		}
	}

	public static void createTable(String tableName, String fieldName,
			String dataType) {

		try {

			statement = (Statement) connection.createStatement();
			statement.executeUpdate("CREATE TABLE " + tableName + "("
					+ fieldName + " " + dataType + ");");

			JOptionPane.showMessageDialog(null, "care table successful !");
			statement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Can not create tables !");
			System.exit(0);
		}
	}

	public static void selectTable(String tableName) {

		ResultSet resultSet = null;
		try {

			statement = (Statement) connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM " + tableName);

			System.out.println("acc_id");

			while (resultSet.next()) {
				System.out.println(resultSet.getString("acc_id"));
			}
			// JOptionPane.showMessageDialog(null, "care table successful !");
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Can not select tables !");
			System.exit(0);
		}
	}

	public static void insertData(String tableName, String data) {
		try {
			statement = (Statement) connection.createStatement();
			statement.executeUpdate("INSERT INTO " + tableName
					+ "(acc_id) VALUES('" + data + "');");
			JOptionPane.showMessageDialog(null, "insert data successful !");
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "insert data failed !");
			System.exit(0);
		}
	}
}
