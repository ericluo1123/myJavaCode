package myRunnable;

public class rub_Runnable implements Runnable {

	private String name;
	private int num;

	public rub_Runnable(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			long time = (long) Math.floor(Math.random() * 1000);
			System.out.println(name + " : " + time + "ms");
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
