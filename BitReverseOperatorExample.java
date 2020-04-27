//java1 add
public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = v2 + 1;
		String returnValue = toBinaryString(v1);
		System.out.println(returnValue);

		returnValue = toBinaryString(v2);
		System.out.println(returnValue);

		returnValue = toBinaryString(v3);
		System.out.println(returnValue);

		returnValue = toBinaryString(v1 + v3);
		System.out.println(returnValue);
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}