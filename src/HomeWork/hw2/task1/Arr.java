package HomeWork.hw2.task1;
// 1.Написать метод, принимающий в качестве параметра массив целых чисел.
// И выводит на экран все четные числа списком,
// а также нечетные числа списком.
public class Arr {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
        Method(arr1);
    }

    public static void Method(int[] ar) {
        System.out.println("Четные числа : ");

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                System.out.println(ar[i]);}
        }
        System.out.println("Нечетные числа : ");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                System.out.println(ar[i]);}
    }
}}