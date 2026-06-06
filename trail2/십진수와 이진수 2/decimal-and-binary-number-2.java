import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] binary = sc.next().split("");
        int len = binary.length;
        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            arr[i] = Integer.valueOf(binary[i]);
        }
        
        int result = 0;
        for(int i = 0; i < len; i++) {
            result = result * 2 + arr[i];
        }
        result *= 17;

        int[] arr2 = new int[30];
        int cnt = 0;

        while (true) {
            if (result < 2) {
                arr2[cnt++] = result;
                break;
            }
            arr2[cnt++] = result % 2;
            result /= 2;
        }
        for(int i = cnt-1; i >= 0; i--) {
            System.out.print(arr2[i]);
        }
    }
}