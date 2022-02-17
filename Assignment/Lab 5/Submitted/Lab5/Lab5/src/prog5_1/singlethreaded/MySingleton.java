package prog5_1.singlethreaded;
/*Private constructor can be used as part of a strategy to 
ensure that only one instance of a class is ever used. 
Such a class is called a singleton. Making a class a 
singleton during design is called using the Singleton
 * */
/*-----------------*/
/* Single Threaded */
/*-----------------*/
public class MySingleton {
	//only way to create the object of this class will be through method "getInstance"
	
	public static int count = 0;
	//create static reference instance for this own class type
	private static MySingleton mySingletonInnerInstance = null;
	
	private MySingleton() {
		//hinder other classes to create an object of this class
		System.out.println("Number of instances created: " + count);
	}
	//to return MySingleton object 
	public static MySingleton getInstance() {
		if(mySingletonInnerInstance == null) {
			count++;
			mySingletonInnerInstance = new MySingleton();			
		}
		return mySingletonInnerInstance;		
	}
	
}
