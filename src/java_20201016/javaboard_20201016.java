package java_20201016;

import java.util.Scanner;

public class javaboard_20201016 {

	public static void main(String[] args) {
//		1. 명령어를 분석해서 기능을 반복 수행하는 명령어 프로그램을 만들어주세요.
//		  - 명령어 입력 요구 무한히
		
		Scanner sc = new Scanner(System.in); //입력 
		
		String title = "";
		String body = "";
		
		while(true) { //무한반복 시 while 이용
			System.out.print("명령어 를 입력해주세요 : "); //println 에서 ln 을 빼면 건너뛰어서 입력 X
			String cmd = sc.next();
          
			
			
//		      2. 기능1 : 종료
//			  - 명령어 : exit
//			  - 설명 : 루프 종료.
			
			if(cmd.equals("exit")) { // 루프종료 
				System.out.println("종료 되었습니다.");
				break;
			}

			
			
			
//			3. 기능2 : 게시물 추가
//			  - 명령어 : add
//			  - 설명 : 게시물은 제목, 내용으로 이루어져 있습니다. 제목과 내용을 입력받아 저장
//			  
//			  - 입력 예시
//			    - 게시물 제목을 입력해주세요 : 제목 입력
//			    - 게시물 내용을 입력해주세요 : 내용 입력
//			  - 출력 예시
//			    - 게시물이 등록되었습니다.
//			    			
			if(cmd.equals("add")) {
				System.out.println("게시물 제목을 입력해주세요 : ");
				title = sc.next();
				System.out.println("게시물 내용을 입력해주세요 : ");
				body = sc.next();
			}
			if(cmd.equals("list")) {
				System.out.println("제목 : " + title);
				System.out.println("내용 : " + body);
				System.out.println("----------");
				System.out.println("제목 : " + title);
				System.out.println("내용 : " + body);
			}
		}


			//
//		4. 기능3 : 게시물 조회
//		  - 명령어 : list
//		  - 설명 : add로 저장된 게시물의 목록이 나온다.
//		  
//		  - 출력 예시 
//		    - 제목 : 제목1 
//		    - 내용 : 내용1 
//		    - -----------
//		    - 제목 : 제목2
//		    - 내용 : 내용2
		    
	  }

}
