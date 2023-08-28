package com.teamtwo.dispatchmanagementsystem.repository;

import com.teamtwo.dispatchmanagementsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    //@Query(value = "SELECT * FROM orders WHERE sender = sender", nativeQuery = true)
    List<Order> findBySender(String sender);
}
