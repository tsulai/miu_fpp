package midterm_practice.ooproblem;

public class Driver {
	public static void main(String[] args) {
		Figure [] objArr = {new HatMaker(),
							new HatMaker(),
							new VeeMaker(),
							new ParallelMaker(),
							new FaceMaker()};		
		
		new Driver(objArr);
	}
	public Driver(Figure[] figures){
		final String SPACE = " ";
		
		for(Figure f : figures) {
			System.out.print(f.getFigure() + SPACE);
		}
//non-polymorphic	
//		for(Object o : figures){
//			if(o instanceof HatMaker) {
//				HatMaker h = (HatMaker)o;
//				System.out.print(h.getFigure()+SPACE);
//			}
//			if(o instanceof VeeMaker) {
//				VeeMaker v = (VeeMaker)o;
//				System.out.print(v.getFigure()+ SPACE);
//			}
//			if(o instanceof ParallelMaker) {
//				ParallelMaker p = (ParallelMaker)o;
//				System.out.print(p.getFigure()+ SPACE);
//			}
//		}
	}

}
