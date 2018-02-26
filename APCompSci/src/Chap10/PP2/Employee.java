package Chap10.PP2;

public class Employee extends StaffMember implements Payable {
    protected String socialSecurityNumber;
    protected double payRate;
    final int STANDARD_VACATION = 21;

    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public String toString() {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }
    public double pay() {
        return payRate;
    }

    public int vacation() {
        return STANDARD_VACATION;
    }
}
