public class Maximum {
    public static Integer testCase(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static Float testCase(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static String testCase(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome Generics program to find maximum");
        System.out.println("Maximum Of Three Integers is :" + testCase(2, 8, 9));
        System.out.println("Maximum Of Three Floats is :" + testCase(2.3f, 8.6f, 9.6f));
        System.out.println("Maximum Of Three Strings is :" + testCase("Apple", "Elephant", "Banana"));
    }
}
