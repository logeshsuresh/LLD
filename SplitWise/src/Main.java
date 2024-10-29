import Managers.*;
import models.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Initialize an ExpenseManager instance
        ExpenseManager expenseManager = new ExpenseManager();

        // Create Users
        User logesh = new User("Logesh");
        User abhinav = new User("Abhinav");
        User hansel = new User("Hansel");

        // Create a Group and add Users to it
        Group friendsGroup = new Group("Friends", new ArrayList<>(List.of(logesh, abhinav, hansel)));

        // Display each user's balance before adding expenses
        System.out.println("Initial Balances:");
        logesh.showBalanceSheet();
        abhinav.showBalanceSheet();
        hansel.showBalanceSheet();

        // Define an expense where Logesh pays for dinner and others owe him equally
        String description = "Dinner";
        Double totalAmount = 300.0; // Total expense amount
        Double amountPaidByLogesh = 300.0; // Logesh paid the entire amount

        // Define split details (each user owes an equal share)
        Map<User, Double> usersInvolved = new HashMap<>();
        usersInvolved.put(abhinav, 100.0); // Abhinav owes 100
        usersInvolved.put(hansel, 100.0);  // Hansel owes 100
        SplitType splitType = SplitType.EQUAL;

        try {
            // Add the expense to the group and update balances
            friendsGroup.addExpenseToGroup(logesh, description, amountPaidByLogesh, totalAmount, usersInvolved, splitType, expenseManager);

            // Display each user's balance after the expense
            System.out.println("\nBalances after adding expense:");
            logesh.showBalanceSheet();
            abhinav.showBalanceSheet();
            hansel.showBalanceSheet();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
