package Controller;



import ServiceImpl.ProductoService;
import h2.Entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {this.productoService = productoService;}

    @GetMapping("/")
    public List<Producto> obtenerTodosLosProductos() {return productoService.obtenerTodosLosProductos();}

    @GetMapping("/listar/{id}")
    public Producto obtenerProductosPorId(@PathVariable Long id) {return productoService.obtenerProductoPorId(id);}

    @PostMapping("/crear")
    public Producto guardarProductor(@RequestBody Producto producto) {return productoService.guardarProducto(producto);}

    @PutMapping("/actualizar/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {producto.setId(id);return productoService.guardarProducto(producto);}

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Long id) {productoService.eliminarProducto(id);}


}
