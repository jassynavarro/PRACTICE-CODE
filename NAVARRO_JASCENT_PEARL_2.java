import java.util.Scanner;
 
public class NAVARRO_JASCENT_PEARL_2 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char tryAgain;
        
        do {
            //n = number of process.
            int n;
            int arrival_time[];                    
            int burst_time[];
            int exit_time[];
            int turnaround_time[];  
            int waiting_time[];            
            float avg_waiting_time = 0;
            float avg_turnaround_time = 0;

            //Starts with the number of process/es.
            System.out.print("Enter number of process: "); 
            n = sc.nextInt(); 
            
            if(n > 5 || n < 3) {
                System.out.println("Only input 3 to 5 processes");                
            }
            else{
                //initialization
                arrival_time = new int[n];    
                burst_time = new int[n];
                exit_time = new int[n];    
                turnaround_time = new int[n];    
                waiting_time = new int[n];            

                //Stores the value of the arrival time in the array.
                System.out.println("Enter Process Arrival Time"); 
                for (int i = 0; i < n; i++) { 
                    System.out.print("P[" + (i+1) + "]: "); 
                    arrival_time[i] = sc.nextInt(); 
                }            

                //Stores the value of the burst time in the array.
                System.out.println("Enter Process Burst Time"); 
                for (int i = 0; i < n; i++) { 
                    System.out.print("P[" + (i+1) + "]: "); 
                    burst_time[i] = sc.nextInt(); 
                }            

                //Stores the value of the exit time in the array.
                System.out.println("Enter Process Exit Time"); 
                for (int i = 0; i < n; i++) { 
                    System.out.print("P[" + (i+1) + "]: "); 
                    exit_time[i] = sc.nextInt(); 
                }  

                // Calculating turnaround time by subtracting exit_time and arrival_time 
                for (int i = 0; i < n; i++) { 
                    turnaround_time[i] = exit_time[i] - arrival_time[i]; 
                    avg_turnaround_time += turnaround_time[i]; 
                }            

                // Calculating waiting time by subtracting turn around time and burst_time 
                for (int i = 0; i < n; i++) { 
                    waiting_time[i] = turnaround_time[i] - burst_time[i]; 
                    avg_waiting_time += waiting_time[i]; 
            }            
            
            //Title of the Lab Act.
            System.out.println("\nTITLE: SJF ALGORITHM\n"); 

            System.out.println("Enter no. of process: " + n);            
            System.out.println("PROCESS ID\tARRIVAL TIME\tBURST TIME\tEXIT TIME\tTURN AROUND TIME\tWAITING TIME"); 
            for (int i = 0; i < n; i++) { 
                System.out.println("   P" + (i+1) + "\t\t      " + arrival_time[i] + "\t\t     " + burst_time[i] + "\t\t    " + exit_time[i] + "\t\t       " + turnaround_time[i] + "\t\t      " + waiting_time[i]); 
            }              
            
            avg_turnaround_time /= n; 
            System.out.println("Average Turn Around Time: " + avg_turnaround_time + " unit"); 

            avg_waiting_time /= n; 
            System.out.println("Average Waiting Time: " + avg_waiting_time + " unit");            
            }
            System.out.print("\nTry again? (y/n): ");
            tryAgain = sc.next().charAt(0);
            
        } while (tryAgain == 'y' || tryAgain == 'Y');
 
        sc.close();
    }
}
