package prog5_2;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	//top constructor	
	Top(){
		mid = new Middle();//ပုံမှန်အတိုင်းပဲ ကြေညာ
		midbot = mid.new Bottom();//inner inner နှစ်ဆင့်ဖြစ်သွားတဲ့အတွက် 
	}
	//returns the value in the instance vble of Bottom
	int readBottom() {
		//implement	- DONE	
		return midbot.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance vble in Top and 
		//instance vble in Bottom
		int addTopAndBottom() {
			//implement - DONE
			Top tp = new Top(); //ပုံမှန်အတိုင်းပဲ ကြေညာ
			Bottom bt = new Bottom();			
			return tp.t + bt.b;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement - DONE				
				return Middle.this.m * Top.this.t * this.b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();// top တစ်ခု ကြေငြာထား - အောက်ကကောင်တွေကို constructor မှာ instantiate လုပ်ထားရင် သူ့ထဲကmethod တွေ ခေါ်သုံးလို့ရ

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}

}