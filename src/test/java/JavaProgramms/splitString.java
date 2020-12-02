package JavaProgramms;
public class splitString {

	public static void main(String[] args) {
		
		String str = "Ramya Puvvada";
		String[] words = str.split(" ");
		
		for(String allWords : words)
		{
			System.out.println(allWords);
		}
	}
}