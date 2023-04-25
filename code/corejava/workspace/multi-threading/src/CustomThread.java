public class CustomThread {
	public static void main(String[] args) {
		System.out.println("main Thread STARTED...");
		MyThread thread = new MyThread(); // New/Born Stage
		thread.setName("TestThread");
		thread.setPriority(10);
		thread.start();		// Runnable Stage
		System.out.println("main Thread ENDS...");
	}
}

class MyThread extends Thread {
	public void run() {		// Running
		System.out.println("Custom Thread STARTED...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread());
		System.out.println("Custom Thread ENDS...");
	}
}