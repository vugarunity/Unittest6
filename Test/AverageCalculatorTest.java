package seminars.sixth.list;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AverageCalculatorTest {

    @Test
    public void testCalculateAverage() {
        AverageCalculator calculation = new AverageCalculator(Arrays.asList(1, 2, 3, 4, 5));
        double average = calculation.calculateAverage();
        assertThat(average).isEqualTo(3.0);
    }

    @Test
    public void testCalculateAverageEmptyList() {
        AverageCalculator calculation = new AverageCalculator(List.of());
        assertThrows(IllegalArgumentException.class, () -> calculation.calculateAverage());
    }

    @Test
    public void testCompareAverageFirstListHigher() {
        AverageCalculator list1 = new AverageCalculator(Arrays.asList(7, 8, 9));
        AverageCalculator list2 = new AverageCalculator(Arrays.asList(4, 5, 6));

        String result = list1.compareAverage(list2);
        assertThat(result).isEqualTo("The first list has a higher average value");
    }

    @Test
    public void testCompareAverageSecondListHigher() {
        AverageCalculator list1 = new AverageCalculator(Arrays.asList(1, 2, 3));
        AverageCalculator list2 = new AverageCalculator(Arrays.asList(4, 5, 6));

        String result = list1.compareAverage(list2);
        assertThat(result).isEqualTo("The second list has a higher average value");
    }

    @Test
    public void testCompareAverageEqualValues() {
        AverageCalculator list1 = new AverageCalculator(Arrays.asList(3, 3, 3));
        AverageCalculator list2 = new AverageCalculator(Arrays.asList(3, 3, 3));

        String result = list1.compareAverage(list2);
        assertThat(result).isEqualTo("The average values are equal");
    }
}
