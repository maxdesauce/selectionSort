package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {20, 7, -15, 1, -22, 55, 35};


        for(int lastUnsortPart = myArray.length -1; lastUnsortPart >0 ; lastUnsortPart--){

            int largest = 0;

            for(int i = 1; i <= lastUnsortPart;i++){
                if(myArray[largest]< myArray[i]) {
                    largest = i;
                }

            }

            swap(myArray, largest, lastUnsortPart);
        }
        for(int i = 0; i< myArray.length;i++){
            System.out.println(myArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j){
        if(i==j)
            return;
        else{
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }


    }

}
