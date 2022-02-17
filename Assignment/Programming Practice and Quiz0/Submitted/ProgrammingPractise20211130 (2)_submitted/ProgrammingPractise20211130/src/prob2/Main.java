package prob2;

public class Main {

	public static void main(String[] args) {

		FirstClass fc = new FirstClass(Status.SILVER);
		BusinessClass bc = new BusinessClass(Status.GOLD);
		EconomyClass ec = new EconomyClass(441);
		BoardingTime[] objs = { fc, bc, ec };
		//expected output: 26.7
		System.out.println(Main.computeAverageBoardingTime(objs));

	}

	//Modify this code
	public static double computeAverageBoardingTime(Object[] objs) {
		double sum = 0;
		BoardingTime[] BTObjs = (BoardingTime[]) objs;
		
		for(BoardingTime bt: BTObjs) {
			sum += bt.computeBoardingTime();
		}		

		return sum / objs.length;
	}
}
