import java.util.*;
public class firstLetterUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the string : ");
		str=sc.nextLine();
		String upper="";
		Scanner stt=new Scanner(str);
		while(stt.hasNext()) {
			String word=stt.next();
			upper+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
		}
		System.out.println(str);
		System.out.println(upper);
	}

}
