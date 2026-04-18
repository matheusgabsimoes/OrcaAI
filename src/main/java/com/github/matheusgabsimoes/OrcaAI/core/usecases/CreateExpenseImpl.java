package com.github.matheusgabsimoes.OrcaAI.core.usecases;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.github.matheusgabsimoes.OrcaAI.core.entities.Expense;
import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseCategory;
import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseStatus;
import com.github.matheusgabsimoes.OrcaAI.core.enums.PaymentMethod;

public class CreateExpenseImpl implements CreateExpense {

    @Override
    public Expense execute(
        String description,
        BigDecimal amount,
        LocalDateTime expenseDate,
        ExpenseCategory category,
        PaymentMethod paymentMethod,
        ExpenseStatus status
    ) {
        return new Expense(
            UUID.randomUUID(), 
            description, 
            amount, 
            expenseDate, 
            category, 
            status, 
            paymentMethod
        );
    }
}
