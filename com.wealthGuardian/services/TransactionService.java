package com.wealthGuardian.services;

import com.wealthGuardian.models.Transaction;
import com.wealthGuardian.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
  @Autowired
  private TransactionRepository transactionRepository;

  public Transaction saveTransaction(Transaction transaction) {
    return transactionRepository.save(transaction);
  }

  public List<Transaction> getAllTransactions() {
    return transactionRepository.findAll();
  }

  // other CRUD operations
}
