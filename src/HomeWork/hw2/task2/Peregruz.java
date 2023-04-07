package HomeWork.hw2.task2;

public class Peregruz {

    public void peregruz(){
        System.out.println("Я пустой ");
    }

    public void peregruz (String string){
        System.out.println(string);}

    public void peregruz (String[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public void peregruz (int[] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum= sum+ar[i];
        } System.out.println(" \nСумма элементов массива = " + sum);
    }

    public void peregruz (int num, String str) {
        System.out.println("Ваше сообщение - " + str + ", ваше число - " + num);
    }
}
