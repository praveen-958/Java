package LOOPS;

import java.util.Scanner;

public class Forloop {

    public static void main(String[] args) {
        // print the table of n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
        sc.close();
    }
}
