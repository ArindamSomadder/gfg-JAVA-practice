/*
import java.util.*;
public class KthMissingElement {
    public static void main(String[] args) {
        int[] arr= {2, 3, 5, 9, 10};
        msa(arr, 2);
    }

    public static void msa(int[] arr, int k){
        int len= arr.length;
        Arrays.sort(arr);
        int[] narr= new int[arr[len-1]];
        int idx=0, f =0;

        for(int i=1; i<=arr[len-1]; i++){
            for(int j=0; j<len; j++){
                if(i != arr[j]){
                    f = 1;
                }
                else{
                    f = 0;
                    break;
                }
            }
            if(f == 1){
                narr[idx] = i;
                idx += 1;
            }
        }

        System.out.println(narr[k-1]);
    }
}
 */


import java.util.*;
public class KthMissingElement { //optimized
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 10}; //missing: 1, 4, 6, 7, 8
        msa(arr, 5);
    }

    public static void msa(int[] arr, int k){
        Arrays.sort(arr);
        int[] narr= new int[arr[arr.length-1]];
        int idx=0;
        boolean[] barr= new boolean[arr[arr.length-1]+1];

        for(int i=0; i<arr.length; i++){
            barr[arr[i]] = true;
        }

        for(int i=0; i<barr.length; i++){
            if(!barr[i]){
                narr[idx] = i;
                idx += 1;
            }
        }

        System.out.println(narr[k]);
    }
}
