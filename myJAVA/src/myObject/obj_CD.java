package myObject;

import myInterface.itf_Player;

public class obj_CD implements itf_Player {

	public void toPlay(String disk) {
		// TODO Auto-generated method stub
		if (disk.equals(str1)) {
			System.out.println("現在播放的是\"音樂\"");
		}
	}
}
