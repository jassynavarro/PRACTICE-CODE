package opsys;

import java.util.Scanner;
 
public class Lab1 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char tryAgain;
        
        do {
            int n;
            int burst_time[];
            int waiting_time[]; 
            int turnaround_time[]; 
            float avg_waiting_time = 0;
            float avg_turnaround_time = 0;

            //Starts with the number of process/es.
            System.out.print("Enter total number of process/es: "); 
            n = sc.nextInt(); 

            //The number of process/es will also be used for the size of the array in these variables:
            burst_time = new int[n]; 
            waiting_time = new int[n]; 
            turnaround_time = new int[n];

            //Stores the value of the burst time in the array.
            System.out.println("Enter Process Burst Time"); 
            for (int i = 0; i < n; i++) { 
                System.out.print("P[" + (i+1) + "]: "); 
                burst_time[i] = sc.nextInt(); 
            }

            // Waiting time for first process is 0
            waiting_time[0] = 0;  

            // Calculating waiting time 
            for (int i = 1; i < n; i++) { 
                waiting_time[i] = 0; 
                for (int j = 0; j < i; j++) { 
                    waiting_time[i] += burst_time[j]; 
                } 
            } 

            // Calculating turnaround time by adding burst_time and waiting_time 
            for (int i = 0; i < n; i++) { 
                turnaround_time[i] = burst_time[i] + waiting_time[i]; 
                avg_turnaround_time += turnaround_time[i]; 
            } 

            avg_turnaround_time /= n; 
            System.out.println("Average Turnaround Time: " + avg_turnaround_time + "ms"); 

            // Calculating average waiting time 
            for (int i = 0; i < n; i++) { 
                avg_waiting_time += waiting_time[i]; 
            } 

            avg_waiting_time /= n; 
            System.out.println("Average Waiting Time: " + avg_waiting_time + "ms"); 

            System.out.println("Process\tBurst Time\tWaiting Time\tTurnaround Time"); 
            for (int i = 0; i < n; i++) { 
                System.out.println("P[" + (i+1) + "]\t" + burst_time[i] + "\t\t" + waiting_time[i] + "\t\t" + turnaround_time[i]); 
            }  
            
            System.out.print("\nTry again? (y/n): ");
            tryAgain = sc.next().charAt(0);
 
        } while (tryAgain == 'y' || tryAgain == 'Y');
 
        sc.close();
    }
}
