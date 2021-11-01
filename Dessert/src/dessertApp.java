import java.util.*;
public class dessertApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Who are You :\n");
		System.out.println("1: Owner:\n2:Customer:");
		n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("---Add Desert Item---");
			//int a=sc.nextInt();
			
				System.out.println("What you want to add :\n1: Candy\n2:Ice-Cream\n3:Cookies");
				int b=sc.nextInt();
				String name;
				double price;
				switch(b) {
					case 1:
						
						System.out.println("Enter Name of Item :");
						name=sc.nextLine();
						System.out.println("Enter Price of Item including tax :");
						price=sc.nextDouble();
						System.out.println("Enter Weight of Item :");
						double weight=sc.nextDouble();
						candy cand=new candy(name,price,weight);
						/*List <candy> can=new ArrayList<>();
						can.add(cand);*/
						cand.add();
						break;
					case 2:
						//String name;
						System.out.println("Enter Name of Item :");
						name=sc.nextLine();
						System.out.println("Enter Price of Item including tax :");
						 price=sc.nextDouble();
						icecream ice=new icecream(name,price);
						//List <candy> can=new ArrayList<>();
						//can.add(cand);
						ice.add();
						break;
					case 3:
						System.out.println("Enter Name of Item :");
						name=sc.nextLine();
						System.out.println("Enter Price of Item including tax :");
						 price=sc.nextDouble();
						cookies cook=new cookies(name,price);
						cook.add();
						break;
						default:
							break;
				}
				break;
		case 2:
			System.out.println("-------Welcome------");
			System.out.println("1:Candy- 120rs or $2\n2:Ice-Cream-40rs\n3:Cookies-60rs");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("\nCandy has Placed Successfully ");
				break;
			case 2:
				System.out.println("\nIce-Cream has Placed Successfully ");
				break;
			case 3:
				System.out.println("\nCookies has Placed Successfully ");
				break;
				default:
					break;
			}
			break;
				
			
			
		}
	}

}
