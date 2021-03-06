package myJava;
import java.awt.event.ActionListener;

/**
 * Counter 計數器類別
 * @author Eric
 * @since 2014/7/12
 * @version 1.0
 */
public class Counter {
	/**
	 * 成員變數
	 */
	private int count;
	
	/**
	 * 建構子
	 * @param count = 0
	 */
	Counter(){
		count=0;
	}
	/**
	 * 建構子
	 * @param count =傳入值
	 */
	Counter(int count){
		this.count=count;
	}
	
	/**
	 * 取得count值
	 * @return
	 */
	public int getCount(){
		return count;
	}
	
	/**
	 * 將count加1
	 */
	public void incrementCount(){
		count++;
	}
	
	/**
	 * 將count減1，且count不可為負值
	 */
	public void decrementCount(){
		if(count > 0){
			count--;	
		}
	}
	
	/**
	 * 將count設成0
	 */
	public void Clears(){
		count=0;
	}
}
