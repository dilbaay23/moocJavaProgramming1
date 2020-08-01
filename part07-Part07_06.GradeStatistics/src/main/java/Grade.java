
import java.util.ArrayList;

public class Grade {

    private int score;
    private ArrayList<Integer> list = new ArrayList<>();

    public Grade() {

    }

    public ArrayList addList(int score) {
        if (score >= 0 && score <= 100) {
            list.add(score);
        }
        return list;
    }

    public int getScore() {
        return score;
    }

    public void avgScore() {
        int sum = 0;
        double avg;
        for (Integer integer : list) {
            sum += integer;

        }
        avg = (double) sum / list.size();
        System.out.println("Point average (all): " + avg);

    }

    public void avgPassScore() {
        int sumPass = 0;
        int countPass = 0;
        double avgPass;

        for (Integer integer : list) {
            if (integer >= 50) {
                sumPass += integer;
                countPass++;
            }
        }
        if (countPass > 0) {
            avgPass = (double) sumPass / countPass;
            System.out.println("Point average (passing): " + avgPass);

        } else {
            System.out.println("Point average (passing): -");

        }

    }

    public double passPercantage() {
        int countPass = 0;
        double passPercentage = 0;
        for (Integer integer : list) {
            if (integer >= 50) {
                countPass++;
            }
            passPercentage = 100 * ((double) countPass / list.size());

        }
        return passPercentage;
    }

    public void distribution() {
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        star(countDistribution(90, 100));
        System.out.print("4: ");
        star(countDistribution(80, 89));
        System.out.print("3: ");
        star(countDistribution(70, 79));
        System.out.print("2: ");
        star(countDistribution(60, 69));
        System.out.print("1: ");
        star(countDistribution(50, 59));
         System.out.print("0: ") ;
        star(countDistribution(0,49));

    }

    public int countDistribution(int lowLimit, int highLimit) {
        int count = 0;
        for (Integer integer : list) {
            if (integer >= lowLimit && integer <= highLimit) {
                count++;
            }
        }
        return count;
    }

    public void star(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");     
        }
        System.out.println("");
    }

}
