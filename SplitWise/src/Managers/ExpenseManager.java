package Managers;

import Factory.SplitCalculatorFactory;
import models.Expense;
import models.Split;
import models.SplitType;
import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExpenseManager {

    List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public Expense createExpense(User userWhoPaid, String description, Double totalAmount, Double amountPaidByUser, Map<User, Double> usersInvolved, SplitType splitType) throws Exception {

        List<Split> splits = SplitCalculatorFactory.getSplitCalculator(splitType).calculatAndValidateSplit(usersInvolved, totalAmount);

        Expense expense = new Expense(description, userWhoPaid, splits);

        this.expenses.add(expense);

        userWhoPaid.updateBalance(totalAmount - amountPaidByUser);
        usersInvolved.keySet().forEach((user) -> user.updateBalance(-1 * usersInvolved.get(user)));

        return expense;

    }
}
;