package fr.adaming.dao;

import fr.adaming.entity.Musicien;

public interface IMusicienDAO {
	
	public Musicien findMusicienById(int id);
	
	public Musicien findMusicienByName(String name);
	
	public void saveMusicien(Musicien musicien);
	
	public void editMusicien(Musicien musicien);
	
	public void deleteMusicien(Musicien musicien);

}
