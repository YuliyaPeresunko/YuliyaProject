package HomeWork.hw2.task2;
//2) Написать перегруженный метод, который может:
//  - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
//    "Я пустой".
//  - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
//  - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
//    через пробел.
//  - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
//    массива.
//  - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
//    "Ваше сообщение - "%%%%%%%%", ваше число -  $",
//    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.
public class Main {
    public static void main(String[] args) {
        Peregruz p = new Peregruz();

        p.peregruz();
        p.peregruz("Строка строка строка");
        p.peregruz( new String[] {  "Это", "массив", "строк"} ) ;
        p.peregruz(new int[] {1,2,3});
        p.peregruz(5, "i love java");

    }
}
