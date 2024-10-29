package models;

import Managers.ExpenseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Group {

    String groupName;

    List<User> users;

    List<Expense> expenses;


    public Group(String groupName, List<User> users) {
        this.groupName = groupName;
        this.users = users;
        this.expenses = new ArrayList<>();
    }

    public void addUserToGroup(User user) {
        this.users.add(user);
    }

    public void addExpenseToGroup(User userWhoPaid, String description, Double amountPaidByUser, Double totalAmount, Map<User, Double> usersInvolved, SplitType splitType, ExpenseManager expenseManager) throws Exception {
        Expense expense = expenseManager.createExpense(userWhoPaid, description, amountPaidByUser, totalAmount, usersInvolved, splitType);
        this.expenses.add(expense);
    }

}
