import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] decimals = {1.57, 7.654, 9.986};

        int[] values = {54, 76, 456, 123, 789};

        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index]);
            if (index < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int pos = 0; pos < decimals.length; pos++) {
            System.out.print(decimals[pos]);
            if (pos < decimals.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int count = 0; count < values.length; count++) {
            System.out.print(values[count]);
            if (count < values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int idx = numbers.length - 1; idx >= 0; idx--) {
            System.out.print(numbers[idx]);
            if (idx > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int position = decimals.length - 1; position >= 0; position--) {
            System.out.print(decimals[position]);
            if (position > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int iterator = values.length - 1; iterator >= 0; iterator--) {
            System.out.print(values[iterator]);
            if (iterator > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int numIdx = 0; numIdx < numbers.length; numIdx++) {
            if (numbers[numIdx] % 2 != 0) {
                numbers[numIdx] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}