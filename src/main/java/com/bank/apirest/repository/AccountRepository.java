package com.bank.apirest.repository;

import com.bank.apirest.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findById(long id);
}
