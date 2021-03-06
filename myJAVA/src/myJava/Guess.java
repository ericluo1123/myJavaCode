package myJava;

/**
 * Class Guess 猜數字類別
 * @author Eric
 *
 */
public class Guess{
	private int answer;

	//隨機產生1~100的數字
	public Guess(){
		answer = ArrayTools.random(1,100);
	}
	
	//傳入數值後取得結果
	public int getJudge(int num){
		int ret =0;
		if(num == this.answer){
			ret=0;
		}
		else if(num < this.answer){
			ret=-1;
		}
		else if(num > this.answer){
			ret=1;
		}
		return ret;
	}
	
	public int gerAnswer(){
		return answer;
	}
}
