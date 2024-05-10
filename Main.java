import java.util.Scanner;

class Divider {
    public static double divide(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("�������� �� ����� ���� 0");
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

        System.out.print("������� ����� a: ");
        double a = scanner.nextDouble();

        System.out.print("������� ����� b: ");
        double b = scanner.nextDouble();

        System.out.println("��������� �������� a � b: " + Adder.add(a, b));
        System.out.println("��������� ��������� a � b: " + Subtractor.subtract(a, b));
        System.out.println("��������� ��������� a � b: " + Multiplier.multiply(a, b));
        System.out.println("��������� ������� a � b: " + Divider.divide(a, b));
    }
}