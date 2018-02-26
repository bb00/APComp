package Chap7.Exercises;
public class EX3 extends EX2 {
    public static void main(String[] args) {
        System.out.println(average(1,2));
        System.out.println(average(1,2,200));
        System.out.println(average(1,2,3000));
    }
    public static double average(int p1, int p2, int p3, int p4) {
        return (p1 + p2 + p3 + p4)/4.0;
    }
}
