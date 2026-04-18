-- V1__create_table_expense.sql
CREATE TABLE expense (
    id UUID PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    amount NUMERIC(15,2) NOT NULL,
    expense_date TIMESTAMP NOT NULL,
    category VARCHAR(50) NOT NULL,
    status VARCHAR(20) NOT NULL,
    payment_method VARCHAR(30) NOT NULL
);