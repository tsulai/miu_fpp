package prog7_1;

public class Exponential {
	
	public static double power(double x,int n) {
		double exp = 1;
		if(n < 0 )
			return 0.0;
		if(n == 1)
			return exp*x;
		return x*power(x, n-1);
	}
}
