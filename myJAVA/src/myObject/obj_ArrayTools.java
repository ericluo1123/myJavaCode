package myObject;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;

/**
 * ArrayTools(陣列常用工具庫)
 * 
 * @author user
 * @since 2014/6/29
 * @version 1.0
 */
public class obj_ArrayTools {

	/**
	 * 將一維字元陣列array 印出來並在每字元中加入\t
	 * 
	 * @param array
	 *            要印出的陣列
	 */
	public static void print(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	/**
	 * 將一維整數陣列array 印出來並在每字元中加入\t
	 * 
	 * @param array
	 *            要印出的陣列
	 */
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	/**
	 * 將二維整數array 印出來並在每字元中加入\t
	 * 
	 * @param array
	 *            要印出的陣列
	 */
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * 將array製一份新的出來
	 * 
	 * @param array
	 *            要被複製的陣列
	 * @return ret 複製的新陣列
	 */
	public static int[] clone(int[] array) {
		int[] ret = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			ret[i] = array[i];
		}
		return ret;
	}

	/**
	 * 複製二維陣列
	 * 
	 * @param array要被複製的陣列
	 * @return ret複製的新陣列
	 */
	public static int[][] clone(int[][] array) {
		int length = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].length > length) {
				length = array[i].length;
			}
		}
		int[][] ret = new int[array.length][length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				ret[i][j] = array[i][j];
			}
		}
		return ret;
	}

	/**
	 * 找出一維陣列中最大值
	 * 
	 * @param array
	 *            要被執行的一維陣列
	 * @return max 最大值
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * 找出一維陣列中最小值
	 * 
	 * @param array
	 *            要被執行的一維陣列
	 * @return min 最小值
	 */
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * 將一維陣列內容作總和
	 * 
	 * @param array
	 *            要被執行的一維陣列
	 * @return sum 總和值
	 */
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	/**
	 * 判斷傳入陣列1，陣列2是否equals(等於)
	 * 
	 * @param array
	 * @return ret 結果
	 */
	public static boolean equals(int[] array1, int[] array2) {
		boolean ret = true;
		if (array1.length != array2.length) {
			ret = false;
			// return false;
		} else {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					ret = false;
					break;
					// return false;
				}
			}
		}
		// ret=Arrays.equals(array1,array2); 使用arrays 類別
		return ret;
	}

	/**
	 * reverse 將整數陣列內容反轉
	 * 
	 * @param array
	 *            要被執行的一維陣列
	 */
	public static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int j = array.length - 1 - i;
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	/**
	 * reverse 將字元陣列內容反轉
	 * 
	 * @param array
	 *            要被執行的一維陣列
	 */
	public static void reverse(char[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int j = array.length - 1 - i;
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	/**
	 * toUpperorLower將一維字元陣列內容作大小寫轉換
	 * 
	 * @param array
	 *            要被執行的一維陣列
	 * @return ret 結果
	 */
	public static void toUpperorLower(char[] array) {
		for (int i = 0; i < array.length; i++) {
			// if是大寫就轉成小寫，else轉成大寫
			if (Character.isUpperCase(array[i])) {
				array[i] = Character.toLowerCase(array[i]);
			} else {
				array[i] = Character.toUpperCase(array[i]);
			}
		}
	}

	/**
	 * 將字元陣列轉成字串
	 * 
	 * @param array
	 *            要被執行的一維陣列
	 * @return ret 結果
	 */
	public static String toString(char[] array) {
		String ret = new String(array);
		/*
		 * for(int i=0;i<array.length;i++){ ret+=array[i]; }
		 */
		return ret;
	}

	/**
	 * 在array中找value的位置
	 * 
	 * @param array
	 *            被找的陣列
	 * @param value
	 *            要找的值
	 * @return ret 若value在陣列中就回傳value的位置，否則回傳-1
	 */
	public static int search(int[] array, int value) {
		int ret = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return ret;
	}

}
