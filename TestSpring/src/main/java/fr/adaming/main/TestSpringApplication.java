package fr.adaming.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.entity.Performeur;
import fr.adaming.exceptions.PerformanceException;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestSpringApplication.class, args);
		
		//Chargement conteneur
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Récuperation bean
		Performeur performeur = (Performeur) context.getBean("Douglas");
		Performeur performeurJ = (Performeur) context.getBean("Jack");
		
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
