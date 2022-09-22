package check;

public class Main {
	public static void main (String[] arg) {
		final long c=22181920;//暗号文
		//String cTest=String.valueOf(c);
		//System.out.println(cTest.length());
		String C=String.valueOf(String.format("%08d", c));
		System.out.println("暗号"+C);//変換できているか確認
		//System.out.println("文字数"+C.length()/2);//桁数の確認
		String result[]=new String[C.length()/2];//2文字ごとに分けるために配列を作る
		//配列1つ1つに暗号の文字列を振り分けていく
		for(int i=0,j=0;i<=C.length()-2;i=i+2,j++) {
			result[j]=C.substring(i,i+2);
		}
		//アルファベットに変換する
		for(int i=0;i<=C.length()/2-1;i++) {
			Trans.trans(result[i]);
		}
		
		
	}

}
