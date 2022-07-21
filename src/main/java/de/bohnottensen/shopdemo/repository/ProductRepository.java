package de.bohnottensen.shopdemo.repository;

import de.bohnottensen.shopdemo.model.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDTO, Long> {
}
