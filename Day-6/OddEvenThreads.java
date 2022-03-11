package day6;

public class OddEvenThreads {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
        try {
        	t.join();
            t2.join();
        }catch(Exception e){
        	e.printStackTrace();
        }
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=2;i<20;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=3;i<20;i+=2) {
           System.out.println(i);
        }
    }
}
