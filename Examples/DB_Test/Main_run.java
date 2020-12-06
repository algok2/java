package DB_Test;

import java.util.Scanner;

public class Main_run {
	public static void main(String[] ar) throws Exception {
		String menu, more;
		Scanner sc = new Scanner(System.in);

		loop : while (true) {
			System.out.print("수행할 작업을 입력해 주세요(추가, 검색, 삭제, 책 개수 출력, 종료): ");
			menu = sc.next();
			switch (menu) {
			case "추가":
				Option.insert();
				break;
			case "검색":
				if (Option.search() == 1) {
					System.out.println("검색 완료!");
				} else {
					System.out.println("검색 에러.");
				}
				break;
			case "삭제":
				if (Option.del() == 1) {
					System.out.println("삭제 완료!");
				} else {
					System.out.println("삭제 에러.");
				}
				break;
			case "책 개수 출력":
				Option.bookCnt();
				break;
			case "종료":
				System.out.println("프로그램을 종료합니다.! 감사합니다.");
				break loop;				
			default:
				break;
				
			}
			
		}

//		do {
//			System.out.print("수행할 작업을 입력해 주세요(추가, 검색, 삭제, 책 개수 출력, 종료): ");
//			menu = sc.next();
//			switch (menu) {
//			case "추가":
//				option.insert();
//				break;
//			case "검색":
//				if (option.search() == 1) {
//					System.out.println("검색 완료!");
//				} else {
//					System.out.println("검색 에러.");
//				}
//				break;
//			case "삭제":
//				if (option.del() == 1) {
//					System.out.println("삭제 완료!");
//				} else {
//					System.out.println("삭제 에러.");
//				}
//				break;
//			case "책 개수 출력":
//				option.bookCnt();
//				break;
//			default:
//				break;
//
//			}
//		} while (menu == "종료");
	}
}
