package prog5_1.multithreaded;
/*Private constructor can be used as part of a strategy to 
ensure that only one instance of a class is ever used. 
Such a class is called a singleton. Making a class a 
singleton during design is called using the Singleton
 * */
/*-----------------*/
/* Multi Threaded */
/*-----------------*/
public class MySingleton {
	//to prevent Java Memory Management Problem
	//Object creation with new keyword has several non-atomic hidden operations
	//to prevent inconsistency among multiple threads
	//a thread must see either fully initialized object or simply a null pointer
	
	public static int count = 0;
	//put volatile - if this instance is try to be modified whole process will be atomic process
	//multiple threads will not be able to interfere each other while an object is not totally initialized
	private static volatile MySingleton mySingletonInnerInstance = null;
	
	private MySingleton() {
		//hinder other classes to create an object of this class
		System.out.println(count++);
	}
	//in threading - getInstance method is not synchronized
	//By putting "synchronized" in public static synchronized MySingleton getInstance() { - only one thread may step into this method 
	//but it slow down getInstance() call like 100 times - have to wait thread 1 to complete all steps
	//should synchronized first creating block
	public static  MySingleton getInstance() {
		if(mySingletonInnerInstance == null) {
			//move synchronized to lazy initialization block
			//still - with this synchronized only - both thread can step into lazy initialization block 
			//have to do "double checked locking"
			synchronized(MySingleton.class) {
				if(mySingletonInnerInstance == null) {
					mySingletonInnerInstance = new MySingleton();
				}
			}
			
		}
		return mySingletonInnerInstance;		
	}
	
}
