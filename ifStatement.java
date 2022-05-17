class ifStatement {
     public static void main(String args[]) {
          int a=1145;
          int b=65;
          int c=95;
          if(a>b & a>c){
               if(a>40){
                    System.out.printf("%d>40\n",a);
               }
               else{
                    System.out.printf("%d<40\n",a);
               }
               System.out.printf("a=%d is bigger",a);
          }
          else if(b>a & b>c){
               System.out.printf("b=%d is bigger",b);
          }
          else{
               System.out.printf("c=%d is bigger",c);
          }
     }
 }