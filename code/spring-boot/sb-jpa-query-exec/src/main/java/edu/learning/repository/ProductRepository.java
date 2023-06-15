package edu.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.learning.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	//SQL : select * from prod_info where qty>=5
	//HQL : select p from Product p where quantity>=5
	@Query(value = "select p from Product p where quantity>= :qt")
	public List<Product> getProductByQtyHQL(@Param("qt") int qty );
	
	@Query(value = "select * from prod_info where qty>= :qt", nativeQuery = true)
	public List<Product> getProductByQtySQL(@Param("qt") int qty );

	// SQL :  UPDATE prod_info set qty=4 WHERE pnm='Smart Watch'
	@Modifying
	@Transactional
	@Query(value = "UPDATE Product set quantity= :q WHERE name= :n")
	public void updateProdQty(@Param("q") int qty, 
			@Param("n") String name);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM prod_info where qty=0", nativeQuery = true)
	public void deleteRecord();

}
