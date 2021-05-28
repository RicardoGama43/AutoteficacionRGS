package ricardo.gama.org.service;
import ricardo.gama.org.model.Producto;
import java.util.List;

public interface IntProductoService {
	//Logica de negocio 
	
		public List<Producto> obtenerTodos();
		public void guardar(Producto producto);
		public void eliminar(Integer idProducto);
		public Producto buscarPorId(Integer idProducto);

}
