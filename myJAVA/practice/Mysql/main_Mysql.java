package Mysql;

import myObject.obj_MysqlTools;

public class main_Mysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main_Mysql main_Mysql = new main_Mysql();
	}

	main_Mysql() {

		obj_MysqlTools.connectionDriver();
		// obj_MysqlTools.connectionDatabase();
		// obj_MysqlTools.createDatabase("mytest");
		obj_MysqlTools.deleteDatabase("test");
		sample_Mysql sample_Mysql = new sample_Mysql();
	}
}
