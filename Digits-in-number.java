import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.printf("Enter a number:");
      int number=input.nextInt();
      int counter=0;
      while(number!=0){
          number/=10;
          counter++;
      }
        System.out.printf("Digits in the number:"+counter);

    }
}
