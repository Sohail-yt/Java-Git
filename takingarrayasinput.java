import java.util.Scanner;

public class takingarrayasinput {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter how many elements");
          int elements=sc.nextInt();

          int arr[]=new int[elements];
          for (int i = 0; i < elements; i++) {
               System.out.println("Enter "+i+" Element");
               arr[i]=sc.nextInt();
          }
          for (int i = 0; i < elements; i++) {
               System.out.println("The array you Entered is : "+arr[i]);                              
          }

     }     
}
