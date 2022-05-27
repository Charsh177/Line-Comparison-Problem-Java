import java.util.Scanner;

public class LineComparisonProgram {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparisonProgram checkEquality = new LineComparisonProgram();
        checkEquality.lengthCalculate();
    }

    void lengthCalculate() {

        // Check equality of two length
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate length of first line");
        System.out.print("Enter x1 co-ordinate: ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 co-ordinate: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y1 co-ordinate: ");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 co-ordinate: ");
        int y2 = sc.nextInt();

        Double len_of_line1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of first line is " + len_of_line1);

        System.out.println("Calculate length of second line");
        System.out.print("Enter x3 co-ordinate: ");
        int x3 = sc.nextInt();
        System.out.print("Enter x4 co-ordinate: ");
        int x4 = sc.nextInt();
        System.out.print("Enter y3 co-ordinate: ");
        int y3 = sc.nextInt();
        System.out.print("Enter y4 co-ordinate: ");
        int y4 = sc.nextInt();

        Double len_of_line2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("Length of second line is " + len_of_line2);

        if (len_of_line1.equals(len_of_line2))
            System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");
    }
}