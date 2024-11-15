package seminars.sixth.list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AverageCalculator calculation = new AverageCalculator(Arrays.asList(1, 2, 3, 4, 5));
        double average = calculation.calculateAverage();
        System.out.println("Average: " + average);

        AverageCalculator list1 = new AverageCalculator(Arrays.asList(3, 4, 5));
        AverageCalculator list2 = new AverageCalculator(Arrays.asList(7, 8, 9));

        System.out.println(list1.compareAverage(list2));
    }
}
