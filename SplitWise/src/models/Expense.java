package models;

import java.util.List;

public class Expense {

    String description;

    User userWhoPaid;

    List<Split> splits;

    public Expense(String description, User userWhoPaid, List<Split> splits) {
        this.description = description;
        this.userWhoPaid = userWhoPaid;
        this.splits = splits;
    }

}
