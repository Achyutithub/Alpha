public class MAXsubarrysum3 {
    public static void kadanes(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            cs = cs + num[i];
            if(cs<0) {
                cs=0;
            }
            ms = Math.max(cs, ms);
    }
    System.out.println("max subarray sum is ="+ ms);
}

    public static void main(String args []) {
        int num[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
    }
}
