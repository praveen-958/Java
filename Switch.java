
package LOOPS;

import java.util.*;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("not hello");
                break;

            default:
                System.out.println("bhagg yaha see");
                break;
        }
        sc.close();
    }

}
