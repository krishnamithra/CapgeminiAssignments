package day6;

public class Print1To10 implements Runnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print1To10 p = new Print1To10();
		Thread t = new Thread(p);
		t.start();

	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=6;i<=10;i++) {
			System.out.println(i);
		}
	}

}
