package HomeWork.hw2.task4;
//Создать класс калькулятор.
//   В нем создать методы:
//   summ, minus, multiply, division.
//   Сложение, вычитание, умножение и деление соответственно.
//   Каждый метод принимает в качестве параметров два значения типа double.
//   И выводит в консоль результат действия.
//
//   Также в классе есть метод старт. Который выводит сообщение в консоль, что
//   калькулятор запущен. И предлагает ввести действие в вашей консоли.
//
//   Калькулятор должен принимать только следующие типы действий:
//   2+4;    - пример синтаксиса сложения;
//   5-6;    - пример синтаксиса вычитания;
//   25*3;   - пример синтаксиса умножения;
//   34/3;   - пример синтаксиса деления;
//   После ввода действия на консоль выводится ответ этого действия.
//   И после снова выводится сообщение о предложении ввести действие.
//
//   в случае ввода другого синтаксисана консоль возвращается сообщение:
//   "Введите корректное действие".
//   И после снова выводится сообщение о предложении ввести действие.
//
//   Программа закрывается после ввода команды Stop.
//   Перед закрытием на консоль должно выводится сообщение:
//   "Калькулятор закрыт".

import java.util.Scanner;

public class Calculator {
    public void summ (double x, double y){

        double sum= x+y;
        System.out.println("Ответ = " + sum);
    }
    public void minus ( double x, double y){

       double minus= x-y;
        System.out.println("Ответ = " + minus);
    }
    public void multiply ( double x, double y){
        double mult = x * y;
        System.out.println("Ответ = " + mult);
    }
    public void division ( double x, double y){
        double div= x/y;
        System.out.println("Ответ = " + div);
    }


    public void start ( ){
        System.out.println("Калькулятор запущен.");
        Scanner sc = new Scanner(System.in);
        String action;

        System.out.println("Введите ваше действие");
        action = sc.nextLine();
        
        while (!action.equalsIgnoreCase("Stop")) { // віполняем цикл ,пока утверждение не станет ложнім
            if (action.contains("+")) {
                double number1 = Double.parseDouble(action.split("\\+")[0]); //разделяем строку до знака + и после, первое число - 0 элемент
                double number2 = Double.parseDouble(action.split("\\+")[1]); // второе число 1 элемент
                summ(number1, number2);
            } else if (action.contains("-")) {
                double number1 = Double.parseDouble(action.split("\\-")[0]); //разделяем строку до знака - и после, первое число - 0 элемент
                double number2 = Double.parseDouble(action.split("\\-")[1]); // второе число 1 элемент
                minus(number1, number2);
            } else if (action.contains("*")) {
                double number1 = Double.parseDouble(action.split("\\*")[0]); //разделяем строку до знака * и после, первое число - 0 элемент
                double number2 = Double.parseDouble(action.split("\\*")[1]); // второе число 1 элемент
                multiply(number1, number2);
            } else if (action.contains("/")) {
                double number1 = Double.parseDouble(action.split("\\/")[0]); //разделяем строку до знака / и после, первое число - 0 элемент
                double number2 = Double.parseDouble(action.split("\\/")[1]); // второе число 1 элемент
                division(number1, number2);
            } else System.out.println("Введено некорректное действие");
            System.out.println("Введите ваше действие");
            action = sc.nextLine();
        }
        System.out.println("Калькулятор закрыт");
    }
}
