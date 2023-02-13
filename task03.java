//3. Реализовать простой калькулятор

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число ->: ");
        int a = iScanner.nextInt();
        System.out.print("Введите знак арифметической операции ->: ");
        String ch = iScanner.next();
        System.out.print("Введите второе число ->: ");
        int b = iScanner.nextInt();
        iScanner.close();
        switch (ch){
            case "+":
                int c = a + b;
                System.out.printf("%d %s %d = %d\n", a, ch, b, c);
                break;
            case "-":
                c = a - b;
                System.out.printf("%d %s %d = %d\n", a, ch, b, c);
                break;
            case "*":
                c = a * b;
                System.out.printf("%d %s %d = %d\n", a, ch, b, c);
                break;
            case "/":
                c = a / b;
                System.out.printf("%d %s %d = %d\n", a, ch, b, c);
                break;
            default:
                System.out.println("Введите один из знаков +, -, *, /");
        }

    }
}
