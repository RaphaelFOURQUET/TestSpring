/**
 * 
 */
package fr.adaming.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import fr.adaming.entity.Musicien;

/**
 * @author INTI-0332
 *
 */
public class JDBCMusicienDAO implements IMusicienDAO {
	
	@SuppressWarnings("unused")
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Musicien findMusicienByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
