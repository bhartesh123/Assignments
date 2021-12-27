//import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface test{
	String s() default "Annotation that ' '";
}

//@test(s="Annotation that 'This method is Test-Case'")
public class annotationPrb1 {
	@test(s="Annotation that 'This method is Test-Case'")
	public static  void test_case(){
		annotationPrb1 t=new annotationPrb1();
		Class<?> c=t.getClass();
		try {
			Method obj=c.getMethod("test_case");
			Annotation an=obj.getAnnotation(test.class);
			System.out.println(an);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		System.out.println("This is Test Class ");
	}
	
		public static void main(String[] args) {
		test_case();
		//t.test_case();
			
		//@SuppressWarnings("unchecked")
		/*Annotation a=obj.getAnnotation(test.class);
		test s=(test)a;
		System.out.println(s.s());*/
	}

}