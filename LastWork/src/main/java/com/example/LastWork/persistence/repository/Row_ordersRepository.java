package com.example.LastWork.persistence.repository;

import com.example.LastWork.persistence.entity.Row_orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Row_ordersRepository extends JpaRepository<Row_orders, Long> {
}
