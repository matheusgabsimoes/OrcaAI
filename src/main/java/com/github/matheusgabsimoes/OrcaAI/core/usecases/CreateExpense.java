package com.github.matheusgabsimoes.OrcaAI.core.usecases;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.github.matheusgabsimoes.OrcaAI.core.entities.Expense;
import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseCategory;
import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseStatus;
import com.github.matheusgabsimoes.OrcaAI.core.enums.PaymentMethod;

public interface CreateExpense {
    Expense execute(
        String description,
        BigDecimal amount,
        LocalDateTime expenseDate,
        ExpenseCategory category,
        PaymentMethod paymentMethod,
        ExpenseStatus status
    );
}