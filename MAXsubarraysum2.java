//PREFIX SUM
public class MAXsubarraysum2 {
    public static void prefixsum(int num[]) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0]=num[0];
        for(int k=1; k < prefix.length; k++) {
            prefix[k] = prefix[k-1] + num[k];
        }
        for(int i=0 ; i<num.length; i++ ) {
            for(int j=0; j<num.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1]; //???
                if(maxsum < currsum) {
                    maxsum = currsum;               
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]) {
        int num[]={1, -2, 6, -1, 3};
        prefixsum(num);
    }
}
 