import java.util.*;

public class subArray {
    public static void printSubarray(int num[]) {
        int sum=0; // total sum 
        int total=0; //total no of subarray
        for(int i=0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(num[k]+" ");
                    sum = sum + num[k];
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(total);
        System.out.println(sum);
    }
    public static void main(String args[]) {
        int num[]={2,4,6,8,10};
        printSubarray(num);
    }
}
