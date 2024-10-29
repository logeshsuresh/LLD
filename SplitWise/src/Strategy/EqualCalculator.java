package Strategy;

import models.Split;
import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EqualCalculator implements SplitCalculator {
    @Override
    public List<Split> calculatAndValidateSplit(Map<User, Double> usersInvolved, Double totalAmount) throws Exception {
        int numberOfPeople = usersInvolved.size() + 1;

        double amountPerPerson = (totalAmount / numberOfPeople);

        List<Split> splits = new ArrayList<>();

        for (Map.Entry<User, Double> userAmount : usersInvolved.entrySet()) {
            User currentUserInvolved = userAmount.getKey();
            Double amountToPay = userAmount.getValue();
            if (amountPerPerson != amountToPay) {
                throw new Exception("Amount per person not equal to the amount to pay");
            }
            splits.add(new Split(currentUserInvolved, amountToPay));
        }

        return  splits;
    }
}
