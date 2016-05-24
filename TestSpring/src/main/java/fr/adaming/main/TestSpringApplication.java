package fr.adaming.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.entity.Performeur;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestSpringApplication.class, args);
		
		//*************TEST IoC***********
		
		//Chargement conteneur
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Récuperation bean
		Performeur performeur = (Performeur) context.getBean("Douglas");
		
		//utilisation bean
		performeur.performe();
	}
}
