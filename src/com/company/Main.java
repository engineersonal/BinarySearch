package com.company;

import java.util.*;
class Main {
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int start = 0;
        int end = inputArr.length - 1;
        int mid = 0, count = 0;
        boolean flag = false;
        while(start <= end){
            mid = start + (end - start) / 2;
            count++;
            if(key == inputArr[mid]){
                flag = true;
                break;
            }
            else if(key > inputArr[mid]){
                start = mid + 1;
            }
            else if(key < inputArr[mid]){
                end = mid - 1;
            }
        }
        if(flag == true){
            return count - 1;
        }else if(count > 0 && inputArr.length != 0){
            return count;
        }else{
            return 0;
        }
    }
    public static void main(String args[] ) throws Exception {
        Main bs = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}

