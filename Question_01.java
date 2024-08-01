import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the list:");
        int size = input.nextInt();
        list_array listArray = new list_array(size);

        System.out.println("Enter the number of elements to be inserted: )");
        for (int i = 0; i < size; i++) {
            int element = input.nextInt();
            listArray.insertLast(element);
        }
        //method to calculate mean
        listArray.calculateMean();

        //method to calculate median
        listArray.calculateMedian();

        //method to calculate mode
        listArray.calculateMode();

        //method to calculate range
        listArray.calculateRange();
    }
}