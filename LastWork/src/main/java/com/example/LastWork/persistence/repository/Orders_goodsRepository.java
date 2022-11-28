package com.example.LastWork.persistence.repository;

import com.example.LastWork.persistence.entity.Orders_goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Orders_goodsRepository extends JpaRepository<Orders_goods, Long> {
}
