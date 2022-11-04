import java.util.Scanner;

public class GpaCalculator {
    public static void main(String[] args){
        int math,physics,chem,history,english;

        Scanner input = new Scanner(System.in);
            System.out.print("Your Math Score : ");
            math = input.nextInt();

            System.out.print("Your Physics Score : ");
            physics = input.nextInt();

            System.out.print("Your Chemistry Score : ");
            chem = input.nextInt();

            System.out.print("Your History Score : ");
            history = input.nextInt();

            System.out.print("Your English Score : ");
            english = input.nextInt();
    

        int scores = (math + physics + chem + history + english);
        double gpa = scores / 5.0;

        boolean condition = gpa >= 60;
        String total = (condition) ? "You Passed." : "You Failed.";
        System.out.println("Your GPA = " + gpa);
        

        System.out.println("" + total);
    }
}
