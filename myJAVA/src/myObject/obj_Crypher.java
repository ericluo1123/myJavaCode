package myObject;

public class obj_Crypher {

	private int n;

	public obj_Crypher() {
		this.n = 10;
	}

	public String Encodeing(String data) {
		char[] charData = data.toCharArray();
		for (int i = 0; i < charData.length; i++) {
			charData[i] += this.n;
		}

		String string = new String(charData);
		return string;
	}

	public String Decondeing(String data) {
		char[] charData = data.toCharArray();
		for (int i = 0; i < charData.length; i++) {
			charData[i] -= this.n;
		}

		String string = new String(charData);
		return string;
	}
}
