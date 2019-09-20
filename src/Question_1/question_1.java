package Question_1;
import java.util.*;

public class question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter a: ");
        int b = scanner.nextInt();
        System.out.print("NOK: " + nok(a, b));
    }
    public static int nod (int a, int b){
        int c = a%b;
        a=b;
        b=c;
        if (c>0){
            return nod (a, b);
        }
        else {
            return a;
        }
    }
    public static int nok (int a, int b){
        return a*(b/nod(a,b));
    }
}
