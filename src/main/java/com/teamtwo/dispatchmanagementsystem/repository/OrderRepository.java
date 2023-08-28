package com.teamtwo.dispatchmanagementsystem.repository;

import com.teamtwo.dispatchmanagementsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT orderID FROM Order WHERE sender = :sender")
    List<Long> findIdBySender(String sender);
    List<Order> findBySender(String sender);
}
