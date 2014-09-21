package myMain;
/**
 * Person 個人資料類別(學號+姓名)
 * @author user
 *
 */
public class Person {

//	private String name;
	protected String name;
	/**
	 * 身高屬性，單位cm
	 */
//	private double height;
	protected double height;
	/**
	 * 體重屬性 ，單位kg
	 */
//	private double weight;
	protected double weight;
	
	public Person(){}
	
	/**
	 * 建構子
	 * @param name
	 */
	public Person(String name){
		this.name = name;
		this.height =175;
		this.weight =75;
	}
	
	/**
	 * 建構子
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Person(String name,double height,double weight){
		this.name = name;
		this.height =height;
		this.weight =weight;
	}
	

	public double getBMI(){
		double result=0;
		//身高公分換成公尺
		double h=this.height/100.0;
		//BMI = 體重(公斤) / 身高^2(公尺^2)
		result=this.weight/(h*h);
		return result;
	}
	
	public String getName(){
		return this.name;
	}
	
	/**
	 * compiler檢查父類別是否有要覆寫的method
	 * 父類別無method否出現錯誤
	 * 
	 */
	@Override
	public String toString(){
		return this.name;
	}
	
	
}
