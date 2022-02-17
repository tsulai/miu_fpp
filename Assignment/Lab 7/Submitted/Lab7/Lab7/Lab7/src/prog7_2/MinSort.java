package prog7_2;

public class MinSort {
	public String sort(String str) {
		if(str == null || str.length() <= 1) return str;
		int minIndex = minpos(str);
		char[] strArr = str.toCharArray();
		//		
		char minTmp = strArr[minIndex];
		strArr[minIndex] = str.charAt(0);//first bottom move to min index
		strArr[0] = minTmp;//verse versa
	
		str = String.valueOf(strArr);//after place exchange
		return str.charAt(0) + sort(str.substring(1));
		//str.charAt(0) for final return string because "a" is settle at first smallest and first place, has to take out from string, no need to include in sort
		//sort(str.substring(1)) is to recurse again without first one
		
	}
	//zwxuabfkafutbbbb
	public int minpos(String str) {//find smallest char inside string
		int index = 0;
		for(int i =0; i<str.length(); i++) {//i keep going					
			if(str.charAt(index) > str.charAt(i)) {//if current index char > char at i(i is > current index)(i is loop count) - store i in var
				//i is position where smallest found after compare				
				index = i;//i is iterator - keep going
			}
		}
		//finally index left with smallest char
		return index;
	}
}
