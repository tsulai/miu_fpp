package pencil_source;
/*
 * When you run the following code, you discover that the version of the clone() method that 
the class Inner uses in its innerMethod() is the one in Object, not the version in the 
enclosing class. Show (by doing) how to modify the code inside innerMethod() to force 
the code to use the clone() method of Enclosing. Verify (in Eclipse) that your solution is 
correct. (The code shown below is provided in the folder for this lab.)

 * */
public class Enclosing implements Cloneable {
	public Enclosing clone() throws CloneNotSupportedException {
		System.out.println("Inside Enclosing.clone()");
		return (Enclosing)super.clone();
	}
	class Inner implements Cloneable{
		void innerMethod() throws CloneNotSupportedException {
			Object copy = Enclosing.this.clone();//from inner to outer access
			System.out.println(copy.getClass().getName());
			
		}
	}
	public static void main(String[] args){
		Enclosing p1 = new Enclosing();
		Enclosing.Inner i1 = p1.new Inner();
		try {
			i1.innerMethod();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}
