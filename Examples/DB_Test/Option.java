package DB_Test;

import java.util.Scanner;

public class Option extends Lib {
	static int max_num = 100;
	static int Book_num[] = new int[max_num];
	static int popRate[] = new int[max_num];
	static int Book_cost[] = new int[max_num];
	static int cnt = 0;
	static String Book_name[] = new String[max_num];
	static String Genre[] = new String[max_num];
	static String Writter[] = new String[max_num];
	static Scanner sc = new Scanner(System.in);

	public static void insert() {
		System.out.print("å ��ȣ: ");
		int n = sc.nextInt();
		Book_num[n] = n;
		System.out.print("��	��: ");
		Book_name[n] = sc.next().trim();
		System.out.print("��	��: ");
		Writter[n] = sc.next().trim();
		System.out.print("��	��: ");
		Book_cost[n] = sc.nextInt();
		System.out.print("��	��: ");
		Genre[n] = sc.next().trim();
		System.out.print("��	��: ");
		popRate[n] = sc.nextInt();
		cnt++;
		System.out.println("�߰� �Ǿ����ϴ�.");
	}

	public static int del() {
		int del_num;
		System.out.print("���� �� å ��ȣ�� �Է��ϼ���: ");
		del_num = sc.nextInt();
		if (Book_name[del_num] == null) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return 0;
		}
		for (int i = del_num; i < cnt; i++) {
			Book_num[i] = Book_num[i + 1];
			Book_name[i] = Book_name[i + 1];
			Writter[i] = Writter[i + 1];
			Genre[i] = Genre[i + 1];
			Book_cost[i] = Book_cost[i + 1];
			popRate[i] = popRate[i + 1];
		}
		cnt--;
		return 1;
	}

	public static int search() {
		System.out.print("å ��ȣ�� �Է��ϼ���: ");
		int n = sc.nextInt();
		if (Book_name[n] == null) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return 0;

		}

		System.out.println("å ��ȣ:" + Book_num[n]);
		System.out.println("��	��:" + Book_name[n]);
		System.out.println("��	��:" + Writter[n]);
		System.out.println("��	��:" + Genre[n]);
		System.out.println("��	��:" + Book_cost[n]);
		System.out.println("��	��:" + popRate[n]);
		return 1;
	}

	public static void bookCnt() {
//		System.out.println(cnt);
		int count = 0;
		for (int i = 0; i < Book_num.length; i++) {
			if (Book_num[i]!=0) {
				count++;
			}
			System.out.println("�Էµ� å�� �� "+count+" �� �Դϴ�.");
		}
	}
	
}