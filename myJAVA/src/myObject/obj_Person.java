package myObject;

public class obj_Person {

	private String name;
	private double height;
	private double weight;
	private int age;
	private int YearOfBirth;
	private int MonthOfBirth;
	private int DayOfBirth;

	obj_Person() {
		this.name = "No name";
		this.height = 0;
		this.weight = 0;
		this.age = 0;
		this.YearOfBirth = 0;
		this.MonthOfBirth = 0;
		this.DayOfBirth = 0;
	}

	obj_Person(String name, double height, double weight, int age, int year,
			int month, int day) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.YearOfBirth = year;
		this.MonthOfBirth = month;
		this.DayOfBirth = day;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	public int[] getDateOfBirth() {
		int[] date = new int[3];

		date[0] = this.YearOfBirth;
		date[1] = this.MonthOfBirth;
		date[2] = this.DayOfBirth;

		return date;
	}
}
