import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int AuthorID();
	String Author() default "Author is default";
	String Supervisor() default "Supervisor is optional";
	String Date();
	String Time();
	int version();
	String Description() default "Description of the class, Method or Field";
}
@info(AuthorID=123,Date="01-11-2021",Time="02:12:92",version=8,Description="This is Annotation  Class")
class exp{
	@info(AuthorID=123,Date="01-11-2021",Time="02:12:92",version=8,Description="This is Annotation  Method")
	public void abc() {
		exp e=new exp();
		Class c=e.getClass();
		try {
			Method m=c.getMethod("abc");
			Annotation an=m.getAnnotation(info.class);
			info i=(info)an;
			System.out.println(i.AuthorID()+" "+i.Description());
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
	public void abc(@info(AuthorID=123,Date="01-11-2021",Time="02:12:92",version=8)String Name) {
		
	}
}
public class annotationPrb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp ex=new exp();
		
		Class c=ex.getClass();
		Annotation a=c.getAnnotation(info.class);
		info an=(info)a;
		System.out.println(an.AuthorID()+" "+an.Description());
		ex.abc();
	}

}
