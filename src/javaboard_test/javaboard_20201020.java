package javaboard_test;

import java.util.ArrayList;
import java.util.Scanner;

public class javaboard_20201020{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); // 입력스캐너
	
	
	ArrayList<Integer> ids = new ArrayList<>(); // ArrayList 글번호 추가
	ArrayList<String> titles = new ArrayList<>();
	ArrayList<String> bodies = new ArrayList<>();
	
	int no = 1; // ids.add(no) 
	
		
	while(true) { //무한 반복 루프
		System.out.print("명령어 를 입력해주세요 : ");
		String cmd = sc.next(); //여기까지, 입력받은값을 무한반복 루프
		
		if(cmd.equals("exit")) { // 루프 종료 코드 시작
			System.out.println("종료 되었습니다.");
			break; // 루프종료 끝
	    }
		if(cmd.equals("add")) { //게시물 추가 코드 시작
			
			ids.add(no); // 글번호 ArrayList 인 ids 를 받아 추가
			no++; // 1씩 계속 증가
			
			System.out.println("게시물 제목을 입력해주세요 : ");
			String title = sc.next();
			titles.add(title);
			System.out.println("게시물 내용을 입력해주세요 :");
			String body = sc.next();
			bodies.add(body); // 게시물 추가 끝
		}
		if(cmd.equals("list")) { //게시물 조회 코드 시작
			for(int i = 0; i < titles.size(); i++) {
				System.out.println("글 번호 : " + ids.get(i)); 
				System.out.println("제목 : " + titles.get(i));
				System.out.println("내용 : " + bodies.get(i));
				System.out.println("======================="); //게시물 조회 끝
			}
		}
		if(cmd.equals("update")) { //게시물 수정 코드 시작, 글번호 를 받아 수정
			System.out.println("수정할 게시물 을 선택하세요 : ");
			int targetId = sc.nextInt(); // 정수 일 경우엔 'sc.nextInt'
			
			for(int i = 0; i < ids.size(); i++) {
				int id = ids.get(i); 
				
				if(id == targetId) { // id(글번호) 와 선택한 게시물(targetId) 가 같으면 진행
					System.out.println("수정할 게시물 제목을 입력해주세요 : ");
					String newTitle = sc.next(); //새로운 제목 입력
					System.out.println("수정할 게시물 내용을 입력해주세요 : ");
					String newBodie = sc.next(); //새로운 내용 입력
					
					titles.set(i, newTitle);
					titles.set(i, newBodie);
					break; //게시물 수정 종료
				}
				
			}
			
		}
		if (cmd.equals("delete")) { // 게시물 삭제 코드 시작
			System.out.print("몇번 게시물을 지우시겠습니까 :");
			int targetId = sc.nextInt();
			int existFlag = 2;// 1. 있음 2. 없음
			
			for (int i = 0; i < ids.size(); i++) {
				int id = ids.get(i);
				if (id == targetId) {
					existFlag = 1;
					ids.remove(i);
					titles.remove(i);
					bodies.remove(i);
					break; // 게시물 삭제 종료
				}
			}
			if(existFlag == 2) {
				System.out.println("게시물 이 존재하지 않습니다.");
				
			}else {
				System.out.println(targetId + "번 게시물이 삭제되었습니다.");
			}
		}
	}
	
	}

}
