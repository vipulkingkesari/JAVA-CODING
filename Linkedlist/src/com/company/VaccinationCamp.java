package com.company;

import java.util.Scanner;
import java.util.*;

public class VaccinationCamp {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int v[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            v[i] = scan.nextInt();
        }

        int n2 = scan.nextInt();
        int h[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            h[i] = scan.nextInt();
        }


//        for(int i = 0 ; i <n1;i++){
//            System.out.println(v[i]);
//        }
//
//        for(int i = 0 ; i <n2;i++){
//            System.out.println(h[i]);
//        }
        int [] result=new int[n2];

        for(int i =0 ;i<n2;i++){
            int count=0;
            for(int j=0;j<n1;j++){
                if(h[i]<=v[j]){
                    count++;
                }
            }
            result[i]=count;
        }

        int len=result.length;
        for (int i =0 ;i<len;i++ ){
            System.out.print(result[i]+ " " );
        }
    }
}

