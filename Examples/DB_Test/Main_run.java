package DB_Test;

import java.util.Scanner;

public class Main_run {
	public static void main(String[] ar) throws Exception {
		String menu, more;
		Scanner sc = new Scanner(System.in);

		loop : while (true) {
			System.out.print("������ �۾��� �Է��� �ּ���(�߰�, �˻�, ����, å ���� ���, ����): ");
			menu = sc.next();
			switch (menu) {
			case "�߰�":
				Option.insert();
				break;
			case "�˻�":
				if (Option.search() == 1) {
					System.out.println("�˻� �Ϸ�!");
				} else {
					System.out.println("�˻� ����.");
				}
				break;
			case "����":
				if (Option.del() == 1) {
					System.out.println("���� �Ϸ�!");
				} else {
					System.out.println("���� ����.");
				}
				break;
			case "å ���� ���":
				Option.bookCnt();
				break;
			case "����":
				System.out.println("���α׷��� �����մϴ�.! �����մϴ�.");
				break loop;				
			default:
				break;
				
			}
			
		}

//		do {
//			System.out.print("������ �۾��� �Է��� �ּ���(�߰�, �˻�, ����, å ���� ���, ����): ");
//			menu = sc.next();
//			switch (menu) {
//			case "�߰�":
//				option.insert();
//				break;
//			case "�˻�":
//				if (option.search() == 1) {
//					System.out.println("�˻� �Ϸ�!");
//				} else {
//					System.out.println("�˻� ����.");
//				}
//				break;
//			case "����":
//				if (option.del() == 1) {
//					System.out.println("���� �Ϸ�!");
//				} else {
//					System.out.println("���� ����.");
//				}
//				break;
//			case "å ���� ���":
//				option.bookCnt();
//				break;
//			default:
//				break;
//
//			}
//		} while (menu == "����");
	}
}
