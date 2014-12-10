package com.suncafly.Tread;

public class ThreadOne {
	
	private int total;
	
	public static void main(String[] args) {
		ThreadOne t = new ThreadOne(1000);
		Inc inc = t.new Inc();
		Dec dec = t.new Dec();
		new Thread(inc).start();
		new Thread(dec).start();
	}
	
	
	
	public ThreadOne( int total){
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
	
	class Inc implements Runnable{

		@Override
		public void run() {
			while(total < Integer.MAX_VALUE){
				inc();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	class Dec implements Runnable{

		@Override
		public void run() {
			while(total > Integer.MIN_VALUE){
				dec();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
