/**
 * 
 */
package fr.adaming.entity;

import fr.adaming.exceptions.PerformanceException;

/**
 * @author INTI-0332
 *
 */
public class Musicien implements Performeur {
	
	private String morceau;
	private Instrument instrument;
	
	
	public String getMorceau() {
		return morceau;
	}



	public void setMorceau(String morceau) {
		this.morceau = morceau;
	}



	public Instrument getInstrument() {
		return instrument;
	}



	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}



	public void performe() throws PerformanceException {
		System.out.println("Va jouer "+morceau+" au "+instrument.getName()+" :");
		instrument.jouer();
		//instrument.jouer("test");
		if(!morceau.equals("Vive le vent"))
			throw new PerformanceException();
	}

}
