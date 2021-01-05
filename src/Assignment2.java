/**
 * From the provided url, your app should display command
 * @author srihari muppalla
 *
 */
public class Assignment2 {

	public static void main(String[] args) {
		String url1 = "www.codegram.in/admin/reports/daywiseuser.php";
		String url2 = "www.codegram.in/guest/registration.php";
		String url3 = "www.codegram.in/about.php";
		String command=null;
		
		command = showCommand(url1);
		System.out.println("Command is : "+command);
		
		command = showCommand(url2);
		System.out.println("Command is : "+command);
		
		command = showCommand(url3);
		System.out.println("Command is : "+command);

	}

	private static String showCommand(String url) {
		int index1=url.lastIndexOf('/');
		int index2=url.lastIndexOf('.');
		String command=url.substring(index1+1, index2);
		return command;
	}

}