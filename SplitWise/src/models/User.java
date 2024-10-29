package models;

public class User implements  Observer {

    String name;

    BalanceSheet balanceSheet;

    public User(String name) {
        this.name = name;
        this.balanceSheet = new BalanceSheet(this);
    }

    public void showBalanceSheet() {
        this.balanceSheet.show();
    }

    public void updateBalance(double amount) {
        this.balanceSheet.updateBalance(amount);
    }
}
