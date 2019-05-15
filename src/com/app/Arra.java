package com.app;

public class Arra {

	public static void main(String[] args) {
		 Integer[]ch= {55,66,22,11,44,66,22};
		 int index =0;
		 for(int i=0;i<ch.length;i++) {
			 if(ch[i]==66) {
				 index=i;
				 break;
			 }
		 }
		 System.out.println("Index is = "+index);
		 System.out.println(ch[ch.length-2]);
	}	
}