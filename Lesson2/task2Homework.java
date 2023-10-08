package Lesson2;

public class task2Homework {
    public static void main(String[] args){
    try {
        int[] intArray = new int[10]; //создали массив
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     }
    }
}
