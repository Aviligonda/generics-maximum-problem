import java.util.Arrays;

public class Maximum<T> {
    public static void main(String[] args) {
        System.out.println("Welcome Generics program to find maximum");
        Maximum<Integer> integerMaximum = new Maximum<>();
        Maximum<Float> floatMaximum = new Maximum<>();
        Maximum<String> stringMaximum = new Maximum<>();
        integerMaximum.testCase(12, 8, 9, 10, 22);
        floatMaximum.testCase(2.6f, 3.8f, 6.7f, 8.9f, 1.6f);
        stringMaximum.testCase("Apple", "Banana", "Juice", "Sink", "Cat", "Elephant");
    }

    // Sorting the all numbers to find maximum there is no limit
//    Using array method
    public T testCase(T... a) {
        Arrays.sort(a);
        T max = a[a.length - 1];
        printMax(max);
        return max;
    }

    private void printMax(T max) {
        System.out.println(max);
    }


}