package thread_1;

public class ThreadDemoTest {
	public static void main(String[] args) {
		System.out.println("Main thread running... ");
		
		ThreadDemo T1 = new ThreadDemo("Thread-T1-Database_1");
		T1.start();
		
		ThreadDemo T2 = new ThreadDemo("Thread-T2-Email_2");
		T2.start();
		
		System.out.println("==> Main thread stopped!!! ");
	}
}
