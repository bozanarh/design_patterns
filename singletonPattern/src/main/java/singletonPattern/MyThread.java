package singletonPattern;


public class MyThread implements Runnable {
	private int id;
	
	private static Long sharedVariable = new Long(0);
	
	MyThread(int myId){
		this.id = myId;
	}
	

	public void run() {
		ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
		
		Long val = singleton.getCount();
		
		System.out.println("Thread " + id + " got singleton: " + singleton.toString()
				+ " and sharedVariable: " + val);
	}
}
