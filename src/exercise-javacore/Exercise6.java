import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Enter score:");

        int scoreStudent = score.nextInt();

        if(scoreStudent >=80 && scoreStudent <= 100){
            System.out.println("Student's rank is A");
        }else if(scoreStudent >=60 && scoreStudent <80){
            System.out.println("Student's rank is B");
        }else if(scoreStudent >= 40 && scoreStudent < 60){
            System.out.println("Student's rank is C");
        }else if(scoreStudent >= 20 && scoreStudent < 40){
            System.out.println("Student's rank is D");
        }else if(scoreStudent >=0 && scoreStudent < 20){
            System.out.println("Student's rank is E");
        }else{
            System.out.println("Score is not larger than 100 and smaller than 0");
        }
    }    
}
