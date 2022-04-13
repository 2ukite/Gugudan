import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 숫자를 입력해서 해당 단의 구구단 실행시키기
		// 2이상 9이하의 정수가 아닌 숫자 입력시 메세지 출력시키기
		Scanner dan = new Scanner(System.in);

		int dan_number = dan.nextInt();
		
		if (dan_number>=2 && dan_number <= 9) {

		System.out.println("구구단 " + dan_number + " 단");

		for (int i = 1; i<10; ++i) {
		System.out.println(dan_number + " 곱하기 " + i + " 는 " + dan_number * i);
			}
		}
		else {
		System.out.println("2이상, 9 이하의 값만 입력할 수 있습니다.");	
			}
		}
	}
