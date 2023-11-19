import java.util.Scanner;
public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for how many number of subject you want to calculate grade");
        int n = sc.nextInt();
        double [] marks = new double[n];
        double total_mark =0;
        System.out.println("Enter for how many students you want to calculate grade : ");
        int s = sc.nextInt();
        for (int j =0;j<s;j++) {
            System.out.println("Enter information of student "+(j+1)+" : ");
            System.out.println();
            total_mark=0;
            double average_mark =0;
            double grade = 0;
            System.out.println("Enter the marks in the subject's ");
            for (int i = 0; i < n; i++) {
                System.out.println("Enter mark in subject " + (i+1) + " :");
                marks[i] = sc.nextDouble();
            }
            for (int i = 0; i < n; i++) {
                total_mark += marks[i];
            }
            average_mark = (total_mark / marks.length);
            grade = (total_mark / marks.length)/10;
            if (((grade) >= 9) && ((grade) <= 10)) {
                System.out.println("Total mark : " + total_mark);
                System.out.println("Average mark : " + average_mark);
                System.out.println("The student obtained 'O' grade\n\n");
            } else if (((grade) >= 8) && ((grade) < 9)) {
                System.out.println("Total mark : " + total_mark);
                System.out.println("Average mark : " + average_mark);
                System.out.println("The student obtained 'A' grade\n\n");
            } else if (((grade) >= 7) && ((grade) < 8)) {
                System.out.println("Total mark : " + total_mark);
                System.out.println("Average mark : " + average_mark);
                System.out.println("The student obtained 'B' grade\n\n");
            } else if (((grade) >= 6) && ((grade) < 7)) {
                System.out.println("Total mark : " + total_mark);
                System.out.println("Average mark : " + average_mark);
                System.out.println("The student obtained 'C' grade\n\n");
            } else if (((grade) >= 5) && ((grade) < 6)) {
                System.out.println("Total mark : " + total_mark);
                System.out.println("Average mark : " + average_mark);
                System.out.println("The student obtained 'D' grade\n\n");
            } else if (((grade) >= 4) && ((grade) < 5)) {
                System.out.println("Total mark : " + total_mark);
                System.out.println("Average mark : " + average_mark);
                System.out.println("The student obtained 'E' grade\n\n");
            } else {
                System.out.println("The student get F grade in the exam!!!");
            }
        }
    }
}
