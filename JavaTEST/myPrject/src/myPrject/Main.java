package myPrject;

public class Main {
	public static void main(String[] args) {
		long startTime=System.nanoTime();
		int c=904;//元の暗号文
		String C=String.valueOf(String.format("%04d", c));
		String C1=C.substring(0,2);
		String C2=C.substring(2,4);
		System.out.println("元の暗号は"+C+"で、アルファベットの"+C1+"、"+C2+"番目は");
		Trans.trans(C1, C2);
		int p=37;
		int q=71;
		int e=79;
		int n=p*q;
		int cal1=(p-1)*(q-1);//あらかじめ計算しておくだけ
		int m=0;
		int sur;
		do {
			m++;
			sur=cal1*m%79;
			if(sur==78) {
				System.out.println("mは"+m+"回目で余りが"+sur+"になる");
				break;
			}
		}while(true);
		System.out.println("よってm="+m);
		int d=(m*cal1+1)/e;
		System.out.println("計算するとd="+d);
		long ans1=(long)Math.pow(c, d)%n;//c^dの値が大きすぎてlong型でも格納できない
		System.out.println("答えは"+ans1+"だ！(間違い！)");
		//forを使った累乗計算をします
		int ans2=1;
		for(int i=1;i<=d;i++) {
			ans2=ans2*c%n;
		}
		System.out.println("本当の答えは"+ans2+"です！");
		String s=String.valueOf(String.format("%04d", ans2));
		String alp1=s.substring(0,2);
		String alp2=s.substring(2,4);
		System.out.println("アルファベットの"+alp1+"と"+alp2+"番目は......");
		Trans.trans(alp1,alp2);
		long endTime=System.nanoTime();
		System.out.println("処理にかかった時間は"+(endTime-startTime)/1000+"マイクロ秒");
	}

}
