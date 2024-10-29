package models;

public class BalanceSheet {

    User user;

    Double amount;

    public BalanceSheet(User user) {
        this.amount = 0.0;
        this.user = user;
    }

    public void show() {
        System.out.println(user.name);
        if (amount < 0.0) {
            System.out.println("User" + " " + user.name +  " owes Rs." + Math.abs(amount));
        } else {
            System.out.println("User" + " " + user.name +  " is owed Rs." + Math.abs(amount));
        }
    }

    public void updateBalance(Double amount) {
        this.amount += amount;
    }

}
