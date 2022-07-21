package de.bohnottensen.shopdemo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductDTO implements Serializable {

    @Id
    private Long id;
    private String productName;
    private double productPrice;
    private LocalDate validFrom;
    private LocalDate validTo;
}
