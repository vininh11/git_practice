package thread_1;

public class ThreadSimple extends Thread {
	public void run() {
		System.out.println("thread are running...");
	}
	
	public static void main(String[] args) {
		ThreadSimple t1= new ThreadSimple();
		t1.start();
	}
}
