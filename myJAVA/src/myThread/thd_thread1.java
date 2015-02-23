package myThread;

public class thd_thread1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			long time = (long) Math.floor(Math.random() * 1000);
			System.out.println("thread 1 : " + time + " ms");

			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
