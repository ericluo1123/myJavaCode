package myObject;

public class obj_Person {

	private String ChineseName;
	private String EnglishName;
	private double height;
	private double weight;
	private int age;
	private int YearOfBirth;
	private int MonthOfBirth;
	private int DayOfBirth;
	private String sex;

	obj_Person() {
		this.ChineseName = "No name";
		this.height = 0;
		this.weight = 0;
		this.age = 0;

	}

	public obj_Person(String name) {
		this.ChineseName = name;
	}

	// name
	public void setName(String name) {
		this.ChineseName = name;
	}

	public String getName() {
		return this.ChineseName;
	}

	// height
	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// height
	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	// year
	void setYearOfBirth(int year) {
		this.YearOfBirth = year;
	}

	int getYearOfBirth() {
		return this.YearOfBirth;
	}

	// month
	void setMonthOfBirth(int month) {
		this.MonthOfBirth = month;
	}

	int getMonthOfBirth() {
		return this.MonthOfBirth;
	}

	// day
	void setDay(int day) {
		this.DayOfBirth = day;
	}

	int getDayOfBirth() {
		return this.DayOfBirth;
	}

	// age
	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return this.age;
	}

	// sex
	void setSex(String sex) {
		this.sex = sex;
	}

	String getSex() {
		return this.sex;
	}
}
