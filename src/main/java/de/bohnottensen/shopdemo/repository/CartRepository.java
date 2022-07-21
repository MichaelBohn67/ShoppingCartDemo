package de.bohnottensen.shopdemo.repository;

import de.bohnottensen.shopdemo.model.CartDTO;
import de.bohnottensen.shopdemo.model.CustomerDTO;
import de.bohnottensen.shopdemo.model.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<CartDTO, Long> {

    List<CartDTO> findAll();

    CartDTO save(CartDTO cartDTO);

    CartDTO findCartDTOByCustomerIdAndProductId(CustomerDTO customerDTO, ProductDTO productDTO);

    List<CartDTO> findCartByCustomerId(CustomerDTO customerDTO);
}
