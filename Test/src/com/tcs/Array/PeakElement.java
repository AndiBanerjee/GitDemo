package com.tcs.Array;

class Solution{
	int arr[];
	int n,i;
	public int peakElement(int[] arr,int n) {
		this.arr=arr;
		this.n=n;
		n=arr.length;
		for( i=1;i<n;i++){
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				
				break;
		}
		}
		return i;
	}
}
public class PeakElement {
	public static void main(String args[]) {
		int A[]= {1,3,5,2,0};
		int n=5,i;
		Solution s=new Solution();
		i=s.peakElement(A,n);
		System.out.println("the position value is i"+i)  ;       
		 }
	}
