
public class BooleanExample{
	public static void main(String[] args){
		boolean isTrue = false;
		isTrue = true;
		isTrue = 10 > 5;
		
		int num1, num2;
		num1 = 19;
		num2 = 29;
		
		isTrue = num1 > num2;
		
		if (isTrue){
			System.out.println(num1 + " is larger than " + num2);
		}
		else{
			System.out.println(num2 + " is larger then " + num1);
		}
		
		int bit1 = 10;
		int bit2 = ~bit1 + 1;
		System.out.println(bit2);
	}
}