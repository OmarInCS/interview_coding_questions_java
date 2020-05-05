import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        var newArr = isPower(arr);
        for (int n : newArr) {
            System.out.println(n);
        }
    }

    public static int[] isPower(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.bitCount(arr[i]) == 1 ? 1 : 0;
        }

        return newArr;
    }
}