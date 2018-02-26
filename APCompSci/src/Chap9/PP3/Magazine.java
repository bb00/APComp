package Chap9.PP3;

public class Magazine extends ReadingMaterial {
    
    private int issueNo;
    private double cost;
    
    public Magazine(boolean isAdult, int issueNo, double cost) {
        this.isAdult = isAdult;
        this.issueNo = issueNo;
        this.cost = cost;
    }

    public Magazine(int issueNo, double cost) {
        this.issueNo = issueNo;
        this.cost = cost;
        this.isAdult = false;
    }
    
}
