package ServiceImpl.impl;


import ServiceImpl.ProductoService;
import h2.Entity.Producto;
import h2.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository) {this.productoRepository = productoRepository;}

    @Override
    public List<Producto> obtenerTodosLosProductos() {return productoRepository.findAll();}

    @Override
    public Producto obtenerProductoPorId(Long id) {return productoRepository.findById(id).orElse(null);}

    @Override
    public Producto guardarProducto(Producto producto) {return productoRepository.save(producto);}

    @Override
    public void eliminarProducto(Long id) {productoRepository.deleteById(id);}

}
