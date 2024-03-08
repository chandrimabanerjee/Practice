package Day2;

import java.lang.reflect.Method;

class ReflectE{
	public void show() {
		System.out.println("In show");	}
}
public class ReflectionExample {

	public static void main(String[] args) {
		ReflectE s= new ReflectE();
		Class c= s.getClass();
		String name= c.getName();
		System.out.println(name);//print classname
		//print method name
		Method m[]=c.getDeclaredMethods();
		for(Method e: m)
		System.out.println(e.getName());
		
	}

}
