package com.app;

public class PRime {

	public static void main(String[] args) {
		//ljaljfjlajaj
		for(int i=1;i<=100;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}

}
