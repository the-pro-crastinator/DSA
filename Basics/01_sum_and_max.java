// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of array: n");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum = sum +arr[i];
        }
        System.out.println("the sum of array is " + sum);
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the greatest element is: " + max);
    }
}
