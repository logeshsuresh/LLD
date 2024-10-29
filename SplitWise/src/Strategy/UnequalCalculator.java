package Strategy;

import Strategy.SplitCalculator;
import models.Split;
import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnequalCalculator implements SplitCalculator {
    @Override
    public List<Split> calculatAndValidateSplit(Map<User, Double> usersInvolved, Double totalAmount) throws Exception {
        // it is an unequal split
        List<Split> splits = new ArrayList<>();

        return splits;
    }
}
