public class PrintArray {
    private static <T> void toPrint(T[] a) {
        for (T i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Float[] b = {1.1f, 1.2f, 1.6f};
        Character[] c = {'a', 'b', 'c'};
        String[] d = {"Apple", "Ball", "Cat", "Dog"};
        System.out.println("To print Integer values");
        toPrint(a);
        System.out.println("To print Float values");
        toPrint(b);
        System.out.println("To print Character values ");
        toPrint(c);
        System.out.println("To print String values");
        toPrint(d);
    }
}
