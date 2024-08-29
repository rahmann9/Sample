package com.wealthGuardian.services.models;

import javax.persistence.;
import java.math.BigDecimal;

@Entity
public class Budget {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long budgetId;
  private BigDecimal amount;
  private String category;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public Long getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(Long budgetId) {
    this.budgetId = budgetId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
