package com.gl.fsd.denomination;

public class Denomination_Calculator_Test {
	  public static void main(String[] args) {
	        test(new int[] {5, 1, 10}, 12);
	        test(new int[] {60, 5, 12, 78, 25}, 128);
	        test(new int[] {12, 5, 123, 18}, 158);
	        test(new int[] {12, 5, 123, 18}, 159);
	        test(new int[] {12, 5, 123, 18}, 160);
	        test(new int[] {5, 0, 10}, 12);
	        test(new int[] {50, 30, 100}, 160);
	    }
	   
	    private static void test(int[] denominations, int paymentAmount) {
	       
	        System.out.println("--------------------------------------");
	        Denomination_Calculator calculator =
	            new Denomination_Calculator(denominations, paymentAmount);
	        calculator.calculate();
	       
	    }
}
