package jungsuk.jungsuk_200;

public class java200_4chapter3 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			result = (tmp % 10) + result*10 ;
			
			tmp /= 10;
			
		}
		if(number == result)
		System.out.println( number + " 는 회문수 입니다."); 
		else
		System.out.println( number + " 는 회문수가 아닙니다.");
		
		int num = 12345;
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			sum += num % 10;
			num = num / 10;
		}
		
		System.out.println("sum="+sum);
	}

}
