import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		

		counter.decreaseBy(3);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(2);
=======
		counter.decreaseBy(2);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(6);
		
		System.out.println("Current count:" + counter.getCount());

		System.out.println("Current count:" + counter.getCount());
		
		counter.decreaseBy(2);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(6);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
