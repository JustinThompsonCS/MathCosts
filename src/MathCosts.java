import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;


public class MathCosts {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("mathCosts.dat"));
        String currentLine = scanner.nextLine();
        while(!currentLine.equals("0")){
            Scanner lineReader = new Scanner(currentLine);
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            int numNums = lineReader.nextInt();

            currentLine = scanner.nextLine();
            lineReader = new Scanner(currentLine);
            for (int i = 0; i < numNums; i++) {
                priorityQueue.add(lineReader.nextInt());
            }
            currentLine = scanner.nextLine();
            lineReader = new Scanner(currentLine);






            int cost = 0;
            int num = 0;
            while (!priorityQueue.isEmpty()){

                int j = priorityQueue.remove();
                int k = 0;

                if (!priorityQueue.isEmpty()){
                    k = priorityQueue.remove();
                    num = k + j;
                    priorityQueue.add(num);
                    cost += num;
                }



            }
            System.out.println(cost);
        }

    }

}
