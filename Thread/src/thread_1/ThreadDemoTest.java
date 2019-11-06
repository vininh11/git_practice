package thread_1;

public class ThreadDemoTest {
	public static void main(String[] args) {
		System.out.println("Main thread running... ");
		
		ThreadDemo T1 = new ThreadDemo("Thread-T1-Database");
		T1.start();
		
		ThreadDemo T2 = new ThreadDemo("Thread-T2-Email");
		T2.start();
		
		System.out.println("==> Main thread stopped!!! ");
	}
}
