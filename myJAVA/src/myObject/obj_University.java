package myObject;

import myInterface.itf_Pass;

public class obj_University implements itf_Pass {

	private String title = "大學成續  : ";

	public String getPass(int score) {
		// TODO Auto-generated method stub
		String result = null;
		if (score < this.score) {
			result = "不及格";
		} else {
			result = "及格";
		}
		return result;
	}

	public String getTitle() {
		return this.title;
	}
}
