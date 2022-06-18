import java.util.Arrays;

public class Maximum {
    // Sorting the all numbers to find maximum there is no limit
//    Using array method
    public static <T> T testCase(T... a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        System.out.println("Welcome Generics program to find maximum");
        System.out.println("Maximum of Integer values is :" + testCase(2, 8, 9, 102, 6, 9, 23, 56, 95));//more than 3 variables
        System.out.println("Maximum of Float Values is :" + testCase(2.6f, 5.6f, 2.8f, 8.9f, 10.6f));
        System.out.println("Maximum of String values is :" + testCase("Apple", "Bird", "Juice", "Dog", "Elephant", "Fox", "Goat"));
    }

}