package oddeven;

public class OddEven {

	 public static void main(String[] args) {
	        OddEven oe = new OddEven();
	        
	        Thread evenThread = new Thread(oe.new EvenNumbers());
	        Thread oddThread = new Thread(oe.new OddNumbers());
	        
	        evenThread.start();
	        try {
	            evenThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        oddThread.start();
	    }

	    class EvenNumbers implements Runnable {
	        public void run() {
	            for (int i = 2; i < 20; i += 2) {
	                System.out.println("Even: " + i);
	            }
	        }
	    }

	    class OddNumbers implements Runnable {
	        public void run() {
	            for (int i = 1; i < 20; i += 2) {
	                System.out.println("Odd: " + i);
	            }
	        }
	    }
}
