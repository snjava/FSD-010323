
public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer obj = new Printer();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread {
	Printer obj;
	Thread1(Printer obj) {
		this.obj = obj;
	}
	public void run() {
		synchronized (obj) {
			for(int i =1; i<=10 ; i++) {
				obj.print("5 * " + i + " = " + (5*i));
				try {
					if(i==5) {
						obj.wait(1000);
					}
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread2 extends Thread {
	Printer obj;
	Thread2(Printer obj) {
		this.obj = obj;
	}
	public void run() {
		synchronized (obj) {
			for(int i =1; i<=10 ; i++) {
				obj.print("12 * " + i + " = " + (12*i));
			}
		//	obj.notifyAll();
		}
	}
}

class Printer {
	public synchronized void print(String value) {
		System.out.println(value);
	}
}
