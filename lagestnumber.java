import java.util.*; 
class largestnumber {
    public static int largeNum(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            largest = Math.max(numbers[i],largest);
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1,2,6,3,500};
        System.out.println(largeNum(numbers));
    }
}