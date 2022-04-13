public class Gugudan {
	
	public static int[] calculates(int dan) {
		int [] result = new int [9];            // 데이터 공간 부여하여 배열 생성
		for (int i=0; i<result.length; ++i) {
			result[i]=dan*(i+1);                // 배열에 값 넣기
		}
		return result;		                    // 계산 결과 반환 (이 메소드 계산 결과, 값을 가진다)
	}
	
	public static void print(int[] result) {    // int[] 자체로 배열 데이터 속성이라 표현가능, 하지만 int result[]도 가능하고 값도 동일하다
		for (int i=0; i<result.length; ++i) {
			System.out.println(result[i]);      // 배열 순서대로 각 배열의 값을 출력하기
		}
	}
	
	
	public static void main(String[] args) {
					
		for (int i = 2; i<10; ++i) {            // 아래의 과정을 값을 바꿔가며 반복
		int [] times = calculates(i);           // 대입한 값에 맞게 각 배열을 선언, 배열에 값을 넣는다
		print(times);                           // 배열 순서대로 각 배열 값을 출력한다
		}
		
	}
}