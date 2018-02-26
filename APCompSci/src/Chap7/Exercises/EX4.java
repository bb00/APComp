/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap7.Exercises;
public class EX4 {
    public static void main(String[] args) {
        System.out.println(multiConcat("hello", 3));
    }
    public static String multiConcat(String input, int count) {
    String out = "";
        if (count < 2) {
            return out + input;
        }
        for (int i = 0; i < count; i++) {
            out+=input;
        }
        return out;
    }
}
