import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Enter number of students:");
        Scanner input= new Scanner(System.in);

        int n= input.nextInt();
        input.nextLine();
        while(n-->0){
            System.out.printf("Enter Student Name:");

            String name= input.nextLine();
            System.out.printf("Enter the 3 exam scores:");
            double d1= input.nextDouble();
            double d2= input.nextDouble();
            double d3= input.nextDouble();
            double average=((d1+d2+d3)/3);
            System.out.println("Student Name:" + name);
            System.out.println("Average score:"+ average);
            if(average>=85){
                System.out.printf("Grade is A");

            } else if (average>=70 && average<85) {
                System.out.printf("Grade is B");
            }else if (average>=50 && average<70) {
                System.out.printf("Grade is B");
            }else if (average<50) {
                System.out.printf("Grade is F");
            }
            input.nextLine();
        }



        }
    }
