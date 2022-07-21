package de.bohnottensen.shopdemo.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@RequiredArgsConstructor
@Getter
@Setter
@Table(name = "customer")
@Entity
public class CustomerDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private LocalDate validFrom;
    private LocalDate validTo;


}
