package com.company;

import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int Size = Sc.nextInt();
        int[] arr =new int[Size];
        for(int i=0; i<Size; i++){
            arr[i] = Sc.nextInt();
        }
        for(int i=0; i<Size; i++){
            if(arr[i]%2 == 1){
                for(int j = i; j<Size;j++){
                    if(arr[j]%2 == 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }

        for(int i=0; i<Size; i++){
            System.out.print(" "+arr[i]);
        }
    }
}