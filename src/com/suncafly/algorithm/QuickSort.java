package com.suncafly.algorithm;

public class QuickSort {

	
	public static void main(String[] args) {
		int S[] = {21,20,24,12,36,37,1,5,4,3,8,7,1,9,12,45,58,12,96,14};
		int low = 0;
		int high = S.length - 1;
		calculate(S, low, high);
		
		
		for(int x:S){
			System.out.print(x + "    ");
		}
		
		
	}

	private static void calculate(int[] S, int low, int high) {
		int l = low;
		int h = high;
		int povit = S[low];
		while(l < h){
			while(l < h && S[h] > povit){
				h --;
			}
			
			if(l < h){
				int temp = S[h];
				S[h] =S[l];
				S[l] = temp;
				l++;
			}
			
			while(l < h && S[l] < povit){
				l++;
			}
			
			if(l < h){
				int temp = S[h];
				S[h] = S[l];
				S[l] = temp;
				h --;
			}
		}
		if(l>low){
			calculate(S,low,h-1);
		}
		if(h<high){
			calculate(S,l+1,high);
		}
	}

	/*public　void sort(int arr[],int low,int high){
		　int　l=low;
		　int　h=high;
		　int　povit=arr[low];
		 
		　while(l<h)
		　{
			　while(l<h&&arr[h]>=povit)
			　h--;
			　if(l<h){
				　int　temp=arr[h];
				　arr[h]=arr[l];
				　arr[l]=temp;
				　l++;
			　}
		 
			　while(l<h&&arr[l]<=povit)
			　l++;
		 
			　if(l<h){
				　int　temp=arr[h];
				　arr[h]=arr[l];
				　arr[l]=temp;
				　h--;
			　}
		　}
//			　print(arr);
//			　System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
		　
			if(l>low)
				sort(arr,low,h-1);
		　
			if(h<high)
				sort(arr,l+1,high);
	　}
	
	*/
}
 