// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for three subjects out of 100: ");
        System.out.println("Enter score for first subject: ");
        int score1 = sc.nextInt();
        System.out.println("Enter score for second subject: ");
        int score2 = sc.nextInt();
        System.out.println("Enter score for third subject: ");
        int score3 = sc.nextInt();
        
        int total = score1 + score2 + score3;
        int average = total/3;
        char grade = calculateGrade(average);
        System.out.println("The grade is: " + grade);
    }
        public static char calculateGrade(int score){
            if(score >= 90) return 'A';
            else if(score >= 80) return 'B';
            else if(score >= 70) return 'C';
            else if(score >= 60) return 'D';
            else return 'F';
        }
}
        // // public class Student{
        // //     private String name;
        // //     private int score;
        // //     private char grade;
            
        // //     public Student(String name, int score){
        // //         this.name = name;
        // //         this.score = score;
        // //         this.grade = calculateGrade(score);
                
        // //     }
            
            
        // }
        
        
