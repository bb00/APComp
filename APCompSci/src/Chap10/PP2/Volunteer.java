/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap10.PP2;

public class Volunteer extends StaffMember implements Payable {

    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }
    
    public double pay() {
        return 0.0;
    }
    
    public int vacation() {
        return 0;
    }
}
