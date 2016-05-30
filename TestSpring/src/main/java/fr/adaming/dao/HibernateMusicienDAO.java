/**
 * 
 */
package fr.adaming.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import fr.adaming.entity.Musicien;

/**
 * @author INTI-0332
 *
 */
public class HibernateMusicienDAO implements IMusicienDAO {	//TODO : difference avec JDBCMusicienDAO ???
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate template) {
		this.hibernateTemplate = template;
	}

	@Override
	public Musicien findMusicienByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMusicien(Musicien musicien) {
		hibernateTemplate.saveOrUpdate(musicien);
		
	}

	@Override
	public void editMusicien(Musicien musicien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMusicien(Musicien musicien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Musicien findMusicienById(int id) {
		//FIXME
		@SuppressWarnings("unchecked")
		List<Musicien> results = (List<Musicien>) hibernateTemplate.find("from Musicien where id = 1");
		
		return results.size() > 0 ? (Musicien) results.get(0) : null;
	}

	
	

}
