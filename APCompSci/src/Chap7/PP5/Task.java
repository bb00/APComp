/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap7.PP5;

public class Task implements Priority {
    private int priority;
    private String desc;
    
    public void setPriority(int priority) {
        this.priority = priority;
    }

    
    public int getPriority() {
        return this.priority;
    }
    
}
