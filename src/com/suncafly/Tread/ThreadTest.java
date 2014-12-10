package com.suncafly.Tread;

public class ThreadTest implements Runnable{

	public int n;
	
	public ThreadTest(int n){
		this.n = n;
	}
	
	
	private synchronized void dec(){
		--n;
		System.out.println(getThreadName() +" :  "+ n);
	}
	
	
	private String getThreadName(){
		return Thread.currentThread().getName();
	}

	@Override
	public void run() {
		while(n > 0){
			try {
				dec();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadTest test = new ThreadTest(1000);
		new Thread(test).start();
		new Thread(test).start();
	}
}
