package pe.com.cibertec.Lp2_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.Lp2_spring.model.CategoriaEntity;
@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Integer>{

}
