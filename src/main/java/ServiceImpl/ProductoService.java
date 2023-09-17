package ServiceImpl;

import h2.Entity.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerProductoPorId(Long id);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Long id);

}
