package it.epicode.pizzeriaspring.pizzeria;
import it.epicode.pizzeriaspring.pizzeria.bean.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PizzeriaApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PizzeriaApplication.class, args);
		Menu menu = ctx.getBean(Menu.class);
		menu.printMenu();
	}
}
