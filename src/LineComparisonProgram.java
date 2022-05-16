public class LineComparisonProgram {
    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 3;
        int y1 = 1;
        int y2 = 3;

        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);

        Double len_of_line = Math.floor(Math.sqrt(x + y));
        System.out.println("Length of first line " + len_of_line);
    }
}
