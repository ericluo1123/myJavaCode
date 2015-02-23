package myObject;

import myInterface.itf_Pass;
import myInterface.itf_ScoreLevel;

public class obj_Student extends obj_Person implements itf_Pass, itf_ScoreLevel {

	public String getPass(int score) {
		// TODO Auto-generated method stub
		String result;
		if (score >= this.score) {
			result = "及格";
		} else {
			result = "不及格";
		}
		return result;
	}

	public String getLevel(int score) {
		// TODO Auto-generated method stub
		String level = null;
		if (score >= this.A) {
			level = "Score level is A";
		} else if (score >= this.B) {
			level = "Score level is B";
		} else if (score >= this.C) {
			level = "Score level is C";
		} else if (score >= this.D) {
			level = "Score level is D";
		} else {
			level = "Score level is E";
		}
		return level;
	}

}
