//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число ->: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int result = n * (n + 1)/2;
        System.out.println(result);
    }
}
