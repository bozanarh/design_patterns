package singletonPattern;

public class Singleton {
	static private Singleton singletonInstance = new Singleton();
	
	//It is important that c-tor is private so nobody outside can call it
	private Singleton(){
	}
	
	static Singleton getInstance(){
		return singletonInstance;
	}
}
