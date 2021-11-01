import java.util.*;

public class concanate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter th String :");
		String str=sc.nextLine();
		int count=0,len=0;
		do {
			try {
				char []name=str.toCharArray();
				len=name.length;
				count=0;
				for(int i=0;i<len;i++) {
					if((name[0]==name[i])&& ((name[0]>=97 && name[0]<=122) || (name[0]>=65 && name[0]<=92))) {
						count++;
					}
				}
				if(count!=0) {
					System.out.print(name[0]+" is = "+count+"\n ");
				}
				str=str.replace(""+name[0],"");
			}
			catch(Exception e) {
				System.out.print(e);
			}
		}while(len!=1);
	}

}
