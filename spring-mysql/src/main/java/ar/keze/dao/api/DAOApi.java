package ar.keze.dao.api;

import java.util.List;
import java.util.Optional;

public interface DAOApi<T> {

	Optional<T> getByID(long id);

	List<T> getAll();

	void save(T t);

	void update(T t);

	void delete(long id);

}
