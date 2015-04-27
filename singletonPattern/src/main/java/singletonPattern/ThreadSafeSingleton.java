package singletonPattern;

/*
 * Notes:
 * 4 ways to use synchronized:
 * - on instance method (blocks entire instance while accessing code inside the method. If there
 *   are multiple instances, then the one that is executed will be locked)
 * - on static method (blocks entire class; one class only, so only 1 thd can access at the time)
 * - code block inside instance - depends what you use as synchronized object. If you have 2 synchronized
 *   methods in an object and you use "this", it will lock entire instance while accessing shared block
 *   of code. So only one block will execute at a time. Better solution - you can create own synchronized
 *   objects and use them.
 * - code block inside static method - again will block entire class if you use this.class. Better way
 *   create new synchronized object.
 * - synchronized objects cannot and should not be something that changes over the time. 
 */
public class ThreadSafeSingleton {
	//Must be volatile - tells java NOT to cache the value and use it directly from the main memory
	//so it is synced on access
	private volatile static ThreadSafeSingleton singletonInstance;
	private final Object mutex;
	private Long count = 0L;
	
	private ThreadSafeSingleton(){
		mutex = new Object();
	}
	
	//using double locking approuch !
	static public ThreadSafeSingleton getInstance(){
		if( singletonInstance == null ){
			synchronized (ThreadSafeSingleton.class) {
				//has to check again because thread could be preemted just before previous line
				if( singletonInstance == null ){
					singletonInstance = new ThreadSafeSingleton();
				}
			}
		}	

		return singletonInstance;
	}
	
	public Long getCount(){
		synchronized (mutex) {
			return ++count;
		}
	}
}
