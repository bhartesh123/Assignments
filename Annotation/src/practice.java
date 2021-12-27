import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.*;
/*@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface harshu{
	String name() default "Following Method is test-Case ";
	int id() default 10;
}
*/
interface Add{
	void oo(String s);
	//int foo();
	
}
/*class hello implements Add{
	
	@Override
	public void oo() {
		// TODO Auto-generated method stub
		System.out.println("OverRiden Method");
	}
}*/
public class practice {
	/*@harshu
	static void Test() {
		practice p=new practice();
		Class<?> c=p.getClass();
		try {
			Method m=c.getMethod("Test");
			Annotation a=m.getAnnotation(harshu.class);
			//harshu h=(harshu)a;
			System.out.println(a);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}*/
	
	public static void main(String[] args) {
		
		Add lambda=(a) ->{System.out.println("This is Lambda "+a);
			System.out.println("This is 2nd line of Lambda");
			System.out.println("Length is "+a.length());
		};
		lambda.oo("Hello");
	}

}

