
public interface CrudDao<T> {

	T crear(T t);
	
	T editar(T t);
	
	void eliminar(T t);
	
	T consultar();
}
