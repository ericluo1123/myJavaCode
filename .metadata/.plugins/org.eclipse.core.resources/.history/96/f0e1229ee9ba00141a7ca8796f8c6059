package myObject;

import java.text.DecimalFormat;

public class obj_MathTools {

	/**
	 * 取得2教間的最大值
	 * 
	 * @param arg1
	 *            number1
	 * @param arg2
	 *            number2
	 * @return result
	 */
	public int getMax(int arg1, int arg2) {

		return Math.max(arg1, arg2);
	}

	/**
	 * 取得2教間的最大值
	 * 
	 * @param arg1
	 *            number1
	 * @param arg2
	 *            number2
	 * @return result
	 */
	public int getMax(int[] arg) {
		int result = 0;
		for (int i = 0; i < arg.length; i++) {
			if (result < arg[i]) {
				result = arg[i];
			}
		}
		return result;
	}

	/**
	 * 產生n個數由min到不等於max的陣列
	 * 
	 * @param n
	 *            產生陣列的數量
	 * @param min
	 *            數值的最小值等於min
	 * @param max
	 *            數值最大值不等於max
	 * @return ret n個亂數的陣列
	 * 
	 */
	public static int[] random(int n, int min, int max) {
		int[] ret = new int[n];

		for (int i = 0; i < ret.length; i++) {
			// double Math.floor(x), 傳回小於 x的最大整數
			// double Math.random(), 傳回 n, 0<n<1
			do {
				ret[i] = (int) (Math.floor(Math.random() * (max + 1)));
			} while (ret[i] < min);
		}
		return ret;
	}

	/**
	 * 隨機產生範圍min~max的數值
	 * 
	 * @param min
	 * @param max
	 * @return 結果
	 */
	public static int random(int max, int min) {

		if (max <= min) {
			System.out.println("Error!! max <= min");
			System.exit(0);
		}
		DecimalFormat dfmt = new DecimalFormat("#0.0#");
		int result = 0;
		do {
			result = (int) (Math.floor(Double.parseDouble(dfmt.format(Math
					.random())) * (max + 1)));
		} while (result < min || result > max);
		return result;
	}

	/**
	 * 隨機產生陣列內長度範圍min~max的數值，且數值皆不重複
	 * 
	 * @param array
	 * @param min
	 * @param max
	 */
	public static void randomNoRepeat(int[] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			int j = 0, k = 0;
			while (j != -1) {
				k = obj_MathTools.random(12, 1);
				j = obj_ArrayTools.search(array, k);
				if (j == -1) {
					array[i] = k;
				}
			}
		}
	}
}
