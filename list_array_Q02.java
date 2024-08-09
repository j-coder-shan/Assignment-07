public class list_array_Q02 {
    int[] list;
    int size, count;
    static double highestEfficiency = 0;
    static String mostEfficientStudent;

    list_array_Q02(int maxSize) {
        size = maxSize;
        list = new int[size];
        count = 0;
    }

    public boolean isListEmpty() {
        return count == 0;
    }

    public boolean isListFull() {
        return count == size;
    }

    public void insertLast(int value) {
        if (isListFull()) {
            System.out.println("List is full, cannot insert more elements.");
        } else {
            list[count++] = value;
        }
    }

    public void highestScore(list_array_Q02 score, String[] names) {
        int max = score.list[0];
        int index = 0;
        for (int i = 1; i < score.count; i++) {
            if (score.list[i] > max) {
                max = score.list[i];
                index = i;
            }
        }
        System.out.println(STR."The highest score is \{max} by \{names[index]}");
    }

    public void fastestTime(list_array_Q02 time, String[] names) {
        int min = time.list[0];
        int index = 0;
        for (int i = 1; i < time.count; i++) {
            if (time.list[i] < min) {
                min = time.list[i];
                index = i;
            }
        }
        System.out.println(STR."The fastest time is \{min} by \{names[index]}");
    }

    public void displayEfficiency(list_array_Q02 score, list_array_Q02 time, String[] names) {
        for (int i = 0; i < size; i++) {
            double efficiency = (double) score.list[i] / time.list[i];
            System.out.println(STR."Efficiency of \{names[i]} is: \{efficiency}");
            if (efficiency > highestEfficiency) {
                highestEfficiency = efficiency;
                mostEfficientStudent = names[i];
            }
        }
    }
}







