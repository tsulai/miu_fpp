package prog10_2;

import java.util.Objects;

/*A rational number is a real number that can be represented as a fraction of the form 
p/q, where q > 0 and both p and q are integers. Although Java has data types for 
integers and floating point numbers, it does not have an explicit data type for rational 
numbers.
 * */
public class Rational implements Comparable<Rational> {
	private int p;
	private int q;
	
	Rational(int p, int q){
		if(q < 1) {
			System.out.println("Denominator value should be greater than 0.");
		}else {
			this.p = p;
			this.q = q;
		}
	}
	
	//adds the rational rat to this Rational
	//5/6 + 8/7 = (5 * 7)/(6*7) + (8*6)/(7*6) = (35+48)/42
	//= 83/42 = p is 83, q is 42
	public Rational add(Rational rat) {//result shoulde be "p/q" format
		return new Rational((p*rat.q + rat.p*q),q*rat.q);
	}
	//multiplies rat by this Rational
	//2/3 * 3/5 = 2 * 3/ 3*5
	public Rational multiply(Rational rat) {
		return new Rational(p * rat.p, q * rat.q);
	}
	//returns –1 if this rational is less than rat
	//returns 0 if this rational equals (see equals 
	// method discussion below) rat
	//returns 1 if this rational is greater than rat
	//1/3 > 3/4 = 4/12 > 9/12 = 4 > 12 == base ညှိ - base ၂ခု တူသွားရင် အပေါ်ကောင်၂ခု ယှဉ်တာနဲ့တူတူပဲ
	@Override
	public int compareTo(Rational rat) {
		if((p * rat.q) > (q*rat.p)) return 1;
		else if((p * rat.q) <(q*rat.p)) return -1;
		else 
			return 0;
	}
	
	@Override 
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Rational)) return false;
		Rational ra = (Rational) ob;
		return q * ra.p == p* ra.q;
	}
	//Mutators and accessors for numerator and denominator
	@Override
	public int hashCode() {
		return Objects.hash(p,q);
	}
	
	@Override
	public String toString() {
		return p+"/"+q;
	}
	//(2/3 * -17/5) + 1/3,
	//2/3 * (-17/5 + 1/3),
	public static void main(String[] args) {
		Rational twoByThree = new Rational(2,3);
		Rational negSevenByFive = new Rational(-17,5);
		Rational oneByThree = new Rational(1,3);
		
		Rational ra1 = (twoByThree.multiply(negSevenByFive)).add(oneByThree);
		Rational ra2 = twoByThree.multiply(negSevenByFive.add(oneByThree));
		
		int result = ra1.compareTo(ra2);
		//Expected output:
		//(2/3 * -17/5) + 1/3 is greater than 2/3 * (-17/5 + 1/3)
		String leftStr = "(" + twoByThree.toString() + " * " + negSevenByFive.toString() + ") + " + oneByThree.toString();
		String rightStr = twoByThree.toString() + " * (" + negSevenByFive.toString() + " + " + oneByThree.toString() + ")";
		switch(result){
			case -1:
				System.out.println(leftStr + " is less than " + rightStr);
				break;
			case 1: 
				System.out.println(leftStr + " is greater than " + rightStr);
				break;
			case 0:
				System.out.println(leftStr + " is equal to " + rightStr);
				break;
			default:
				break;
		}
		
	}
}
