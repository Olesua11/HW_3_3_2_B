package org.example;public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount account = new BankAccount(15000);
        double withdrawalAmount = 6000;
        while (true) {
            try {
                   account.withdraw(withdrawalAmount);
                System.out.println("Вывод успешен."+  "Сумма вывода :"+ withdrawalAmount + "  Оставшееся количество: " + account.getAmount() + " сом");
            } catch (LimitException e) {
                System.out.println("Вывод средств не выполнен. " + e.getMessage() + ". \nОставшееся количество: " + e.getRemainingAmount() + " сом");
                if (account.getAmount() > 0) {
                    System.out.println("Вывод оставшейся суммы: " + account.getAmount() + " сом");
                    account.withdraw(account.getAmount());                }
                break;
            }
        }
    }
}