import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("“Введите число:");
        int number = new Scanner(System.in).nextInt();
        System.out.println("“Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        int sum = number+number2;
        System.out.println("Сумма введенных чисел = "+sum+";");
        int difference = number-number2;
        System.out.println("Разность введенных чисел = "+difference+";");
        int composition = number*number2;
        System.out.println("Преремножение введенных чисел = "+composition+";");
        double division = (double) number/number2;
        System.out.println("Результат деление введенных чисел = "+division+".");
        }
}