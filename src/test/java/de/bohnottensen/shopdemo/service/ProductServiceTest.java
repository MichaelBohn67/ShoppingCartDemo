package de.bohnottensen.shopdemo.service;

import de.bohnottensen.shopdemo.model.ProductDTO;
import de.bohnottensen.shopdemo.repository.ProductRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    ProductRepository repositoryMock = mock(ProductRepository.class);

    ProductService service = new ProductService(repositoryMock);


    @Test
    void whenFunctionIsCalledReturnAllProducts() {
        ProductDTO product = new ProductDTO();
        when(repositoryMock.findAll()).thenReturn(List.of(product));

        List<ProductDTO> productDTOList = service.findAllProducts();

        assertThat(productDTOList.size(), is(1));
        assertThat(productDTOList.get(0), is(product));
    }

}