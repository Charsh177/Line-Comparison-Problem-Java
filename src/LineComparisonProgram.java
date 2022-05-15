import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        // Calculate length of a line
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 co-ordinate: ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 co-ordinate: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y1 co-ordinate: ");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 co-ordinate: ");
        int y2 = sc.nextInt();

        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);

        double len_of_line = Math.sqrt(x + y);
        System.out.println("Length of the line is " + len_of_line);

        double len_of_line1 = Math.sqrt(x + y);
        System.out.println("Length of line 1 is " + len_of_line1);

        System.out.println("Calculation for second line length");
        System.out.print("Enter x3 co-ordinate: ");
        int x3 = sc.nextInt();
        System.out.print("Enter x4 co-ordinate: ");
        int x4 = sc.nextInt();
        System.out.print("Enter y3 co-ordinate: ");
        int y3 = sc.nextInt();
        System.out.print("Enter y4 co-ordinate: ");
        int y4 = sc.nextInt();

        double p = Math.pow((x4 - x3), 2);
        double s = Math.pow((y4 - y3), 2);

        double len_of_line2 = Math.sqrt(p + s);
        System.out.println("Length of line 2 is " + len_of_line2);

        if (len_of_line1 == len_of_line2)
            System.out.println("Length are equal");
        else
            System.out.println("Length are not equal");

        if (len_of_line1 > len_of_line2)
            System.out.println("Line 1 is greater than Line 2");
        else
            System.out.println("Line 1 is less than Line 2");
    }
}
