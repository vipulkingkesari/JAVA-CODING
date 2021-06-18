package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class InversionOfArray {


    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int array[]=new int[a];
        for(int i =0 ;i<a;i++){
            array[i]=scan.nextInt();
        }

        int icount = 0;
        for (int i = 0; i < a - 1; i++){

            for (int j = i + 1; j < a; j++){
                if (array[i] > array[j]){
                    icount++;}
            }

        }

        System.out.println(icount);

    }







}
