package scoremanagement;

import java.util.Scanner;

public class Ver2String {

	public static void main(String[] args) {
		String data = "";

		String title = "학생성적관리프로그램 (ver.0.2.1)";
		String menu = "1.보기 2.입력 3.종료>";

		String table = "-------------------------------\n";
		table+="학번\t|국어\t|영어\t|수학\t|합계\t평균\n";
		table+="-------------------------------";

		Scanner sc = new Scanner(System.in);

		System.out.println(title);
		for ( int i = 0; i<title.length()*2; i++ ) {
			System.out.print('-');
		}
		System.out.println();

		int cnt=0;

		String input=null;
		
		while(true) {
			System.out.println(menu);
			input = sc.nextLine();
			// 선택 종료
			if ( input.equals("0")) {break;}
			// 보기
			if ( input.equals("1")) {
				System.out.println(table);
				if ( !data.isEmpty()) {
					String[] students = data.split("@");
					for ( int i = 0; i<students.length; i++ ) {
						String student = students[i];
						String[] stu = student.split(",");
						int kor = Integer.parseInt(stu[1]);
						int eng = Integer.parseInt(stu[2]);
						int math = Integer.parseInt(stu[3]);
						int sum = kor + eng + math;
						double avg = sum / 3;
						System.out.println(stu[0]+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg);
					}
				}
			}
			
		// 입력
		if ( input.equals("2")) {
			cnt++;
			System.out.println(cnt + "번 국어>");
			input=sc.nextLine();
			int kor = Integer.parseInt(input);
			System.out.println(cnt + "번 영어>");
			input=sc.nextLine();
			int eng = Integer.parseInt(input);
			System.out.println(cnt + "번 수학>");
			input=sc.nextLine();
			int math = Integer.parseInt(input);
			int sum = kor+eng+math;
			if ( cnt != 1 ) {
				data+="@";
			}
			data+=cnt+","+kor+","+eng+","+math;
			}
		}
	}

}
