package Mysql;

import myObject.obj_MysqlTools;
import myObject.obj_Person;

public class main_Mysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main_Mysql main_Mysql = new main_Mysql();
	}

	main_Mysql() {
		// obj_Person person = new obj_Person("Eric");

		obj_MysqlTools.connectionDriver();

		// obj_MysqlTools.createDatabase("mytest");
		// obj_MysqlTools.deleteDatabase("mytest");

		obj_MysqlTools.connectionDatabase("mytest");
		// obj_MysqlTools.createTable("personal_data", "acc_id", "VARCHAR(10)");
		obj_MysqlTools.insertData("personal_data", "aaa");
		obj_MysqlTools.selectTable("personal_data");

		sample_Mysql sample_Mysql = new sample_Mysql();
	}
}
