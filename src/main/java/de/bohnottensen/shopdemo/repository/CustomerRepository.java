package de.bohnottensen.shopdemo.repository;

import de.bohnottensen.shopdemo.model.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDTO, Long> {
}
