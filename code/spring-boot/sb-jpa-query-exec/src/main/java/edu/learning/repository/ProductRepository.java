package edu.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.learning.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	//SQL : select * from prod_info where qty>=5
	//HQL : select p from Product p where quantity>=5
	@Query(value = "select p from Product p where quantity>= :qt")
	public List<Product> getProductByQtyHQL(@Param("qt") int qty );
	
	@Query(value = "select * from prod_info where qty>= :qt", nativeQuery = true)
	public List<Product> getProductByQtySQL(@Param("qt") int qty );



}
