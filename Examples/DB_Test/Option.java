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
		System.out.print("책 번호: ");
		int n = sc.nextInt();
		Book_num[n] = n;
		System.out.print("제	목: ");
		Book_name[n] = sc.next().trim();
		System.out.print("저	자: ");
		Writter[n] = sc.next().trim();
		System.out.print("가	격: ");
		Book_cost[n] = sc.nextInt();
		System.out.print("장	르: ");
		Genre[n] = sc.next().trim();
		System.out.print("평	점: ");
		popRate[n] = sc.nextInt();
		cnt++;
		System.out.println("추가 되었습니다.");
	}

	public static int del() {
		int del_num;
		System.out.print("삭제 할 책 번호를 입력하세요: ");
		del_num = sc.nextInt();
		if (Book_name[del_num] == null) {
			System.out.println("잘못된 입력입니다.");
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
		System.out.print("책 번호를 입력하세요: ");
		int n = sc.nextInt();
		if (Book_name[n] == null) {
			System.out.println("잘못된 입력입니다.");
			return 0;

		}

		System.out.println("책 번호:" + Book_num[n]);
		System.out.println("제	목:" + Book_name[n]);
		System.out.println("저	자:" + Writter[n]);
		System.out.println("장	르:" + Genre[n]);
		System.out.println("가	격:" + Book_cost[n]);
		System.out.println("평	점:" + popRate[n]);
		return 1;
	}

	public static void bookCnt() {
//		System.out.println(cnt);
		int count = 0;
		for (int i = 0; i < Book_num.length; i++) {
			if (Book_num[i]!=0) {
				count++;
			}
			System.out.println("입력된 책은 총 "+count+" 권 입니다.");
		}
	}
	
}