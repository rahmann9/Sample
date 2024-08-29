package com.wealthGuardian.services.repositories;

import com.wealthGuardian.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
