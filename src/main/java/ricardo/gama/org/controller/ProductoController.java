package ricardo.gama.org.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ricardo.gama.org.service.IntProductoService;
import ricardo.gama.org.model.Producto;
@Controller
public class ProductoController {
	 @Autowired
		private IntProductoService productoService;
		@GetMapping("/index")
		public String mostrarIndex(Model model) {
			for(Producto p : productoService.obtenerTodos())
				System.out.println(p);
			model.addAttribute("productos", productoService.obtenerTodos());
			return "listaProducto";
		}
	
	

}
