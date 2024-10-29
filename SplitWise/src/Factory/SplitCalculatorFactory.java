package Factory;

import Strategy.EqualCalculator;
import Strategy.PercentageCalculator;
import Strategy.SplitCalculator;
import Strategy.UnequalCalculator;
import models.SplitType;

public class SplitCalculatorFactory {

    public static SplitCalculator getSplitCalculator(SplitType splitType) throws Exception {
        if (splitType.equals(SplitType.EQUAL)) {
            return new EqualCalculator();
        } else if (splitType.equals(SplitType.UNEQUAL)) {
            return new UnequalCalculator();
        } else if (splitType.equals(SplitType.PERCENTAGE)) {
            return new PercentageCalculator();
        } else {
            throw new Exception("Invalid split type");
        }
    }

}
