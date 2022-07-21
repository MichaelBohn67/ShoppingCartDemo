package de.bohnottensen.shopdemo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "cart")
public class CartDTO implements Serializable {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private CustomerDTO customer;
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private ProductDTO product;
    private int items;

}
