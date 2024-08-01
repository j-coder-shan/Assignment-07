public class list_array {
    int[] list;
    int size, count;

    list_array(int maxSize) {
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
            System.out.println("List is full!");
        } else {
            System.out.println(STR."Inserting last: \{value}");
            list[count++] = value;
        }
    }

    public void calculateMean() {
        if (isListEmpty()) {
            System.out.println("List is empty!");
        } else {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += list[i];
            }
            System.out.println(STR."Mean of the list is: \{sum / count}");
        }
    }
    public void calculateMedian() {
        if (isListEmpty()) {
            System.out.println("List is empty!");
        } else {
            int median;
            if (count % 2 == 0) {
                median = (list[count / 2] + list[count / 2 - 1]) / 2;
            } else {
                median = list[count / 2];
            }
            System.out.println(STR."Median of the list is: \{median}");
        }
    }
    public void calculateMode() {
        if (isListEmpty()) {
            System.out.println("List is empty!");
        } else {
            int mode = list[0];
            int maxCount = 0;
            for (int i = 0; i < count; i++) {
                int value = list[i];
                int count = 0;
                for (int j = 0; j < count; j++) {
                    if (list[j] == value) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
            System.out.println(STR."Mode of the list is: \{mode}");
        }
    }
    public void calculateRange() {
        if (isListEmpty()) {
            System.out.println("List is empty!");
        } else {
            int min = list[0];
            int max = list[0];
            for (int i = 1; i < count; i++) {
                if (list[i] < min) {
                    min = list[i];
                }
                if (list[i] > max) {
                    max = list[i];
                }
            }
            System.out.println(STR."Range of the list is: \{max - min}");
        }
    }
}
