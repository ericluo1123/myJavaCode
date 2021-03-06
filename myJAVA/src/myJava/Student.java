package myJava;


/**
 * class Student 
 * 四筆資料:
 * 姓名	String name
 * 國文成績	int chinese
 * 英文成績	int english
 * 數學成績	int math
 * 兩個方法:
 * 計算總合	int gerSum()
 * 計算平均	double gerAverage()
 * @author Eric
 *
 */
public class Student extends Person{

	private int chinese;
	private int english;
	private int math;
	private int sum;
	private double average;
	
	
	public Student(String name,int chinese,int english,int math){
		try{
			if(chinese < 0 || english<0 || math<0){
				throw new Exception("數字為負");
			}
			else if(chinese >100|| english>100 || math>100){
				throw new Exception("數子大於100");
			}
			this.name=name;
			this.chinese=chinese;
			this.english=english;
			this.math=math;
			
		}catch (java.lang.ClassCastException e) {
			System.out.println("無效的強制轉換");
			System.out.println("例外:" + e.toString());
		}catch (java.lang.IllegalArgumentException e) {
			System.out.println("傳入參數型態不符");
			System.out.println("例外:" + e.toString());
		}catch (Exception e) {
			
			System.out.println("例外:"+e.toString());
			System.out.println("例外:"+e.getMessage());	
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getMath(){
		return this.math;
	}
	
	public int getChinese(){
		return this.chinese;
	}
	
	public int getEnglish(){
		return this.english;
	}
	
	public int getSum(){
		return sum=this.chinese+this.english+this.math;
	}
	
	public double getAverage(){
		return average=getSum()/3.0;
	}
	
	@Override
	public String toString(){
		String ret= "";
		ret += this.name+"\t";
		ret += this.chinese+"\t";
		ret += this.english+"\t";
		ret += this.math+"\t";
		ret += this.getSum()+"\t";
		ret += this.getAverage()+"\t";
		return ret;
	}
}
