package myJava;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		// String.substring() & String.equals
		// String letter[] = new String[] { "a", "e", "i", "o", "u" };
		// int count[] = new int[letter.length];
		// String sentence, str;
		//
		// System.out.print("Please input a string : ");
		// sentence = bufferedReader.readLine();
		// System.out.println("lenght = " + sentence.length());
		// for (int i = 0; i < sentence.length(); i++) {
		// str = sentence.substring(i, i + 1);
		// for (int j = 0; j < letter.length; j++) {
		// if (letter[j].equals(str.toLowerCase())) {
		// count[j]++;
		// break;
		// }
		// }
		// }
		// System.out.print("letter:\t");
		// for (int i = 0; i < letter.length; i++) {
		// System.out.print(letter[i] + "\t");
		// }
		// System.out.println();
		// System.out.print("count:\t");
		// for (int i = 0; i < count.length; i++) {
		// System.out.print(count[i] + "\t");
		// }

		// String str1 = new String("汽油,28.7,40");
		// StringTokenizer str2 = new StringTokenizer(str1, ",");
		//
		// String name;
		// int number;
		// double price, money;
		//
		// System.out.println(str2.countTokens() + "個欄位");
		// name = str2.nextToken();
		// price = Double.parseDouble(str2.nextToken());
		// number = Integer.parseInt(str2.nextToken());
		// money = price * number;
		//
		// System.out.print("品名\t單價\t數量\t總金額\n");
		// System.out.print(name + "\t" + price + "\t" + number + "\t" + money);

		String[] problem = new String[] { "2+6=()?", "__you a gril?",
				"床前__ __光,疑是地上霜。" };
		String[] key = new String[] { "8", "Are", "明月" };
		String answer;
		int count = 0;

		for (int i = 0; i < problem.length; i++) {
			System.out.println("第" + (i + 1) + "題的題目是: " + problem[i]);
			System.out.print("請輸入答案 :");
			answer = bufferedReader.readLine();
			if (answer.equals(key[i])) {
				count++;
				System.out.println("答對了!\n");
			} else {
				System.out.println("答錯了!\n正確答案是 : " + key[i] + "\n");
			}

		}
		System.out.print("測驗結果:");
		switch (count) {
		case 0:
			System.out.println("全錯!");
			break;
		case 1:
			System.out.println("對一題!");
			break;
		case 2:
			System.out.println("對二題!");
			break;
		case 3:
			System.out.println("全對!");
			break;
		}

		bufferedReader.close();
	}
}
