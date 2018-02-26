/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap10.PP2;

/**
 *
 * @author 3002108
 */
public class Executive extends Employee implements Payable {
    private int extraVacation;
    private double bonus;
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;
    }
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }
    
    public double pay() {
        double payment = super.pay() + bonus;
        
        bonus = 0;
        
        return payment;
    }
    public int vacation() {
        return STANDARD_VACATION + extraVacation;
    }
}
