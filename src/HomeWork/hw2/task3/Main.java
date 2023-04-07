package HomeWork.hw2.task3;

public class Main {
    public static void main(String[] args) {

        Tree object1 = new Tree();
        object1.getInfo();
        System.out.println("----------");
        Tree object2 = new Tree(2, 15, "зеленый");
        object2.getInfo();
        System.out.println("----------");
        Tree object3 = new Tree("Дуб", 3);
        object3.getInfo();
        System.out.println("----------");
        Tree object4 = new Tree("Орех");
        object4.getInfo();


    }
}