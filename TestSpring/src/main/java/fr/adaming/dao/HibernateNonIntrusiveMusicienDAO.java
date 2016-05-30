/**
 * 
 */
package fr.adaming.dao;

import org.hibernate.SessionFactory;

import fr.adaming.entity.Musicien;

/**
 * @author INTI-0332
 *
 */
public class HibernateNonIntrusiveMusicienDAO implements IMusicienDAO {	//TODO choix entre jdbc hibernate ou non intrusif ?
	
	private SessionFactory sessionFactory;

	@Override
	public Musicien findMusicienById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Musicien findMusicienByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMusicien(Musicien musicien) {
		sessionFactory.getCurrentSession().saveOrUpdate(musicien);
		
	}

	@Override
	public void editMusicien(Musicien musicien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMusicien(Musicien musicien) {
		// TODO Auto-generated method stub
		
	}

}
