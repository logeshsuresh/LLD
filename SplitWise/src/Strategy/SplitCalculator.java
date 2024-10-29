package Strategy;

import models.Split;
import models.User;

import java.util.List;
import java.util.Map;

public interface SplitCalculator {

    public List<Split> calculatAndValidateSplit(Map<User, Double> usersInvolved, Double totalAmount) throws Exception;


}
