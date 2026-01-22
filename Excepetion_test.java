import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepetion_test {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int  res = num1/ num2;
        } catch (Exception e) {
            System.out.println("出现异常的原因" + e.getMessage());
        }

        System.out.println("程序继续运行");

        // 如果用户输入的不是一个整数，就提示他反复输入，直到输入一个证书为止
        while(true) {
            System.out.println("请输入一个整数");
            try {
                Scanner sc = new Scanner(System.in);
                int in = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("请输入整数");
            }
        }
    }
}
