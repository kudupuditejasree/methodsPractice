import java.util.Scanner;

public class MethodEO {


        static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            if (isEven(n)) {
                System.out.println(n + " is an even number.");
            } else {
                System.out.println(n + " is an odd number.");
            }
        }
    }

