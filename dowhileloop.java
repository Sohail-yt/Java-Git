import java.util.Scanner;

class dowhileloop {
     public static void main(String args[]) {
          Scanner input=new Scanner(System.in);
          int a;
          
          do{
               System.out.println("Enter A Number");
               a=input.nextInt();
          }
          while(a!=9);
          System.out.println("You got 9");
     }
 }