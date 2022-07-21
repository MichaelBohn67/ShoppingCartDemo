package de.bohnottensen.shopdemo.service;

import de.bohnottensen.shopdemo.model.ProductDTO;
import de.bohnottensen.shopdemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    public List<ProductDTO> findAllProducts() {
        return productRepository.findAll();
    }
}
