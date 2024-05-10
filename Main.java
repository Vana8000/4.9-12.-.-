import java.util.Scanner;

class Divider {
    public static double divide(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("Делитель не может быть 0");
        }
        return a / b;
    }
}
class Multiplier {
    public static double multiply(double a, double b) {
        return a * b;
    }
}
class Adder {
    public static double add(double a, double b) {
        return a + b;
    }
}
class Subtractor {
    public static double subtract(double a, double b) {
        return a - b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        System.out.println("Результат сложения a и b: " + Adder.add(a, b));
        System.out.println("Результат вычитания a и b: " + Subtractor.subtract(a, b));
        System.out.println("Результат умножения a и b: " + Multiplier.multiply(a, b));
        System.out.println("Результат деления a и b: " + Divider.divide(a, b));
    }
}