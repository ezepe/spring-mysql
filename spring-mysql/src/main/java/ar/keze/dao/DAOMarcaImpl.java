package ar.keze.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.keze.beans.Marca;
import ar.keze.dao.api.DAOApi;

@Repository
public class DAOMarcaImpl implements DAOApi<Marca> {

	@Autowired
	private DataSource dataSource;

	public Optional<Marca> getByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Marca> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Marca t) {
		// TODO Auto-generated method stub
		
		String sqlString = "INSERT INTO marca(nombre) VALUES(?);";
		Connection aConnection = null;
		
		try {
			aConnection = dataSource.getConnection();
			PreparedStatement pStatement = aConnection.prepareStatement(sqlString);
			pStatement.setString(1, t.getNombre());
			pStatement.executeUpdate();
			pStatement.close();
			System.out.println("---> Marca INSERTADA");
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}

	public void update(Marca t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	


}
