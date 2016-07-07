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
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.*;

public class HourGlass {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6]; int maxsum =Integer.MIN_VALUE;
        for(int i=0;i<6;i++){
            for(int j=0;j<6 ;j++){
            a[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
              int sum = hourglass(a,i,j);System.out.println(sum);
                maxsum = sum > maxsum ? sum : maxsum;
            }
        }
        System.out.print(maxsum);
           
            
    }
    
    public static int hourglass(int a[][], int i,int j){
      //  System.out.println(a[i][j]+ ""+a[i][j+1]+""+a[i][j+2]+""+a[i+1][j+1]+""+a[i+2][j]+""+a[i+2][j+1]+""+a[i+2][j+2]);
        return(a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
    }
}
