 
public class Gugudan {
	public static void main(String[] args) {
		// 구구단 2단 부터 9단까지
		int d = 2;
		while (d<10) {
			System.out.println(d + " 단");
		int i = 1;
		while (i<10) {
			System.out.println(d + " 곱하기 "+ i +" 은 " + 2 * i);
			i=i+1;
		}
		d=d+1;
	}
	}
}
