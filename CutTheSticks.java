/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supreeth.array;

/**
 *
 * @author Supreeth.msv
 */
public class CutTheSticks {
    
    public static void main(String args[]) {
        int [] arr = {5,4,4,2,2,8};
        Solution(arr);
    }
    public static int Solution(int arr[]) {
        int res = 0;
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (min != 0 && sum != arr.length) {
            int count = 0;
            sum = 0;
            min = getMin(arr);
            for(int i=0;i<arr.length;i++) {
                if(arr[i]-min >=0) {
                    arr[i] = arr[i]-min;
                    count++;
                }
                sum +=arr[i]+1;
                
            }
            System.out.println(count);
            res++;
        }
        return res;
    }
    
    private static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i]!=0) {
                if (arr[i] < min ) {
                    min = arr[i];
                }
            }
            
        }
        if (min == 0) {
            for(int i=0;i<arr.length;i++) {
                if (arr[i] > min) {
                    min = arr[i];
                }
            }
        }
        return min;
        
    }
}
