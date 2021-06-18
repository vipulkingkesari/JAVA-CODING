package com.company;

import java.util.Scanner;

public class InversionOfArray2 {

    public static int merge(int[] arr, int[] aux, int low, int mid, int high)
    {
        int k = low, i = low, j = mid + 1;
        int inversionCount = 0;

        // while there are elements in the left and right runs
        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            }
            else {
                aux[k++] = arr[j++];
                inversionCount += (mid - i + 1);    // NOTE
            }
        }

        // copy remaining elements
        while (i <= mid) {
            aux[k++] = arr[i++];
        }

        /* no need to copy the second half (since the remaining items
           are already in their correct position in the temporary array) */

        // copy back to the original array to reflect sorted order
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }

        return inversionCount;
    }

    // Sort array `arr[low…high]` using auxiliary array `aux`
    public static int mergesort(int[] arr, int[] aux, int low, int high)
    {
        // Base case
        if (high == low) {        // if run size == 1
            return 0;
        }

        // find midpoint
        int mid = (low + ((high - low) >> 1));
        int inversionCount = 0;

        // recursively split runs into two halves until run size == 1,
        // then merges them and return up the call chain

        // split/merge left half
        inversionCount += mergesort(arr, aux, low, mid);

        // split/merge right half
        inversionCount += mergesort(arr, aux, mid + 1, high);

        // merge the two half runs
        inversionCount += merge(arr, aux, low, mid, high);

        return inversionCount;
    }

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int array[]=new int[a];
        for(int i =0 ;i<a;i++){
            array[i]=scan.nextInt();
        }

        int [] aux=new int[array.length];

//        int icount = 0;
//        for (int i = 0; i < a - 1; i++){
//
//            for (int j = i + 1; j < a; j++){
//                if (array[i] > array[j]){
//                    icount++;}
//            }
//
//        }

//        System.out.println(icount);

        int vipul=mergesort(array,aux,0, array.length-1);
        //int vipul=mergesort(array, aux, 0, array.length - 1))
        System.out.println(vipul);
        String[] sArray= new String[]{"a", "b", "c", "d", "e", "f", "g", "h","i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};



        int hashn=(vipul%26);
        System.out.println(sArray[hashn]);



    }
}






