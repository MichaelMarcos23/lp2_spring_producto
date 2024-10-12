package pe.com.cibertec.Lp2_spring.service;

import java.util.List;

import pe.com.cibertec.Lp2_spring.model.ProductoEntity;

public interface ProductoService {
	List<ProductoEntity>listarProducto();
	void crearProducto(ProductoEntity productoEntity);

}
