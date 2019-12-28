import java.util.Random;
import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int low, high; //수의 범위
		int number; //맞춰야 하는 임의의 수
		
		while(true) {//무조건 반복
			int step = 1; //사용자의 시도 횟수
			low = 0; //초기화
			high = 99;//초기화
			
			number = r.nextInt(100); //0~99사이의 임의의 수 발생
			
			System.out.println("수를 결정 하였습니다. 맞추어 보세요");
			
		while(true) {
			int input; //사용자의 입력
			System.out.println(low + " - " + high); //값의 범위 출력
			
			System.out.print(step++ + ">>"); //시도 횟수 출력
			input = in.nextInt(); //사용자 입력
			//답을 맞힌 경우, 입력값이 결정된 수 보다 작은 경우,큰경우
			 if(input == number) {
				 System.out.println("맞았습니다.");
				 break;
			 }else if(input < number) {
				 System.out.println("더 높게");
				 low = input;
			 }else {
				 System.out.println("더 낮게");
				 high = input;
			 }
			 
		}
		
		System.out.print("다시 하시겠습니까(y/n) >> ");
		String answer = in.next();
		if(answer.equals("n")) {
			break;
		}
	}

}
}
