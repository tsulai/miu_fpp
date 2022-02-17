package prog12_1;

public class IllegalClosedCurveException extends Exception {
	Class className;
	public IllegalClosedCurveException() {
		super();
	}
	public IllegalClosedCurveException(String msg) {
		super(msg);
	}
	public IllegalClosedCurveException(Class className,String msg) {
		super(msg);
		this.className = className;
	}
	public IllegalClosedCurveException(Throwable t){
        super(t);
    }
}
