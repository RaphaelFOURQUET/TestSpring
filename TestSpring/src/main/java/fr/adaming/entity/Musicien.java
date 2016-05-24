/**
 * 
 */
package fr.adaming.entity;

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



	public void performe() {	//TODO exception
		System.out.println("Va jouer "+morceau+" au "+instrument.getName()+" :");
		instrument.jouer();
		//instrument.jouer("test");
	}

}
