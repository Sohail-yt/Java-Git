import java.util.Scanner;

class switchcase {
     public static void main(String args[]) {
          int i = 0;
          String season;
          System.out.println("Enetr a MOnth ");
          Scanner input = new Scanner(System.in);
          int month = input.nextInt();
          for (; i < 1; i++) {
               switch (month) {
                    case 12:
                    case 1:
                    case 2:
                         season = "winter";
                         System.out.println("This Season is : " + season + ".");
                         break;
                    case 4:
                    case 5:
                    case 6:
                         season = "Summer";
                         System.out.println("This Season is : " + season + ".");
                         break;
                    case 7:
                    case 8:
                    case 9:
                         season = "spring";
                         System.out.println("This Season is : " + season + ".");
                         break;

                    default:
                         season = "Autumn";
                         System.out.println("This Season is : " + season + ".");
               }
          }
     }
}