import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter day number:");
        int n=input.nextInt();
        switch (n){
            case 1:
                System.out.printf("Saturday");
                break;
            case 2:
                System.out.printf("Sunday");
                break;
            case 3:
                System.out.printf("Monday");
                break;
            case 4:
                System.out.printf("tuesday");
                break;
            case 5:
                System.out.printf("Wednesday");
                break;
            case 6:
                System.out.printf("Thursday");
                break;
            case 7:
                System.out.printf("Friday");
                break;
            default:
                System.out.printf("Invalid day number");

        };
    }
}
