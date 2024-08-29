package com.wealthGuardian.services.repositories;

import com.wealthGuardian.models.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}
