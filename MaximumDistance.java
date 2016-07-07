/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supreeth.array;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Supreeth.msv
 */
public class MaximumDistance {
    
    public static void main(String args[]) {
        List<Integer> a = Arrays.asList(3,5,4,2);
        System.out.print(maximumGap(a));
    }
    public static int maximumGap(final List<Integer> a) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<a.size();i++) {
            for (int j=i;j<a.size();j++) {
                if (a.get(i)<=a.get(j)) {
                    max = Math.max(max, j-i);
                }
            }
        }
        return max;
    }
}
