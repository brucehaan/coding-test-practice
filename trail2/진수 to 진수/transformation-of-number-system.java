import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String[] stringArr = sc.next().split("");
        int len = stringArr.length;
        int[] arr2 = new int[len];

        for (int i = 0; i < len; i++) {
            arr2[i] = Integer.valueOf(stringArr[i]);
        }
        int result = 0;
        for(int i = 0; i < len; i++) {
            result = result * a + arr2[i];
        }

        int[] arr = new int[30];
        int cnt = 0;

        while (true) {
            if (result < b) {
                arr[cnt++] = result;
                break;
            }
            arr[cnt++] = result % b;
            result /= b;
        }
        for(int i = cnt-1; i >= 0; i--){ 
            System.out.print(arr[i]);
        }
    }
}