package myObject;

public class obj_Lotto {

	public static void generateLotto() {
		String title = "大樂透 : ";
		int length = 7;
		int max = 49;
		int min = 1;

		int[] data = new int[length];
		int[] contentDate = new int[max];

		System.out.print(title);
		// init content data
		for (int i = 0; i < contentDate.length; i++) {
			contentDate[i] = i + 1;
		}

		for (int i = 0; i < data.length; i++) {

			// 取出max ~min(陣列位置0~48) 中的值, 存入data
			int j = obj_MathTools.random(max - 1, min - 1);
			data[i] = contentDate[j];

			// 將content data 從取出的值之後都往前移補滿
			for (int k = j; k < max - 1; k++) {
				contentDate[j] = contentDate[j + 1];
			}
			// content data 減少一個
			max -= 1;
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			if (i < 5) {
				System.out.print(",");
			} else if(i == 5){
				System.out.print("\t特別號 :");

			}
		}
	}
}
