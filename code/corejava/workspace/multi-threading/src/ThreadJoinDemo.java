public class ThreadJoinDemo {
	public static void main(String[] args) {

		System.out.println("Main Thread Started....");
		
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i =1 ; i<=5 ; i++) {
			for(int j =1 ; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Main Thread Ends....");
		
	}
}

class MyThread1 extends Thread {
	public void run() {
		for(int i = 1; i<=10 ; i++) {
			System.out.println(" i = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
