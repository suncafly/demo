package com.suncafly.Tread;

public class ThreadTwo {

	
	class Data{
			
		private int total;
		
		public Data(int total){
			this.total = total;
		}
		
		public synchronized void inc(){
		   ++total;
		   System.out.println(Thread.currentThread().getName()+"-inc:"+total);  
		}
		
		
		public synchronized void dec(){
		   --total;
		   System.out.println(Thread.currentThread().getName()+"-dec:"+total);  
		}
		
	}
	
	
	
	
	
	
}
