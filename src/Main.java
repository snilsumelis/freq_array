import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 0;
        int num = 0;
        System.out.println("Dizi : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                    num =arr[i];
                }
            }
            if (count >0) {
                count+=1;
                System.out.println(num + " sayısı " + count + " kere tekrar edildi.");
            }
            count = 0;
        }
    }
}