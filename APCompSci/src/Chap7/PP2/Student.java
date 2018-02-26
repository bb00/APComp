package Chap7.PP2;
public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double[] scores;
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        scores = new double[3];
    }
    public void setTestScore(int index, double score) {
        scores[index - 1] = score;
    }
    public double getTestScore(int index) {
        return scores[index - 1];
    }
    public double average() {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }
    @Override
    public String toString() {
        String result;
        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Grade 1:" + getTestScore(1) + "\n";
        result += "Test Grade 2:" + getTestScore(2) + "\n";
        result += "Test Grade 3:" + getTestScore(3) + "\n";
        result += "Average: " + average();
        
        return result;
    }
}