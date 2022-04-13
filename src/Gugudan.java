public class Gugudan {
	public static void main(String[] args) {
		int [] result = new int[9];
		for (int j=2; j>=2&&j<=9; ++j) {
			for (int i=0; i<result.length; i++) { // .length 배열의 길이 
				result[i] = j*(i + 1);                // 배열에 값을 넣는다
				System.out.println(result[i]);
			}
		}		
	}
}