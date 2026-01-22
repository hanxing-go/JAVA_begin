import java.util.Scanner;

public class StringBufferExe {
    public static void main(String[] args) {
        String price;
        Scanner sc = new Scanner(System.in);
        price = sc.nextLine();

        StringBuffer sb = new StringBuffer(price);
        for (int i = sb.indexOf(".") - 3; i > 0; i-=3) {
            sb.insert(i, ",");
        }

        System.out.println(sb);
    }
}
