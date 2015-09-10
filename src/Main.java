import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created by eugeny on 10.09.2015.
 */
public class Main {
    double x = 1.5;
    double y = -4.7;
    double t = 0.003;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        t = scanner.nextDouble();
        double s = calculateS(x,y,t);
        double z = calculateZ(x, y, t);
//        System.out.println("s = " + s);
        print(s, z);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getHour()+":"+dateTime.getMinute()+":"
                +dateTime.getSecond());
        LocalDateTime t = dateTime.minusDays(12).minusMonths(7);
        System.out.println(t);
    }

    private double calculateZ(double x, double y, double t) {
        return 0;
    }

    private void print(double s, double z) {
        System.out.printf("s = %8.5f\n", s);
        System.out.printf("z = %8.5f\n", z);
    }

    private double calculateS(double x, double y, double t) {
        return Math.sin(x) + y * Math.log(t);
    }
}
