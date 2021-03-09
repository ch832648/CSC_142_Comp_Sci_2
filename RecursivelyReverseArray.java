/*
Name:                Caitlin Harris
Date:                12/10/2018
Title:               RecursivelyReverseArray.java
Description:         A program to recursively reverse an array within a specified range
Input:               Integer array
Output:              The result of the reversed integer array

*/

import java.util.Random;

    public class RecursivelyReverseArray{
        public static void main(String[] args) {
            Random rand = new Random();
            
            int[] list = new int[10]; // create an array of length 10
            
            // populate the array with random integers in the range 1..100
            for (int i = 0; i < list.length; ++i) {
                list[i] = rand.nextInt(100) + 1;
            }
            
            // print out the contents of the array
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            // reverse the array
            myReverse(list, 0, list.length-1);
            
            // print out the contents of the array
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        private static void myReverse(int[] list, int from, int to) {
            
            int range = to/2; //range of the array
            
            // (base case)
            // if range size is 0 or 1, there is nothing left to do
            if(range == 0 || range == 1)
            {}

            // (recursive step)
            // else:
            //   1. swap the two values on each end 
            //   2. recursively call the method on the portion in-between
            else{
            int temp = list[to];
            list[to] = list[from];
            list[from] = temp;
            myReverse(list, from+1, to-1);
            range--;
            }
            
        }
    
    }