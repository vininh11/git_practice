package thread_1;

public class ThreadSimple_2 implements Runnable {
	public void run() {
		System.out.println("thread are running...");
	}
	
	public static void main(String[] args) {
		ThreadSimple_2 runable = new ThreadSimple_2();
		Thread t1 = new Thread(runable);
		t1.start();
	}
}
