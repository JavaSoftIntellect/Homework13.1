import java.util.Scanner;

public class Main implements Runnable {

	public void run() {
		System.out.println("The thread complete!");
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		System.out.println("Input seconds:");
		int Q = in.nextInt();
		Q *= 1000;

		Main r = new Main();

		Thread t1 = new Thread(r);
		t1.setName("T1");
		Thread t2 = new Thread(r);
		t2.setName("T2");
		Thread t3 = new Thread(r);
		t3.setName("T3");
		Thread t4 = new Thread(r);
		t4.setName("T4");
		Thread t5 = new Thread(r);
		t5.setName("T5");

		t1.run();
		System.out.println("My name is:" + t1.getName());
		Thread.sleep(Q);
		t2.run();
		System.out.println("My name is:" + t2.getName());
		Thread.sleep(Q);
		t3.run();
		System.out.println("My name is:" + t3.getName());
		Thread.sleep(Q);
		t4.run();
		System.out.println("My name is:" + t4.getName());
		Thread.sleep(Q);
		t5.run();
		System.out.println("My name is:" + t5.getName());

		in.close();
	}
}