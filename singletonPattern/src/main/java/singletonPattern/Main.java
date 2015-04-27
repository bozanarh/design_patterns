package singletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	private static void usePreCreatedSingleton(){
		System.out.println("Using pre-create singleton, one thread only");
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1);

		Singleton obj2 = Singleton.getInstance();
		if( obj1.equals(obj2)){
			System.out.println("obj and obj2 are the same");
		}
	}
	
	private static void useOnDemandSingleton(){
		final int NUM_THDS = 30;
		System.out.println("Using thread pull with ThreadSafeSingleton");
		//create all threads
		ExecutorService threadPool = Executors.newFixedThreadPool(NUM_THDS);
		for( int i=0; i<NUM_THDS; i++){
			Runnable thd = new MyThread(i);
			threadPool.execute(thd);
		}
		//initiate shutdown and do not accept new tasks
		threadPool.shutdown();
		if( ! threadPool.isTerminated()){
			try {
				threadPool.awaitTermination(30, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
				//just force shutdown
				threadPool.shutdownNow();
			}
		}
		//no more waiting they should finish by now
		threadPool.shutdownNow();
	}
	
	public static void main(String[] args) {
		//using singleton which is created at the startup
		usePreCreatedSingleton();
		
		//using singleton that gets created when we call it
		//and it is shared among multiple threads
		useOnDemandSingleton();
		
		System.out.println("Done");
	}

}
