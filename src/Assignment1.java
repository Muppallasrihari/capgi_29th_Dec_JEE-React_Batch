/**
 * Display String in reverse order word by word
 * @author srihari muppalla
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);
		

	}

	private static String reverseString(String input) {
		String s1[]=input.split(" ");
		String reverse="";
		for(int i=s1.length-1;i>=0;i--) {
			reverse+=s1[i]+" ";
		}
		return reverse;
	}

}
