package org.example;class BankAccount {
    private double amount;
    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withdraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств для вывода", amount);
        } else {
            amount -= sum;        }
    }
}