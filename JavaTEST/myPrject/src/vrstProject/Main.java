package vrstProject;

public class Main {
	public static void main (String[] args) {
		int c=904;//整数
		int e=79;//素数
		int p=37;//素数
		int q=71;//素数
		PrimeFactrization.primeFactrization(p);//素数判別
		System.out.println("");//改行
		PrimeFactrization.primeFactrization(q);//素数判別
		System.out.println("");//改行
		int n=p*q;
		int r=1;//任意の整数（(mod -r)となる部分）
		int cal1=(p-1)*(q-1);//あらかじめ計算しておくだけ
		System.out.println(cal1);
		int m=0;
		int sur;
		do {
			m++;
			sur=cal1*m%e;
			if(sur==e-r) {
				System.out.println("mは"+m+"回目で余りが"+sur+"になる");
				break;
			}
		}while(true);
		System.out.println("よってm="+m);
		int d=(m*cal1+r)/e;
		System.out.println("計算するとd="+d);
		int ans2=1;
		for(int i=1;i<=d;i++) {
			ans2=ans2*c%n;
		}
		System.out.println("答えは"+ans2+"です！");
	}

}
