package com.digitalinnovationone.bank;

public enum TransactionType {

    INCOME, EXPENSE;

    public boolean isIncome() {
        return this == INCOME;
    }

}