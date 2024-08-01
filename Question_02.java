import java.util.Scanner;

public class Question_02 {
    static String[] names;
    static int size;
    static Scanner input = new Scanner(System.in);

    public static void addParticipants() {
        System.out.println("Enter the number of participants:");
        size = input.nextInt();
        names = new String[size];

        System.out.println("Enter the names of the participants:");
        for (int i = 0; i < size; i++) {
            names[i] = input.next();
        }
    }

    public static void addScoresAndTime(list_array_Q02 score, list_array_Q02 time) {
        System.out.println("Enter the scores and time of the participants:");
        for (int i = 0; i < size; i++) {
            System.out.println(STR."Enter the score of \{names[i]}:");
            score.insertLast(input.nextInt());
            System.out.println(STR."Enter the time of \{names[i]}:");
            time.insertLast(input.nextInt());
        }
    }

    public static void main(String[] args) {
        addParticipants();

        list_array_Q02 score = new list_array_Q02(size);
        list_array_Q02 time = new list_array_Q02(size);

        addScoresAndTime(score, time);

        score.highestScore(score, names);
        time.fastestTime(time, names);
        time.displayEfficiency(score, time, names);

        System.out.println(STR."The most efficient participant is \{list_array_Q02.mostEfficientStudent} with efficiency of \{list_array_Q02.highestEfficiency}");
    }
}
