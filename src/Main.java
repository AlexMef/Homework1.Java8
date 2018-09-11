import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter value");
//        int value = in.nextInt();
//        System.out.println("Enter grade");
//        int grade = in.nextInt();
//        double a = pow(value, grade);
//        System.out.println(a);
        equation(in.nextInt(), in.nextInt(), in.nextInt());
    }

    public static double pow(int value, int grade){
        return Math.pow(value, grade);
    }

    public static void equation(double a, double b, double c){
        double D = (b * b) - (4 * a * c);
        if (D > 0){
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            double x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("Корни квадратного уравнения " + x1 + "  " + x2);
        } else if (D == 0) {
            double x = (-b)/(2*a);
            System.out.println("Корни квадратного уравнения " + x);
        } else if (D < 0){
            System.out.println("Решения не существует");
        }
    }
}
