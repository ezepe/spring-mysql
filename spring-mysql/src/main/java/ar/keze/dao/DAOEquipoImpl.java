package ar.keze.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import ar.keze.beans.Equipo;
import ar.keze.dao.api.DAOApi;

@Repository
public class DAOEquipoImpl implements DAOApi<Equipo>{

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public Optional<Equipo> getByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Equipo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
/*
	public void save(Equipo t) {
		// TODO Auto-generated method stub
		
		String sqlString = "INSERT INTO equipo(nombre) VALUES(?)";
		Connection aConnection = null;
		
		try {
			aConnection = dataSource.getConnection();
			PreparedStatement pStatement = aConnection.prepareStatement(sqlString);
			
			pStatement.setString(1, t.getNombre());
			pStatement.executeUpdate();
			pStatement.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println( e.getMessage() );
			

		}
		
	}
	*/
	public void save(Equipo t) {
		/*
		 * --------------------
		 * Usando JDBC Template 
		 * --------------------
		 * String sqlString = "INSERT INTO equipo(nombre) VALUES(?)"; 
		 * jdbcTemplate = new JdbcTemplate(dataSource); 
		 * jdbcTemplate.update(sqlString, new Object[] { t.getNombre() });
		 */

		/*
		 * ------------------------------------------------------------
		 * Usando JDBC Template y mostrando el ID generado por el motor
		 * ------------------------------------------------------------		 
		 * 
		 */
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("id", t.getId());
		parameters.put("nombre", t.getNombre());

		SimpleJdbcInsert sJDBCInsert = new SimpleJdbcInsert(dataSource).withTableName("equipo")
				.usingGeneratedKeyColumns("id");
		
		Number id = sJDBCInsert.executeAndReturnKey(parameters);
		System.out.println("Generated id - " + id.longValue());
	}
	
	public void update(Equipo t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
