import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] binary = sc.next().split("");
        int[] arr = new int[binary.length];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(binary[i]);
        }

        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result = result * 2 + arr[i];
        }
        System.out.print(result);
    }
}