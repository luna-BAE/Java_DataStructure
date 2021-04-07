package scoremanagement;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ver7ArrayMap {

	public static void main(String[] args) {
		
		Map<Integer, int[]> data = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		String title = "학생성적관리프로그램(ver 0.5.3)";
		System.out.println(title);
		byte[] by = title.getBytes();
		for ( int i = 0; i < by.length; i++ ) {
			System.out.print('-');
		}
		System.out.println();
		
		String header = "----------------------------";
		header += "\n학번\t국어\t영어\t수학";
		header += "\n----------------------------";
		
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료";
		
		int input = 0;
		
		while ( true ) {
			System.out.println(menu);
			input = sc.nextInt();
			
			if ( input == 0 ) { break; }
			
			if ( input == 1 ) {
				
				System.out.println(header);
				Set<Integer>keys = data.keySet();
				Iterator<Integer> ite = keys.iterator();
				while (ite.hasNext() ) {
					int num = ite.next();
					int[] arr = data.get(num);
					System.out.println(num+"\t"+arr[0]+"\t"+arr[1]+"\t"+arr[2]);
				}
				
			} else if ( input == 2 ) {
				System.out.println("학번 > ");
				int num = sc.nextInt();
				System.out.println("국어 > ");
				int kor = sc.nextInt();
				System.out.println("영어 > ");
				int eng = sc.nextInt();
				System.out.println("수학 > ");
				int math = sc.nextInt();
				
				data.put(num, new int[] {kor,eng,math});
				
			} else if ( input == 3 ) {
				System.out.println("수정할 학번 > ");
				int num = sc.nextInt();
				if ( data.get(num+"학번")==null ) {
					System.out.println("존재하지 않는 학번입니다.");
					continue;
				}
				System.out.println("국어 > ");
				int kor = sc.nextInt();
				System.out.println("영어 > ");
				int eng = sc.nextInt();
				System.out.println("수학 > ");
				int math = sc.nextInt();
				
				data.put(num, new int[] {kor,eng,math});
			} else if ( input == 4 ) {
				System.out.println("삭제할 학번");
				int num = sc.nextInt();
				data.remove(num);
			}
		}
		
	} // main end

} // class end
