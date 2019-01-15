package ar.keze.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.keze.beans.Marca;
import ar.keze.dao.api.DAOApi;
import ar.keze.dao.api.DAOMarca;

@Service
public class ServiceMarca {

	@Autowired
	private DAOApi<Marca> daoMarca;
	
	public void save(Marca m) {
		
		try {
			daoMarca.save(m);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
