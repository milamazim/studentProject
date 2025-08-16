package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        st.studentName = sc.nextLine();
        st.q1 = sc.nextDouble();
        st.q2 = sc.nextDouble();
        st.q3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", st.sum());
        st.finalGrade();

        sc.close();
    }
}
