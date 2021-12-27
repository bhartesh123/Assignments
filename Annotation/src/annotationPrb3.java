import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.text.Annotation;

public class annotationPrb3 {
@Target(ElementType.METHOD)
@interface execute{
	int sequence() default 1;
}
	@execute(sequence=2)
	public void method1() {
		
	}
	@execute(sequence=1)
	public void method2() {
		
	}
	@execute(sequence=3)
	public void method3() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		annotationPrb3 an=new annotationPrb3();
		Class c=an.getClass();
		Annotation ar=new Annotation(execute.class);
		Method[] me=c.getMethods();
		for(Method meth:me) {
			System.out.println("method = " + meth.getName());
		}
	}

}
