package com.bridgelabz;

public class TripleSum {
    static void triple(int arr[],int l){
        int c=0;
        int a=0;
        for (int i=0;i<l-2;i++){
            for (int j=0;j<l-1;j++) {
                for (int k = 0; k < l; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        c = 1;
                        ++a;
                        System.out.println(a + "] " + arr[i] + " + " + arr[j] + " + " + arr[k] + " = 0");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,0,-2,3,-2,-9,-3,-1};
        int k = arr.length;
        triple(arr,k);
    }
}
