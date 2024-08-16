import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        //Process 1
        System.out.println("");        
        System.out.println("Process: 1");        
        System.out.print("Enter Arrival Time:");
        int at = sc.nextInt();
        
        System.out.print("Enter Burst Time:");
        int bt = sc.nextInt();        
        
        int turnAround = bt - at;
        int waitingTime = turnAround - bt;
        
        System.out.println("Process: 1" );
        System.out.println("Wait time: " + waitingTime );  
        System.out.println("Turn Around time: " + turnAround );   
        
        //Process 2
        System.out.println("");        
        System.out.println("Process: 2");        
        System.out.print("Enter Arrival Time:");
        int at2 = sc.nextInt();
        
        System.out.print("Enter Burst Time:");
        int bt2 = sc.nextInt();        
        
        int completionTime2 = bt2 + bt;
        int turnAround2 = completionTime2 - at2;
        int waitingTime2 = turnAround2 - bt2;
        
        System.out.println("Process: 2" );
        System.out.println("Wait time: " + waitingTime2 );  
        System.out.println("Turn Around time: " + turnAround2 );     
        
        //Process 3
        System.out.println("");        
        System.out.println("Process: 3");        
        System.out.print("Enter Arrival Time:");
        int at3 = sc.nextInt();
        
        System.out.print("Enter Burst Time:");
        int bt3 = sc.nextInt();        
        
        int completionTime3 = completionTime2 + bt3;
        int turnAround3 = completionTime3 - at3;
        int waitingTime3 = turnAround3 - bt3;
        
        System.out.println("Process: 3" );
        System.out.println("Wait time: " + waitingTime3 );  
        System.out.println("Turn Around time: " + turnAround3 );         
        
        //Process 4
        System.out.println("");        
        System.out.println("Process: 4");        
        System.out.print("Enter Arrival Time:");
        int at4 = sc.nextInt();
        
        System.out.print("Enter Burst Time:");
        int bt4 = sc.nextInt();        
        
        int completionTime4 = completionTime3 + bt4;
        int turnAround4 = completionTime4 - at4;
        int waitingTime4 = turnAround4 - bt4;
        
        System.out.println("Process: 4" );
        System.out.println("Wait time: " + waitingTime4 );  
        System.out.println("Turn Around time: " + turnAround4 );
        
        //Final output:
        System.out.print("");        
        System.out.print("Overall");        
        int totalWait = waitingTime + waitingTime2 +waitingTime3 +waitingTime4;
        int totalturnAround = turnAround + turnAround2 + turnAround3 + turnAround4;
        float avetotalWait = (totalWait)/4f;
        float aveturnAround = (totalturnAround)/4f;
        float throughPut = 4f/(completionTime4);
        System.out.println("");
        System.out.println("Process 1: " + waitingTime + " " + turnAround);
        System.out.println("Process 2: " + waitingTime2 + " " + turnAround2);        
        System.out.println("Process 3: " + waitingTime3 + " " + turnAround3);
        System.out.println("Process 4: " + waitingTime4 + " " + turnAround4); 
        System.out.println("");
        System.out.println("Total wait time: " + totalWait); 
        System.out.println("Average wait time: " + avetotalWait);        
        System.out.println("Total turn around time: " + totalturnAround);
        System.out.println("Average turn around time: " + aveturnAround);  
        System.out.println("Throughput: " + throughPut);
    }
    
}
