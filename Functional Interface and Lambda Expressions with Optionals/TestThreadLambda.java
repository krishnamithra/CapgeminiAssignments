package FunctionalInterfaceAndLambda;

public class TestThreadLambda {
	   public static void main(String args[]) {
		// Child thread
		      new Thread(() -> { // Lambda Expression
		         for(int i=1; i <= 5; i++) {
		            System.out.println("A Thread prints: "+ "A" + i);
		            try {
		               Thread.sleep(5000);
		            } catch(Exception e) {
		               e.printStackTrace();
		            }
		         }
		      }).start();
		      
		      new Thread(()->{
		    	  for(int i=1;i<=5;i++) {
		    		  System.out.println("B Thread prints:" + "B" + i);
		    		  try {
		    			  Thread.sleep(5000);
		    		  } catch(Exception e) {
		    			  e.printStackTrace();
		    		  }
		    	  }
		      }).start();
		      
		      

	   }
}	      
