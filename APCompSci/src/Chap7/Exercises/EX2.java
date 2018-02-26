package Chap7.Exercises;
public class EX2 extends EX1 {
    public static void main(String[] args) {
        System.out.println(average(1,2));
        System.out.println(average(1,2,200));
    }
    public static double average(int p1, int p2, int p3) {
        return (p1 + p2 + p3)/3.0;
    }
    
}
