package com.bank.apirest.repository;

import com.bank.apirest.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction findById(long id);
}
