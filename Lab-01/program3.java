import java.util.*;

class BMSCE implements Runnable {
	Thread t;
	BMSCE() {
		t = new Thread(this);
		t.start();	
	}
	boolean state=true;
	public void run() {
		try {
				while(true) {
					System.out.print("B.M.S College Of Engineering.\n");
					Thread.sleep(10000);
				}
			}
		catch(InterruptedException ie) {
			System.out.println("Exiting>!");
		}
	}
}

class Branch implements Runnable {
	Thread t;
	Branch() {
		t = new  Thread(this);
		t.start();
	}
		public void run() {
		try {
				while(true) {
					System.out.print("CSE\n");
					Thread.sleep(2000);
				}
			}
		catch(InterruptedException ie) {
			System.out.println("Exiting.!");
		}
	}
}

class program3 {
	public static void main(String args[]) {
		BMSCE b = new BMSCE();
		Branch br = new Branch();
		try {
			b.t.join();
			br.t.join();
		}
		catch(InterruptedException ie) {
			System.out.println("Exiting");
		}
		System.out.println();
	}
}