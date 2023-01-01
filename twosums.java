package date7_11;

import java.util.Arrays;

public class twosums {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        two(17,arr);

    }

    public static void two(int target,int[] arr){

        int[] twwo={-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    twwo[0]=i;
                    twwo[1]= j;
                }

            }

        }

        System.out.println(Arrays.toString(twwo) );

    }
}
