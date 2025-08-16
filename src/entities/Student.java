package entities;

public class Student {

    public String studentName;
    public double q1;
    public double q2;
    public double q3;

    public double sum() {
        return q1 + q2 + q3;

    }

    public void finalGrade() {
        if (sum() < 60.00) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", 60 - sum());
        } else {
            System.out.println("PASS");
        }


    }     

}
