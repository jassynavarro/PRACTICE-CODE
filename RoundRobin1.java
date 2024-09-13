package opsys;
import java.util.Scanner;
import static opsys.RoundRobin.findWaitingTime;
import static opsys.RoundRobin.findavgTime;
 
public class RoundRobin1 {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char tryAgain;
        
        do {
            int t; //t = current time.           
            int n; //n = number of process.
            int quantum;
            int arrival_time[];                    
            int burst_time[];
            int rem_bt[];
            int turnaround_time[];  
            int waiting_time[];            
            int total_wt = 0;
            int total_tat = 0;

            //Starts with the number of process/es.
            System.out.print("Enter number of process: "); 
            n = sc.nextInt(); 
            
            System.out.print("Enter number of quantum: "); 
            quantum = sc.nextInt();            

            //initialization
            arrival_time = new int[n];    
            burst_time = new int[n];   
            rem_bt = new int[n];
            turnaround_time = new int[n];    
            waiting_time = new int[n]; 
            
            //Stores the value of the burst time in the array.
            System.out.println("Enter Process Burst Time"); 
            for (int i = 0; i < n; i++) { 
                System.out.print("P[" + (i+1) + "]: "); 
                burst_time[i] = sc.nextInt(); 
            }            
            //Formula in finding the waiting time.
            // Make a copy of burst times buerst_time[] to store
            // remaining burst times.
            for (int i = 0; i < n; i++)
                rem_bt[i] = burst_time[i];
            
            // Current time
            t = 0; 

            // Keep traversing processes in round robin manner
            // until all of them are not done.
            while (true) {
                boolean done = true;

                // Traverse all processes one by one repeatedly
                for (int i = 0; i < n; i++) {
                    // If burst time of a process is greater
                    // than 0 then only need to process further
                    if (rem_bt[i] > 0) {
                        done = false; // There is a pending
                                      // process

                        if (rem_bt[i] > quantum) {
                            // Increase the value of t i.e.
                            // shows how much time a process has
                            // been processed
                            t += quantum;

                            // Decrease the burst_time of
                            // current process by quantum
                            rem_bt[i] -= quantum;
                        }

                        // If burst time is smaller than or
                        // equal to quantum. Last cycle for this
                        // process
                        else {
                            // Increase the value of t i.e.
                            // shows how much time a process has
                            // been processed
                            t = t + rem_bt[i];

                            // Waiting time is current time
                            // minus time used by this process
                            waiting_time[i] = t - burst_time[i];

                            // As the process gets fully
                            // executed make its remaining burst
                            // time = 0
                            rem_bt[i] = 0;
                        }
                    }
                }

                // If all processes are done
                if (done == true)
                    break;

        // Method to calculate turn around time
        // calculating turnaround time by adding
        // bt[i] + wt[i]
        for (int i = 0; i < n; i++){
            turnaround_time[i] = burst_time[i] + waiting_time[i];
        }

        // Method to calculate average time
        // Display processes along with all details
        System.out.println("PN "
                            + " B "
                            + " WT "
                            + " TAT");

        // Calculate total waiting time and total turn
        // around time
        for (int i = 0; i < n; i++) {
            total_wt = total_wt + waiting_time[i];
            total_tat = total_tat + turnaround_time[i];
            System.out.println(" " + (i + 1) + "\t\t"
                               + burst_time[i] + "\t " + waiting_time[i]
                               + "\t\t " + turnaround_time[i]);
        }

        System.out.println("Average waiting time = "
                           + (float)total_wt / (float)n);
        System.out.println("Average turn around time = "
                           + (float)total_tat / (float)n);
    }                     
            System.out.print("\nTry again? (y/n): ");
            tryAgain = sc.next().charAt(0);
            
        } while (tryAgain == 'y' || tryAgain == 'Y');
 
        sc.close();
    }
}
