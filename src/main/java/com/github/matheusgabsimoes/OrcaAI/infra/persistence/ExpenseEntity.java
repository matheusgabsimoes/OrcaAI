package com.github.matheusgabsimoes.OrcaAI.infra.persistence;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseCategory;
import com.github.matheusgabsimoes.OrcaAI.core.enums.ExpenseStatus;
import com.github.matheusgabsimoes.OrcaAI.core.enums.PaymentMethod;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "expense")


public class ExpenseEntity {

    @Id
    private UUID id;
    private String description;
    private BigDecimal amount;

    @Column(name = "expense_date")
    private LocalDateTime expenseDate;

    @Enumerated(EnumType.STRING)
    private ExpenseCategory category;

    @Enumerated(EnumType.STRING)
    private ExpenseStatus status;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;
}