package ms.ecoservices.productservice.repository;

import ms.ecoservices.productservice.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{
}
