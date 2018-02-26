package Chap7.Exercises;
public class EX5 extends EX4 {
    public static void main(String[] args) {
        System.out.println(multiConcat("hello", 3));
        System.out.println(multiConcat("hello"));
    }
    public static String multiConcat(String input) {
        return input + input;
    }
}
