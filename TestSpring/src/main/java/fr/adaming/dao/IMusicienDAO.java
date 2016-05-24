package fr.adaming.dao;

import fr.adaming.entity.Musicien;

public interface IMusicienDAO {
	
	public Musicien findMusicienByName();
	
	public void save();
	
	public void edit();
	
	public void delete();

}
