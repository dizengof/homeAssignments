package task1;

import java.util.Locale;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;
        while (N <= 0) {
            System.out.println("Введите размер массива:");
            N = scan.nextInt();
            if (N <= 0) System.out.println("Ошибка: размер должен быть больше нуля");
        }
        int[] arr = new int[N];
        // double[] arr = new double[N]; // для массива дробных чисел
        fillArray(arr);
        System.out.println("Массив: ");
        printArray(arr);
        System.out.println("Максимальное, минимальное и среднее значение: ");
        System.out.println(findMax(arr) + " " + findMin(arr) + " " + findMid(arr));
    }

    public static void fillArray(int[] arr) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0;
        while (a >= b) {
            System.out.println("Введите нижнюю (включительно) и верхнюю (не включительно) границы массива:");
            a = scan.nextInt();
            b = scan.nextInt();
            if (a >= b) System.out.println("Ошибка: нижняя граница должна быть меньше верхней");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + (int) (Math.random() * (b - a));
        }
    }

    public static void fillArray(double[] arr) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US); // для ввода дробных чисел с разделителем-точкой
        double a = 0.0, b = 0.0;
        while (a >= b) {
            System.out.println("Введите нижнюю (включительно) и верхнюю (не включительно) границы массива:");
            a = scan.nextDouble();
            b = scan.nextDouble();
            if (a >= b) System.out.println("Ошибка: нижняя граница должна быть меньше верхней");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + (Math.random() * (b - a));
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr, boolean reverse) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if ((!reverse & arr[j] > arr[j + 1]) || (reverse & arr[j] < arr[j + 1])) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void sort(double[] arr, boolean reverse) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if ((!reverse & arr[j] > arr[j + 1]) || (reverse & arr[j] < arr[j + 1])) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static int findMax(int[] arr) {
        sort(arr, true);
        return arr[0];
    }

    public static double findMax(double[] arr) {
        sort(arr, true);
        return arr[0];
    }

    public static int findMin(int[] arr) {
        sort(arr, false);
        return arr[0];
    }

    public static double findMin(double[] arr) {
        sort(arr, false);
        return arr[0];
    }

    public static double findMid(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static double findMid(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
