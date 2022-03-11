package day6;
import java.util.Random;

public class RandomColor implements Runnable {

	public static void main(String[] args) {
		RandomColor rc = new RandomColor();
		Thread t1 = new Thread(rc);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}
