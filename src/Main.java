import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static int count(int[] arr, int value){
        int repeatCounter = 0;
        for (int i : arr) {
            if (i == value) {
                repeatCounter++;
            }
        }
        return repeatCounter;
    }

    public static void main(String[] args) {
        int number;
        Scanner input =  new Scanner(System.in);
        System.out.println("lütfen kaç sayı girmek istediğinizi giriniz...");
        number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++){
            System.out.println("lütfen girmek istediğiniz " + (i + 1) + ". sayıyı giriniz...");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] repeat = new int[arr.length];
        int n = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if (!isFind(repeat, arr[i])) {
                        repeat[n++] = arr[i];
                    }
                    break;
                }
            }
        }
        for (int i : repeat) {
            if (i != 0) {
                int count = count(arr, i);
                System.out.print(i + " " + count + " kez tekrar edilmiştir.\n" );
            }
        }
    }
}