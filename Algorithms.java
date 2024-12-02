import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private File file;
    private Scanner scanner;

    public Algorithms(String fileName) throws FileNotFoundException {
        this.file = new File(fileName);
    }

    public int countOdds() throws FileNotFoundException {
        scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()) {
            if (scanner.nextInt() % 2 != 0) count++;
        }
        scanner.close();
        return count;
    }

    public int countEvens() throws FileNotFoundException {
        scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()) {
            if (scanner.nextInt() % 2 == 0) count++;
        }
        scanner.close();
        return count;
    }

    public int countTwoDigitNumbers() throws FileNotFoundException {
        scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num >= 10 && num <= 99) count++;
        }
        scanner.close();
        return count;
    }

    public int countGreaterThan500() throws FileNotFoundException {
        scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNext()) {
            if (scanner.nextInt() > 500) count++;
        }
        scanner.close();
        return count;
    }

    public int findGreatest() throws FileNotFoundException {
        scanner = new Scanner(file);
        int greatest = Integer.MIN_VALUE;
        while (scanner.hasNext()) {
            greatest = Math.max(greatest, scanner.nextInt());
        }
        scanner.close();
        return greatest;
    }

    public int findLeast() throws FileNotFoundException {
        scanner = new Scanner(file);
        int least = Integer.MAX_VALUE;
        while (scanner.hasNext()) {
            least = Math.min(least, scanner.nextInt());
        }
        scanner.close();
        return least;
    }

    public int calculateSum() throws FileNotFoundException {
        scanner = new Scanner(file);
        int sum = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }
        scanner.close();
        return sum;
    }

    public double calculateMean() throws FileNotFoundException {
        scanner = new Scanner(file);
        int sum = 0, count = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
            count++;
        }
        scanner.close();
        return Math.round((double) sum / count * 1000.0) / 1000.0;
    }

    public int findMode() throws FileNotFoundException {
        scanner = new Scanner(file);
        Map<Integer, Integer> frequency = new HashMap<>();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        scanner.close();

        int mode = Integer.MIN_VALUE;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
