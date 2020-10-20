package javaboard_test;

import java.util.ArrayList;
import java.util.Scanner;

public class javaboard_20201020{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); // �Է½�ĳ��
	
	
	ArrayList<Integer> ids = new ArrayList<>(); // ArrayList �۹�ȣ �߰�
	ArrayList<String> titles = new ArrayList<>();
	ArrayList<String> bodies = new ArrayList<>();
	
	int no = 1; // ids.add(no) 
	
		
	while(true) { //���� �ݺ� ����
		System.out.print("��ɾ� �� �Է����ּ��� : ");
		String cmd = sc.next(); //�������, �Է¹������� ���ѹݺ� ����
		
		if(cmd.equals("exit")) { // ���� ���� �ڵ� ����
			System.out.println("���� �Ǿ����ϴ�.");
			break; // �������� ��
	    }
		if(cmd.equals("add")) { //�Խù� �߰� �ڵ� ����
			
			ids.add(no); // �۹�ȣ ArrayList �� ids �� �޾� �߰�
			no++; // 1�� ��� ����
			
			System.out.println("�Խù� ������ �Է����ּ��� : ");
			String title = sc.next();
			titles.add(title);
			System.out.println("�Խù� ������ �Է����ּ��� :");
			String body = sc.next();
			bodies.add(body); // �Խù� �߰� ��
		}
		if(cmd.equals("list")) { //�Խù� ��ȸ �ڵ� ����
			for(int i = 0; i < titles.size(); i++) {
				System.out.println("�� ��ȣ : " + ids.get(i)); 
				System.out.println("���� : " + titles.get(i));
				System.out.println("���� : " + bodies.get(i));
				System.out.println("======================="); //�Խù� ��ȸ ��
			}
		}
		if(cmd.equals("update")) { //�Խù� ���� �ڵ� ����, �۹�ȣ �� �޾� ����
			System.out.println("������ �Խù� �� �����ϼ��� : ");
			int targetId = sc.nextInt(); // ���� �� ��쿣 'sc.nextInt'
			
			for(int i = 0; i < ids.size(); i++) {
				int id = ids.get(i); 
				
				if(id == targetId) { // id(�۹�ȣ) �� ������ �Խù�(targetId) �� ������ ����
					System.out.println("������ �Խù� ������ �Է����ּ��� : ");
					String newTitle = sc.next(); //���ο� ���� �Է�
					System.out.println("������ �Խù� ������ �Է����ּ��� : ");
					String newBodie = sc.next(); //���ο� ���� �Է�
					
					titles.set(i, newTitle);
					titles.set(i, newBodie);
					break; //�Խù� ���� ����
				}
				
			}
			
		}
		if (cmd.equals("delete")) { // �Խù� ���� �ڵ� ����
			System.out.print("��� �Խù��� ����ðڽ��ϱ� :");
			int targetId = sc.nextInt();
			int existFlag = 2;// 1. ���� 2. ����
			
			for (int i = 0; i < ids.size(); i++) {
				int id = ids.get(i);
				if (id == targetId) {
					existFlag = 1;
					ids.remove(i);
					titles.remove(i);
					bodies.remove(i);
					break; // �Խù� ���� ����
				}
			}
			if(existFlag == 2) {
				System.out.println("�Խù� �� �������� �ʽ��ϴ�.");
				
			}else {
				System.out.println(targetId + "�� �Խù��� �����Ǿ����ϴ�.");
			}
		}
	}
	
	}

}
