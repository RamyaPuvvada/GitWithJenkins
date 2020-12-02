package JavaProgramms;

public class reverseMyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BeginnersBook";
		String reveString = "";
		char charStr[] = str.toCharArray();

		for (int i = charStr.length - 1; i >= 0; i--) {
			reveString = reveString + str.charAt(i);
		}

		System.out.println(str);
		System.out.println(reveString);
	}
}