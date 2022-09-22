package vrstProject;

public class PrimeFactrization {
	public static int primeFactrization(int c){
		System.out.print(c+"=");
		for (int i = 2;i<=c;i++) {
		if (c % i == 0) {
		c /= i;
		if (c == 1) System.out.print(i);//素数なら以下が動作しない
		else System.out.print(i + "×");
		i = 1;
		}
		}
		return(c);
	}

}
