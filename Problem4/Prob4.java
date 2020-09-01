package Problem4;

import java.util.*;

public class Prob4 {

static Set<Integer> given = new TreeSet();

static void tableOfSquares (int n) {
	if(n==1 || n==0) {
		given.add(n);
		System.out.println(n+ "   "+ (n*n));
	}
	else if(n>1) {
		given.add(n);
		tableOfSquares(n-1);
		System.out.println(n+ "   "+ (n*n));
	}
	else {
		System.out.println("Invalid input");
	}
	
}
}
