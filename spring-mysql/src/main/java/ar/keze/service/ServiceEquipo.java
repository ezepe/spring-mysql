package ar.keze.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.keze.beans.Equipo;
import ar.keze.dao.api.DAOApi;

@Service
public class ServiceEquipo {

	@Autowired
	DAOApi<Equipo> daoEquipo;

	public void save(Equipo equipo) {

		try {
			daoEquipo.save(equipo);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
