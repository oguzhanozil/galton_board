package os_project1;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int numThreads = 0;
        int numBins = 0;
        if (args.length != 4) {
            System.out.println("Usage: java -jar GaltonBoard.jar -numThread <number_of_threads> -numBins <number_of_bins>");
            return;
        }
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].equals("-numThread")) {
                numThreads = Integer.parseInt(args[i + 1]);
            } else if (args[i].equals("-numBins")) {
                numBins = Integer.parseInt(args[i + 1]);
            } else {
                System.out.println("Invalid parameter: " + args[i]);
                return;
            }
        }
        if (numThreads <= 0 || numBins <= 0) {
            System.out.println("Number of threads and number of bins must be positive integers.");
            return;
        }
    
      
       
       board myBoard=new board(numBins);
       
       
       for (int i = 0; i < numThreads; i++) {
        balls ball = new balls(myBoard);
        ball.start();
    }

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
       
       System.out.println("Counts of threads in each slot:");
       int binValues = myBoard.displayCounts();
       System.out.println("Number of requested threads="+numThreads);
       System.out.println("Sum of bin values = "+binValues);
       if(binValues==numThreads)
       {
        System.out.println("Nice work! Both of them are equal");
       }
       
    }
}
