public class array {

     public static void main(String[] args) {
          System.out.println("The array is");
          int[] array = new int[3];
          array[0] = 10;
          array[1] = 50;
          array[2] = 1000;
          for (int index = 0; index < array.length; index++) {
               System.out.println(array[index]);
          }
     }
}
