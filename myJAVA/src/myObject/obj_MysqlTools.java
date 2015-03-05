package myObject;

import java.net.URL;
import java.sql.DriverManager;
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
	private static String url = "jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=Big5";
	private static String url2 = "jdbc:mysql://localhost/mytest";
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
			// System.exit(0);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"mysql driver installation failed !!");
			System.exit(0);
		}
	}

	public static void connectionDatabase() {

		// 取得connection
		try {
			connection = DriverManager.getConnection(url2, user, password);
			// connection = DriverManager
			// .getConnection(
			// "jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=Big5",
			// "root", "mysql");
			statement = (Statement) connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "connection is failed !!");
			System.exit(0);
		}
		// localhost是主機名
		// test是database名
		// useUnicode=true&characterEncoding=Big5使用的編碼
		// root是password
	}

	public static void createDatabase(String databaseName) {
		java.sql.Connection connection;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = (Statement) connection.createStatement();

			statement.executeUpdate("CREATE DATABASE " + databaseName);
			JOptionPane.showMessageDialog(null, "create database successful !");
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			String str1 = "Already exists";
			String str2 = "Unable to start";
			if (statement != null) {
				JOptionPane.showMessageDialog(null, str1);
			} else {
				JOptionPane.showMessageDialog(null, str2);
			}
		}
	}

	public static void deleteDatabase(String databaseName) {
		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = (Statement) connection.createStatement();
			statement.executeUpdate("DROP DATABASE " + databaseName);
			JOptionPane.showMessageDialog(null, "delete database successful !");
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "database Does not exist !");
			System.exit(0);
		}
	}
}