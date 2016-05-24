package fr.adaming.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.entity.IPerformeur;
import fr.adaming.exceptions.PerformanceException;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestSpringApplication.class, args);
		
		//Chargement conteneur
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Récuperation bean
		IPerformeur performeur = (IPerformeur) context.getBean("Douglas");
		IPerformeur performeurJ = (IPerformeur) context.getBean("Jack");
		
		//utilisation bean
		try {
			performeur.performe();
			performeurJ.performe();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
}
