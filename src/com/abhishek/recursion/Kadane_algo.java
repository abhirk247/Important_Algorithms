package com.abhishek.recursion;

public class Kadane_algo {



    public static int kadane(int arr[])
    {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            curSum+=arr[i];
            if(curSum>maxSum)
                maxSum=curSum;
            if(curSum<0)
                curSum=0;
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int arr[]={5,4,-1,7,8};

        System.out.println(kadane(arr));
    }
}
