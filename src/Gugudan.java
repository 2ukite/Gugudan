public class Gugudan {
	public static void main(String[] args) {
		// 이중 for 문으로 구구단 만들기 
		
		
		for (int j=2; j<10; ++j) {
			int dan_number = j;
							
		System.out.println(dan_number+" 단");

		for (int i = 1; i<10; ++i) {
			System.out.println(dan_number+" 곱하기 "+ i + " 는 " + dan_number*i);
			}
		}
	}
}