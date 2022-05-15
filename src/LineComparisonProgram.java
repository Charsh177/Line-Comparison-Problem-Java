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
    }
}
