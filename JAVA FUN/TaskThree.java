import java.util.Scanner;
  public class TaskThree{
  public static void main(String[] args){


    Scanner input = new Scanner(System.in);
   
    int average = 0; 
    int total = 0;
    int scores = 0;

for(int count = 1; count <= 10; count++){
   System.out.print("Enter scores ");
    scores = input.nextInt();
    total = total + scores;
}


System.out.println("The total scores is equal to:" + total);
average = total/10;
System.out.println("The average of the scores is:" + average);
    }
  
} 
