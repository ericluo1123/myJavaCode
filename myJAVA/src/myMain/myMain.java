package myMain;

import java.awt.Button;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import myFrame.frm_Frame;
import myRunnable.rub_Frame;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.FlowLayout;

public class myMain {

	/**
	 * @param args
	 * @throws IOException
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));

		// data type
		// ==================================================================
		// int num1 = 6;
		// int num2 = 3;
		// long num3 = 1000L;
		// float num4 = 0.456F;
		// float num5 = 0.15e3F;
		// double num6 = 1.298e13;
		// System.out.println("num1=" + num1);
		// System.out.println("num2=" + num2);
		// System.out.println("num3=" + num3);
		// System.out.println("num4=" + num4);
		// System.out.println("num5=" + num5);
		// System.out.println("num6=" + num6);
		//
		// char ch;
		// System.out.print("Please input :");
		// ch = (char) System.in.read();
		// System.out.println("input=" + ch);

		// BufferedReader
		// ==================================================================
		// BufferedReader keyin;
		// keyin = new BufferedReader(new InputStreamReader(System.in));

		// double w1, w2, ave;
		// System.out.print("Please input newuber 1 weihgt:");
		// w1 = Double.parseDouble(keyin.readLine());
		// System.out.print("Please input newuber 2 weihgt:");
		// w2 = Double.parseDouble(keyin.readLine());
		// ave = (w1 + w2) / 2;
		// System.out.println("average = " + String.valueOf(ave));

		// BufferedReader keyin;
		// keyin = new BufferedReader(new InputStreamReader(System.in));
		// String goods_name;
		// float price, money;
		// int quantity;
		// System.out.print("Please input goods_name :");
		// goods_name = keyin.readLine();
		// System.out.print("Please input Unit price :");
		// price = Float.parseFloat(keyin.readLine());
		// System.out.print("Please input Quantity :");
		// quantity = Integer.parseInt(keyin.readLine());
		// money = price * quantity;
		//
		// // System.out.println( goods_name: + "\n" + "Unit price:\t"
		// // + price + "\n" + "Quantity:\t" + quantity + "\n" + "money:\t"
		// // + money);
		// System.out.println("Product Name\tgoods_name\tUnit price\tMoney");
		// System.out.println("==========================================================");
		// System.out.println(goods_name+"\t\t"+price+"\t\t"+quantity+"\t\t"+money);

		// BufferedReader keyin;
		// keyin = new BufferedReader(new InputStreamReader(System.in));
		//
		// System.out.print("Please input your name\t:");
		// String name = keyin.readLine();
		// System.out.print("Please input \"1\" sex is male, \"2\"sex is female:");
		// int sex = Integer.parseInt(keyin.readLine());
		// String str;
		// if (sex == 1) {
		// str = "先生";
		// } else {
		// str = "小姐";
		// }
		// System.out.println("Hello," + name + " " + str);

		// BufferedReader keyin;
		// keyin = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("Please input first number:");
		// int n1 = Integer.parseInt(keyin.readLine());
		// System.out.print("Please input Second number:");
		// int n2 = Integer.parseInt(keyin.readLine());
		// String compare = n1 >= n2 ? "大於等於" : "小於";
		// System.out.print(n1 + " " + compare + " " + n2);

		// System.out.print("Please input character:");
		// char ch = (char) System.in.read();
		// switch (ch) {
		// case 'a':
		// System.out.println("Your word is apple");
		// break;
		// case 'b':
		// System.out.println("Your word is book");
		// break;
		// default:
		// System.out.println("Your Input character not 'a' or 'b'");
		// break;
		// }

		// int i1=System.in.read();
		// System.out.println(i1);

		// float data[] = new float[5];
		// float sum = 0;
		//
		// for (int i = 0; i < 5; i++) {
		// System.out.print("Please input " + (i + 1) + " number:");
		// data[i] = Float.parseFloat(keyin.readLine());
		// sum += data[i];
		// }
		//
		// for (int i = 0; i < 5; i++) {
		// System.out.println("data[" + i + "]= " + data[i]);
		// }
		// System.out.println("sum = " + sum);
		//
		// float max = 0;
		//
		// for (int i = 0; i < data.length; i++) {
		// max = data[i] > max ? data[i] : max;
		// // if (max < data[i]) {
		// // max = data[i];
		// // }
		// }
		// System.out.println("max = " + max);

		// System.out.print("Please input array length :");
		// int length = Integer.parseInt(keyin.readLine());
		// float array[] = new float[length];
		// for (int i = 0; i < array.length; i++) {
		// System.out.print("Please input a number :");
		// array[i] = Float.parseFloat(keyin.readLine());
		// }
		//
		// for (int i = 0; i < array.length; i++) {
		// System.out.println("array[" + i + "] = " + array[i]);
		// }
		// System.out.print("Please input data quantity :");
		// int row_length = Integer.parseInt(keyin.readLine());
		// String column_list[] = { "姓名", "底薪", "加班費", "勞健保費", "實發金額" };
		// int salary[][] = new int[row_length][column_list.length - 1];
		//
		// String name[] = new String[row_length];
		// for (int i = 0; i < row_length; i++) {
		//
		// int count = 0;
		// System.out.print("Please input 姓名 :");
		// name[i] = keyin.readLine();
		// System.out.print("Please input 底薪:");
		// salary[i][count] = Integer.parseInt(keyin.readLine());
		// System.out.print("Please input 加班費:");
		// salary[i][count + 1] = Integer.parseInt(keyin.readLine());
		// System.out.print("Please input 勞健保費 :");
		// salary[i][count + 2] = Integer.parseInt(keyin.readLine());
		// salary[i][count + 3] = salary[i][0] + salary[i][1] - salary[i][2];
		// }
		//
		// for (int i = 0; i < column_list.length; i++) {
		// System.out.print(column_list[i] + "\t\t");
		// }
		// System.out.println();
		// for (int i = 0; i < salary.length; i++) {
		// System.out.print(name[i] + "\t\t");
		// for (int j = 0; j < salary[i].length; j++) {
		// System.out.print(salary[i][j] + "\t\t");
		// }
		// System.out.println();
		// }
		//
		// int sum[] = new int[column_list.length - 1];
		// for (int i = 0; i < sum.length; i++) {
		// for (int j = 0; j < salary.length; j++) {
		// sum[i] += salary[j][i];
		//
		// }
		// }
		// System.out.print("總計\t\t");
		// for (int i = 0; i < sum.length; i++) {
		// System.out.print(sum[i] + "\t\t");
		// }
		// System.out.println();

		// String number[] = new String[] { "zero", "one", "two", "three",
		// "four",
		// "five", "six", "seven", "eight", "nine", "ten" };
		// int data[] = new int[5];
		// for (int i = 0; i < data.length; i++) {
		// System.out.print("Please enter number " + number[i + 1] + ":\t");
		// data[i] = Integer.parseInt(keyin.readLine());
		// }
		// // before sorting
		// System.out.print("before sorting:\t");
		// for (int i = 0; i < data.length; i++) {
		// System.out.print(data[i] + "\t");
		// }
		// System.out.println();
		// // Bubble Sort
		// for (int i = 0; i < data.length; i++) {
		// for (int j = 0; j < data.length - 1; j++) {
		// if (data[j] > data[j + 1]) {
		// int temp = data[j];
		// data[j] = data[j + 1];
		// data[j + 1] = temp;
		// }
		// }
		// }
		//
		// // after sorting
		// System.out.print("after sorting:\t");
		// for (int i = 0; i < data.length; i++) {
		// System.out.print(data[i] + "\t");
		// }

		// int account[] = new int[] { 11, 14, 17, 20, 21, 33, 55, 0, 2 };
		// String name[] = new String[] { "張三", "李四", "阿珠", "阿花", "龍五", "Gary",
		// "HaHa", "Ken", "Eric" };

		// System.out.print("Please input account :");
		// int number = Integer.parseInt(keyin.readLine());
		// int checked = -1;
		// // linear search
		// for (int i = 0; i < account.length; i++) {
		// if (account[i] == number) {
		// checked = i;
		// break;
		// }
		// }
		//
		// if (checked == -1) {
		// System.out.println("查無此編號!");
		// } else {
		// System.out.println("編號\t姓名");
		// System.out.println(account[checked] + "\t" + name[checked]);
		// }

		// after sorting
		// for (int i = 0; i < account.length; i++) {
		// for (int j = 0; j < account.length - 1; j++) {
		// if (account[j] > account[j + 1]) {
		// int temp = account[j];
		// account[j] = account[j + 1];
		// account[j + 1] = temp;
		// String str = name[j];
		// name[j] = name[j + 1];
		// name[j + 1] = str;
		// }
		// }
		// }
		// System.out.println("account\tname");
		// for (int i = 0; i < account.length; i++) {
		// System.out.println(account[i] + "\t" + name[i]);
		// }
		//
		// System.out.print("Search account :");
		// int number = Integer.parseInt(keyin.readLine());
		//
		// // Binary Search
		// boolean accord = false;
		// int low = 0, high = account.length - 1;
		// int middle = 0;
		// while (true) {
		// middle = (low / 2) + (high / 2);
		// System.out.println("low=:" + low + ",high=" + high + ",middle=:"
		// + middle);
		// System.out.println("number=" + number + "\t" + "account[middle]="
		// + account[middle]);
		// if (number == account[middle]) {
		// accord = true;
		// break;
		// } else if (number > account[middle]) {
		// low = middle + 1;
		// } else if (number < account[middle]) {
		// high = middle - 1;
		// }
		//
		// if (middle == low || middle == high) {
		// accord = false;
		// break;
		// }
		// }
		// System.out.println();
		//
		// if (accord == true) {
		// System.out.println("search result");
		// System.out.println("編號\t姓名");
		// System.out.println(account[middle] + "\t" + name[middle]);
		// } else {
		// System.out.println("查無此編號!");
		// }

		// String class

		// float price = 2.3f;
		// double tot;
		// tot = Money(price, 11);
		// System.out.println("tot = " + tot);
		// int x = 3, y = 5;
		// System.out.println("main method -- 呼叫 Swap methoed before");
		// System.out.println("x = " + x + " y = " + y);
		// Swap(x, y);
		// System.out.println("main method -- 呼叫 Swap methoed after");
		// System.out.println("x = " + x + " y = " + y);

		// String[] word = new String[] { "book", "pen", "desk", "boy", "girl",
		// "apple", "test", "zero", "hero" };
		// System.out.println("Sort before:");
		// for (int i = 0; i < word.length; i++) {
		// System.out.print(word[i] + "\t");
		// }
		//
		// Sort(word);
		// System.out.println();
		// System.out.println("Sort after:");
		// for (int i = 0; i < word.length; i++) {
		// System.out.print(word[i] + "\t");
		// }
		// int n;
		// System.out.print("Please input a number");
		// n = Integer.parseInt(keyin.readLine());
		//
		// System.out.println(n + "! = " + Recursive(n));

		// for (double d = 0; d <= 360; d += 45) {
		// System.out.println("sin(" + d + ") = " +
		// Math.sin(Math.toRadians(d)));
		// }

		// long t1, t2, t_counter;
		// t1 = System.currentTimeMillis();
		// Date date = new Date();
		// DateFormat dfmt = new SimpleDateFormat("y年\tM月\td日\tE");
		//
		// int score = 0;
		// for (int i = 0; i < 2; i++) {
		// System.out.println("第" + (i + 1) + "題:");
		// int num1 = (int) (Math.random() * 11) + 10;
		// int num2 = (int) (Math.random() * 11);
		// int answer = num1 * num2;
		// System.out.print(num1 + " x " + num2 + " = :");
		// int value = Integer.parseInt(keyin.readLine());
		// if (value == answer) {
		// score += 50;
		// System.out.println("節對了!");
		// } else {
		// System.out.println("節錯了!");
		// }
		// System.out.println();
		// }
		// System.out.println("Your score : " + score);
		//
		// t2 = System.currentTimeMillis();
		// t_counter = t2 - t1;
		// System.out.println(dfmt.format(date));
		// System.out.println("使用時間 : " + (t_counter / 1000) + "秒");

		// long t1, t2, tot;
		// Date date = new Date();
		// Calendar calendar = Calendar.getInstance();
		// t1 = System.currentTimeMillis();
		// System.out.println("開始 時間: " + t1 + " 毫秒");
		// System.out.println(date);
		// System.out.println(Calendar.getInstance().get(Calendar.YEAR) + "年");
		// System.out.println(calendar.get(Calendar.YEAR) + "年");
		// System.out.println(calendar.get(calendar.MONTH) + "月");
		// System.out.println(calendar.get(calendar.DAY_OF_MONTH) + "日");
		// System.out.println(calendar.get(calendar.HOUR_OF_DAY) + "時");
		// System.out.println(calendar.get(calendar.MINUTE) + "分");
		// System.out.println(calendar.get(calendar.SECOND) + "秒");
		// System.out.println(calendar.get(calendar.MILLISECOND) + "毫秒");
		// System.out.println("Press enter");
		// int p = System.in.read();
		// t2 = System.currentTimeMillis();
		// System.out.println("結束時間 : " + t2 + " 毫秒");
		// tot = t2 - t1;
		// System.out.println("全部時間 : " + (tot / 1000) + "秒");

		// double d1 = 1234567890.123456;
		//
		// NumberFormat format = NumberFormat.getInstance();
		//
		// System.out.println(format.format(d1));
		// System.out.println(NumberFormat.getInstance().format(d1));
		// System.out.println(NumberFormat.getIntegerInstance().format(d1));
		// System.out.println(NumberFormat.getPercentInstance().format(d1));
		// System.out.println(NumberFormat.getCurrencyInstance().format(d1));

		// double d1 = 1234567890.123456d, d2 = 3.045, d3;
		// d3 = d1 / d2;
		//
		// NumberFormat numberFormat = NumberFormat.getInstance();
		// System.out.println(d1 + " : " + numberFormat.format(d1));
		// System.out.println(d2 + " : " + numberFormat.format(d2));
		// numberFormat.setMaximumFractionDigits(2);
		// numberFormat.setMaximumFractionDigits(1);
		// System.out.println(d1 + " : " + numberFormat.format(d1));
		// System.out.println(d2 + " : " + numberFormat.format(d2));
		// System.out.println(d1 + "/" + d2 + " = " + d3);
		// System.out.println(d1 + "/" + d2 + " = " + numberFormat.format(d3));

		// double d1 = 0.0, d2 = 123456.789;
		// DecimalFormat dFmt =new DecimalFormat("#0.0#");
		// System.out.println(dFmt.format(d1));
		// System.out.println(dFmt.format(d2));
		// DecimalFormat dFmt2 =new DecimalFormat("$#0.0#");
		// System.out.println(dFmt2.format(d1));
		// System.out.println(dFmt2.format(d2));
		// DecimalFormat dFmt3 =new DecimalFormat("$,##0.0#");
		// System.out.println(dFmt3.format(d1));
		// System.out.println(dFmt3.format(d2));

		// Date date = new Date();
		// System.out.println(date);
		// System.out.println(DateFormat.getInstance().format(date));
		// System.out.println(DateFormat.getDateInstance().format(date));
		// System.out.println(DateFormat.getTimeInstance().format(date));
		// System.out.println(DateFormat.getDateTimeInstance().format(date));

		// long sum = 0;
		//
		// for (int i = 0; i < 5; i++) {
		// Date date = new Date();
		//
		//
		// DateFormat dateFormat = new
		// SimpleDateFormat("yyyy年  MM月 dd日 E a H點 m分 s秒  S毫秒 ");
		// System.out.println(date);
		// System.out.println(dateFormat.format(date));
		// }

		// obj_Rectangle rectangle = new obj_Rectangle(5, 10);
		// System.out.println("high = " + 5 + ", wide = " + 10);
		// System.out.println("Area = " + 5 + "*" + 10 + " = "
		// + rectangle.getArea());
		// System.out.println("perimeter = " + rectangle.getPerimeter());
		// rectangle.setHigh(7);
		// System.out.println("high = " + rectangle.getHigh());

		// int[] data = new int[] { 1, 4, 9, 4, 2, 7 };
		// int n1 = 5, n2 = 8;
		// obj_Math math = new obj_Math();
		// System.out.println(math.getMax(n1, n2));
		// System.out.println(math.getMax(data));

		// obj_Account account = new obj_Account("abc");
		// account.setHolderName("Eric");
		// System.out.println("account name = " + account.getAccount());
		// System.out.println("account holder name = " + account.getName());
		//
		// int[] date = account.getDateOfBirth();
		// System.out.println(date[0] + "," + date[1] + "," + date[2]);

		// System.out.print("Please input CD/DVD :");
		// String str = keyin.readLine();
		// obj_CD cd = new obj_CD();
		// obj_DVD dvd = new obj_DVD();
		// cd.toPlay(str);
		// dvd.toPlay(str);

		// System.out.print("Please input score :");
		// int score = Integer.parseInt(keyin.readLine());
		// obj_Student student = new obj_Student();
		//
		// System.out.println(student.getLevel(score));
		// System.out.println(student.getPass(score));

		// System.out.println(obj_ArrayTools.random(0, 5));
		// System.out.print("please input score : ");
		// int score = Integer.parseInt(keyin.readLine());
		// obj_GraduateSchool Graduate = new obj_GraduateSchool();
		// obj_University University = new obj_University();
		// System.out.println(Graduate.getTitle() + Graduate.getPass(score));
		// System.out.println(University.getTitle() +
		// University.getPass(score));

		// obj_Lotto.generateLotto();

		// int n1 = 12, n2 = 2, n3;
		//
		// try {
		// n3 = n1 / n2;
		// System.out.println("result = " + n3);
		// } catch (Exception e) {
		// // TODO: handle exception
		// System.out.println("Error!!");
		// System.out.println(e);
		// } finally {
		// System.out.println("finally");
		// }
		// int[] array = new int[10];
		//
		// try {
		// array[9] = 900;
		// System.out.println(array[9]);
		// array[10] = 1000;
		// System.out.println(array[10]);
		// } catch (ArithmeticException e) {
		// // TODO Auto-generated catch block
		// System.out.println("算術羅輯錯誤");
		// System.out.println(e);
		// e.printStackTrace();
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("陣列索引超出錯誤");
		// System.out.println(e);
		// e.printStackTrace();
		// }

		// thd_thread1 thread = new thd_thread1();
		// thd_thread2 thread2 = new thd_thread2();
		// thread.start();
		// thread2.start();

		// rub_Runnable runnable = new rub_Runnable("Thread 1", 1);
		// rub_Runnable runnable2 = new rub_Runnable("Thread 2", 1);
		// Thread thread = new Thread(runnable);
		// Thread thread2 = new Thread(runnable2);
		// thread.start();
		// thread2.start();

		// System.out.println("Please input String");
		// String str = keyin.readLine();

		// frm_Frame.init_Frame();
		// frm_Frame frame = new frm_Frame();

		// rub_Frame frm = new rub_Frame();
		// Thread thread = new Thread(frm);
		// thread.start();

		keyin.close();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	static double Money(float p, int n) {
		double m;
		m = p * n;
		return m;
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	static void Swap(int x, int y) {
		int t;
		t = x;
		x = y;
		y = t;
		System.out.println("Swap method result");
		System.out.println("x = " + x + " y = " + y);
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	static void Sort(String data[]) {
		String temp;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[j].compareTo(data[j + 1]) > 0) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	static int Recursive(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Recursive(n - 1);
		}
	}
}