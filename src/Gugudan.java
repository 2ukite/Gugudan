import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 숫자를 입력해서 해당 단의 구구단 실행시키기
		Scanner dan = new Scanner(System.in);
		
		int dan_number = dan.nextInt();
			
		System.out.println(dan_number + " 단");
		
		System.out.println(dan_number * 1);
		System.out.println(dan_number * 2);
		System.out.println(dan_number * 3);
		System.out.println(dan_number * 4);
		System.out.println(dan_number * 5);
		System.out.println(dan_number * 6);
		System.out.println(dan_number * 7);
		System.out.println(dan_number * 8);
		System.out.println(dan_number * 9);
		
}
}
