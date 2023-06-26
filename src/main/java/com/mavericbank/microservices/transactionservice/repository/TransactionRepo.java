package com.mavericbank.microservices.transactionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mavericbank.microservices.transactionservice.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long>{
	
}
