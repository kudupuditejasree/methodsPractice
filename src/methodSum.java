import java.util.Scanner;

public class methodSum {
    static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("The first number is:");
        int a=scanner.nextInt();
        System.out.println("The second number is:");
        int b=scanner.nextInt();
        int result=add(a,b);
        System.out.println("sum="+result);
        System.out.println("sum=");


    }
}
