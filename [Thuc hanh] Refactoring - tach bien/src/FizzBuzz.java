import java.util.Scanner;

public class FizzBuzz {
    public static boolean isDivisibleThree(int number){
        return number % 3 == 0;
    }
    public static boolean isDivisibleFive(int number){
        return number % 5 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập số");
            int number = sc.nextInt();

            String messageFizz = "Fizz";
            String messageBuzz = "Buzz";
            String messageFizzBuzz = "FizzBuzz";

            if (isDivisibleThree(number) && isDivisibleFive(number)) {
                System.out.println(messageFizzBuzz);
            } else if (isDivisibleFive(number)) {
                System.out.println(messageBuzz);
            } else if (isDivisibleThree(number)) {
                System.out.println(messageFizz);
            } else System.out.println("Nhập lại");
        }while (true);
    }
}
