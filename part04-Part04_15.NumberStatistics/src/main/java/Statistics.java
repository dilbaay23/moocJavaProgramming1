
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {

        return sum;
    }

    public double average() {
        if (count == 0) {
            return 0.0;
        } else {
            return this.sum / (double) count;
        }
    }
}
