package myObject;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.ErrorManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages;

public class obj_MysqlTools {

	private static java.sql.Connection con = null;

	public static void doDriverTest() {
		try {
			// 註冊driver
			Class.forName("com.mysql.jdbc.Driver");
			JOptionPane.showMessageDialog(null,
					"mysql driver installation is successful !!");
			// System.exit(0);
			// 取得connection
			con = DriverManager
					.getConnection(
							"jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=Big5",
							"root", "mysql");
			// localhost是主機名
			// test是database名
			// useUnicode=true&characterEncoding=Big5使用的編碼
			// root是password
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"mysql driver installation failed !!");
			System.exit(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
