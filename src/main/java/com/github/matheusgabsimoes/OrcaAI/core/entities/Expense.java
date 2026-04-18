package com.github.matheusgabsimoes.OrcaAI.core.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseCategory;
import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseStatus;
import com.github.matheusgabsimoes.OrcaAI.core.enums.PaymentMethod;

public class Expense {
    private final UUID id;
    private String description;
    private BigDecimal amount;
    private LocalDateTime expenseDate;
    private ExpenseCategory category;
    private ExpenseStatus status;
    private PaymentMethod paymentMethod;

    public Expense(
        UUID id,
        String description,
        BigDecimal amount,
        LocalDateTime expenseDate,
        ExpenseCategory category,
        ExpenseStatus status,
        PaymentMethod paymentMethod
    ) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.expenseDate = expenseDate;
        this.category = category;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }
}
