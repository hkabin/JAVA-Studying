import java.util.Scanner;  //매개변수를 입력받기 위하여 java.util 패키지내에 있는 Scanner라는 class 호출
//java.util.*;             //java.util 패키지내에 있는 모든 클래스 호출

public class GuGudan4WS {
	
	public static void main(String[] args) {
				
		//입력받을 문구 작성 후 화면 출력
		System.out.print("구구단 중 몇 단을 출력하시겠습니까? : ");
		
		//Scanner 클래스는 반드시 객체를 생성해야 사용 가능
		//b라는 새로운 객체 생성 
		Scanner b = new Scanner(System.in);               //System.in은 화면에서 입력받겠다는 의미
		int DanNum = b.nextInt();                         //정수 DanNum는 화면에서 입력받는 변수
		System.out.println("네. " + DanNum + "단을 출력하겠습니다.");
						
		for(int i=1; i<10; i++) {
			int result = DanNum*i;
			System.out.println(result);
		}
	}
}
