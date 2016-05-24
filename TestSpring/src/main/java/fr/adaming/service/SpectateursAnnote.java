package fr.adaming.service;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SpectateursAnnote {
	
	@Pointcut("execution(* *.performe(..))")
	public void performance() {}
	
	@Before("performance()")
	public void prendPlace() {
		System.out.println("Les spectateursA prennent place !");
	}
	
	@Before("performance()")
	public void eteindreTelephonesPortables() {
		System.out.println("Les spectateursA éteignent leurs téléphones !");
	}
	
	@AfterReturning("performance()")
	public void applaudit() {
		System.out.println("Les spectateursA applaudissent : Bravo !");
	}
	
	@AfterThrowing("performance()")
	public void demandeRemboursement() {
		System.out.println("SpectateursA : Bouh ! Remboursez !");
	}
	
//	@Around("execution(* *.performe(..))")
//	public void toto() {
//		System.out.println("Toto n'est pas content !");
//	}

}
