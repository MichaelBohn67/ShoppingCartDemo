package de.bohnottensen.shopdemo.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.bohnottensen.shopdemo.model.CartDTO;
import de.bohnottensen.shopdemo.model.CustomerDTO;
import de.bohnottensen.shopdemo.model.ProductDTO;
import de.bohnottensen.shopdemo.repository.CartRepository;

import java.util.List;

import org.junit.jupiter.api.Test;


class ShoppingCartServiceTest {

    CartRepository repositoryMock = mock(CartRepository.class);
    CustomerDTO customerDTOMock = mock(CustomerDTO.class);
    ProductDTO productMock = mock(ProductDTO.class);

    ShoppingCartService service = new ShoppingCartService(repositoryMock);

    @Test
    void givenCustomerReturnCustomersCart() {
        CartDTO cart = new CartDTO();
        when(repositoryMock.findCartByCustomerId(customerDTOMock)).thenReturn(List.of(cart));

        List<CartDTO> result = service.findCartByCustomerId(customerDTOMock);

        assertThat(result, contains(cart));
    }

    @Test
    void givenCustomerAndProductReturnCart() {
        CartDTO cart = new CartDTO();
        cart.setCustomer(customerDTOMock);
        cart.setProduct(productMock);
        cart.setItems(1);
        when(repositoryMock.findCartDTOByCustomerIdAndProductId(customerDTOMock, productMock)).thenReturn(cart);

        CartDTO result = service.addToCart(customerDTOMock, productMock);

        assertThat(cart.getItems(), is(2));

    }

}