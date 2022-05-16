public class LineComparisonProgram {
    public static void main(String[] args) {
        int x1 = 7;
        int x2 = 4;
        int y1 = 9;
        int y2 = 6;

        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);

        Double len_of_line = Math.floor(Math.sqrt(x + y));
        System.out.println("Length of the first line " + len_of_line);
    }
}
