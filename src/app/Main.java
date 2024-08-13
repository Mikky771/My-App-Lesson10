package app;
import java.util.Scanner;

public class Main {
    // Метод для виведення квадрата числа
    public static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    // Метод для обчислення об'єму циліндра
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Метод для обчислення суми всіх елементів масиву
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Метод для реверсу рядка
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Метод для піднесення числа до степеня
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // Метод для виведення рядка n разів
    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Квадрат числа
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        // 2. Об'єм циліндра
        System.out.print("\nВведіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        // 3. Сума елементів масиву
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\nМасив чисел: " + java.util.Arrays.toString(numbers));
        int sum = sumArray(numbers);
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        // 4. Реверс рядка
        scanner.nextLine(); // очищення буфера
        System.out.print("\nВведіть рядок: ");
        String inputString = scanner.nextLine();
        String reversed = reverseString(inputString);
        System.out.println("Рядок в зворотньому порядку: " + reversed);

        // 5. Піднесення до степеня
        System.out.print("\nВведіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int powerResult = power(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult + ".");

        // 6. Виведення тексту n разів
        System.out.print("\nВведіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очищення буфера
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        printTextMultipleTimes(n, text);

        scanner.close();
    }
}