/**
 * 
 */
package fr.adaming.spring.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.spring.demo.SocieteDevLogiciel;

/**
 * @author INTI-0332
 *
 */
public class DemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Chargement conteneur
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("demo-beans.xml");
		
		//Recuperation bean
//		Developpeur developpeur = (Developpeur) context.getBean("developpeur");
//		Developpeur chefDeveloppeur = (Developpeur) context.getBean("chefDeveloppeur");
		SocieteDevLogiciel societe = (SocieteDevLogiciel) context.getBean("societeDevLogiciel");
		
		//Utilisation
		System.out.println("Societe : "
							+"\n\t Chef Developpeur : "+societe.getChefDeveloppeur().getNom()
							+"\n\t Developpeur : "+societe.getDeveloppeur().getNom());

	}

}
