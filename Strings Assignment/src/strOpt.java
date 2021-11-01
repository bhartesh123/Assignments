
public class strOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("String to Lower Case : "+str.toLowerCase());
		System.out.println("\nString to Upper Case : "+str.toUpperCase());
		System.out.println("\nString to Replace 'a' to '$'  : "+str.replace('a','$'));
		String s="collection";
		check(str,s);
		String stt="java string pool refers to collection of strings which are stored in heap memory";
		checkequ(str,stt);
		anomet(str,stt);
	}
    static void check(String str,String s) {
		boolean ab=str.indexOf(s) != -1? true:false;
		if(ab) {
			System.out.print(s+" is found in Orignal String");
		}
		else {
			System.out.println(s+" is not found in Orignal String");
		}
	}
    static void checkequ(String str,String stt) {
    	if(str.equals(stt)) {
    		System.out.println("\nBoth Strings are equal");
    	}
    	else {
    		System.out.println("\nBoth strings are not equal");
    	}
    }
    static void anomet(String str,String stt) {
    	String a=str.toLowerCase();
    	if(a.equals(stt)) {
    		System.out.println("\nBoth Strings are equal");
    	}
    	else {
    		System.out.println("\nBoth strings are not equal");
    	}
    }
	
}
