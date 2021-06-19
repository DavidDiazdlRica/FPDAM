package Springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	
	public static void main(String[]args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("New.xml");
		prueba obj = (prueba)context.getBean("Prueba");
		obj.mostrar();
	}

}
