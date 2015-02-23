package myObject;

public class obj_Rectangle {

	private int high;
	private int wide;
	private int area;
	private int peri;

	obj_Rectangle() {
		this.high = 0;
		this.wide = 0;
		this.area = 0;
		this.peri = 0;
	}

	obj_Rectangle(int high, int wide) {
		this.high = high;
		this.wide = wide;
		this.area = this.high * this.wide;
		this.peri = (this.high + this.wide) * 2;
	}

	public int getHigh() {
		return this.high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWide() {
		return this.wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	public int getPerimeter() {
		return this.peri;
	}

	public int getArea() {
		return area;
	}

}
