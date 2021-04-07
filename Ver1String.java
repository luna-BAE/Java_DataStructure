package scoremanagement;

import java.util.Scanner;

public class Ver1String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = null;

		String table = "-------------------------------\n";
		table += "학번\t|국어\t|영어\t|수학\t|합계\n";
		table += "-------------------------------\n";

		System.out.println("학생성적관리프로그램 (ver.0.2.0)");
		System.out.println("---------------------------");

		int cnt=0;

		while(true) {
			System.out.println("1.보기 2.입력 3.종료>");
			input = sc.nextLine();
			if(input.equals("0")) {break;}
			if(input.equals("1")) {
				System.out.println(table);
			}

		if (input.equals("2") ) {
			cnt++;
			table+=cnt;
			System.out.println(cnt + "국어>");
			int kor = Integer.parseInt(sc.nextLine());
			table += "\t" + kor;
			System.out.println(cnt + "영어>");
			int eng = Integer.parseInt(sc.nextLine());
			table += "\t" + eng;
			System.out.println(cnt + "수학>");
			input = sc.nextLine();
			int math = Integer.parseInt(input);
			table += "\t" + math;

			table += "\t" + (kor+eng+math) + "\n";
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}

}
