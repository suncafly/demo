package com.suncafly.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		try {
			int A[] ={0,1,2,3,4,5,6,7,8,9,10,11,24,54,321, 3333};
			String p;
			while(true){
				System.out.println("输入一个供筛选的值：");
				BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			    p = strin.readLine();
				Pattern pattern = Pattern.compile("[0-9]*");
				if(pattern.matcher(p).matches()){
					break;
				}
			}
			int v = Integer.valueOf(p);
			int point = search(A,v);
			System.out.println(point);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int search(int A[], int p){
		int tail = A.length;
		int head = 0;
		int index = -1;
		while(head != tail){
			index= (tail +head) / 2;
			if(A[index] == p){
				break;
			}else if(A[index] > p){
				tail = index;
			}else{
				head = index;
			}
		}
		
		if(index != -1){
			return A[index];
		}else{
			return index;
		}
	}
	
}
