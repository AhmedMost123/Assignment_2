import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.printf("Enter a number:");
      String number=input.next();
      int size=number.length();
      int i=size;
        while (--i >= 0) {
            System.out.print(number.charAt(i));
        }


    }
}
