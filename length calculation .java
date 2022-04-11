import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First point Co-ordinates: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        System.out.print("Enter Second point Co-ordinates: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double lenght = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.println(lenght);

    }

}