/**
 * 
 */
package fr.adaming.entity;

/**
 * @author INTI-0332
 *
 */
public abstract class Instrument {
	
	private String name;
	
	public abstract void jouer();
	
	//public abstract void jouer(String s);
	
	public String getName() {
			return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
