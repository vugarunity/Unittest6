package seminars.sixth.list;

import java.util.Collections;
import java.util.List;

public class AverageCalculator {
    private final List<Integer> numbers;

    public AverageCalculator(List<Integer> numbers) {

        this.numbers = Collections.unmodifiableList(numbers);
    }

    public double calculateAverage() {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public String compareAverage(AverageCalculator otherList) {
        double average1 = this.calculateAverage();
        double average2 = otherList.calculateAverage();

        if (average1 > average2) {
            return "The first list has a higher average value";
        } else if (average1 < average2) {
            return "The second list has a higher average value";
        } else {
            return "The average values are equal";
        }
    }
}
