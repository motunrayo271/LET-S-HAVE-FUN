import java.util.Scanner;
  public class TaskOne{
  public static void main(String[] args){


  Scanner input = new Scanner(System.in);
  System.out.print("Enter numbers");
 
 int total = 0;
for(int numbers = 1; numbers <= 10; numbers++){
  int num = input.nextInt();
  total += numbers;
System.out.println(total);
    }
  }
} 
