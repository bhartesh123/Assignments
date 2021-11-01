import java.util.*; 
public class CUIprj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int totalAttempts=3,temp=totalAttempts;
		String uname="Bhartesh";
		String pass="Bhartesh@1916";
		System.out.println("-----You Have total "+totalAttempts+" Attempts-----");
		for(int i=1;i<=temp;i++) {
			System.out.println("Enter Your UserName : ");
			String lname=sc.nextLine();
			System.out.println("Enter Your Password : ");
			String pass1=sc.nextLine();
			if(uname.equals(lname) && pass.equals(pass1)) {
				System.out.println("*************Welcome "+lname+" you have successfully logged In ***********");
				break;
			}
			else {
		
				System.out.println("*********Incorrect Login*************");
				 totalAttempts--;
				System.out.println("-----You have now "+totalAttempts+" Attempts-----");
	           
	           // System.out.println(totalAttempts);
	        }
			if (totalAttempts == 0) {
	
				System.out.println("Maximum number of attempts exceeded");
			}
		}
	}

}
