package de.bohnottensen.shopdemo.service;

import de.bohnottensen.shopdemo.model.CartDTO;
import de.bohnottensen.shopdemo.model.CustomerDTO;
import de.bohnottensen.shopdemo.model.ProductDTO;
import de.bohnottensen.shopdemo.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingCartService {

    private final CartRepository repository;

    public CartDTO addToCart(CustomerDTO customerDTO, ProductDTO productDTO) {
        CartDTO cart = repository.findCartDTOByCustomerIdAndProductId(customerDTO, productDTO);
        if(cart == null) {
            cart = new CartDTO();
            cart.setProduct(productDTO);
            cart.setCustomer(customerDTO);
            cart.setItems(1);
        } else {
            cart.setItems(cart.getItems() + 1);
        }
        return repository.save(cart);
    }

    public List<CartDTO> findCartByCustomerId(CustomerDTO customerDTO) {
        return repository.findCartByCustomerId(customerDTO);
    }
}
