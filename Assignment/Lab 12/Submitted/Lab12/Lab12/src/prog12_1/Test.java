package prog12_1;

public class Test {
	
	public static void main(String[] args) throws IllegalClosedCurveException {
		ClosedCurve[] objects = new ClosedCurve[0];
		try {
			objects = new ClosedCurve[] {new Triangle(4,5,6),
					 new Square(-3),
					 new Rectangle(3,7),
					 new Circle(3)};
			
		}catch(IllegalTriangleException e){
			System.out.println("An IllegalTriangleException was thrown in a Triangle instance. ");
			
		}catch(IllegalClosedCurveException e) {
			//System.out.println(getClassNameNoPackage(e.className));	
			System.out.println("An IllegalClosedCurveException was thrown in a " + getClassNameNoPackage(e.className) + " instance.");
		}
		
		
		
	}
	public static String getClassNameNoPackage(Class aClass){
		//System.out.println(aClass);
        String fullClassName = aClass.getName();
        int index = fullClassName.lastIndexOf('.');
        String className = null;
        String packageName = null;
        
        
        //in this case, there is no package name
        if(index==-1) {
            return fullClassName;
        }
        else {
			//for other apps, may be useful to have this
            packageName = fullClassName.substring(0,index);

            className = fullClassName.substring(index+1);
            return className;
        }    
	    	

	}

}
