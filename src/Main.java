import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size mang");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap cac phan tu cua mang");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,5));



    }
    public static int binarySearch(int[]array,int value){

        int left = 0 ;
        int right = array.length -1;

        for (int i = 0; i < array.length; i++) {
            int middle = (left +right)/2;
            if (array[middle] == value){

                return middle;
            }else if (value > array[middle]){
                left = middle +1;
            }else {
                right = middle -1;
            }
        }
        return -1;
    }
}