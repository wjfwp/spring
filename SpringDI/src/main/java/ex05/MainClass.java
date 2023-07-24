package ex05;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex06.Airplane;
import ex06.Car;

public class MainClass {

	public static void main(String[] args) {
		
		//의존객체 자동주입 확인
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Printer pt = ctx.getBean(Printer.class);
		System.out.println( pt.getDocument().data );
		
		Airplane air = ctx.getBean(Airplane.class);
		air.getBattery().energy();
		
		Car car = ctx.getBean(Car.class);
		car.getBattery().energy();
		
	}
}
