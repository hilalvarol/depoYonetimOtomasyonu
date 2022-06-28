package tr.com.hilalvarol.interfaces;

import java.util.List;

import tr.com.hilalvarol.types.KategoriEntity;

public interface DALInterfaces<T> {

	void Insert(T entity);
	List<T> GetAll();
	T Delete(T Entity);
	void Update(T entity);
	List<T> GetById(int id);
}
