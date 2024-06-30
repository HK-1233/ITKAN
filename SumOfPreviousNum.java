import java.util.Scanner;

class SumOfPreviousNum {
    
    public static void main(String[] args) {
        
        System.out.println("Hello user. Please enter a positive number so that I can give you the sum of your number and all the numbers previous to it: ");
        Scanner sc = new Scanner(System.in);
        int usernumber = sc.nextInt();
        int sum = 0;
        boolean repeat = true;
        while(repeat){
          
          if(usernumber>0){
          for(int calculation = 1; calculation<=usernumber; calculation++){
            sum = sum + calculation;
        }
        System.out.println(sum);
          }
          System.out.println("Hello user. Please enter a positive number so that I can give you the sum of your number and all the numbers previous to it: ");
        sc = new Scanner(System.in);
        usernumber = sc.nextInt();
        if(usernumber<0){
            System.out.println("Invalid.");
            System.out.println("");
            sc = new Scanner(System.in);
        }
        if(usernumber==0){
            repeat = false;
        }
        }
    }
}
        
        
