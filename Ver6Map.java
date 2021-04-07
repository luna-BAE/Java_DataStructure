package scoremanagement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ver6Map {

	public static void main(String[] args) {
		
//		Map<String, Integer> data = new HashMap<>();
		Map<String, Integer> data = new TreeMap<>(); // 순서를 보장받을 수 있음.
		
		Scanner sc = new Scanner(System.in);
		
		String title = "학생성적관리프로그램(ver 0.5.2)";
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
				Set<String>  keys = data.keySet();
				Iterator<String> ite = keys.iterator();
				while ( ite.hasNext() ) {
					int kor = data.get(ite.next());
					int math = data.get(ite.next());
					int eng = data.get(ite.next());
					int num = data.get(ite.next());
					System.out.println(num+"\t"+kor+"\t"+eng+"\t"+math);
				}
				
				
//				for ( int i = 0; i < data.size()/4; i++ ) {
//					int num = data.get(i+1+"학번");
//					int kor = data.get(i+1+"국어");
//					int eng = data.get(i+1+"영어");
//					int math = data.get(i+1+"수학");
//					System.out.println(num+"\t"+kor+"\t"+eng+"\t"+math);
//				}
				
			} else if ( input == 2 ) { // 입력.
				System.out.println("학번 > ");
				int num = sc.nextInt();
				if ( data.get(num+"학번")!=null ) {
					System.out.println("중복된 학번입니다.");
					continue;
				}
				System.out.println("국어 > ");
				int kor = sc.nextInt();
				System.out.println("영어 > ");
				int eng = sc.nextInt();
				System.out.println("수학 > ");
				int math = sc.nextInt();
				
				data.put(num+"학번", num);
				data.put(num+"국어", kor);
				data.put(num+"영어", eng);
				data.put(num+"수학", math);
				
			} else if ( input == 3 ) { // 수정.
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
				
				data.put(num+"학번", num);
				data.put(num+"국어", kor);
				data.put(num+"영어", eng);
				data.put(num+"수학", math);
			} else if ( input == 4 ) {
				 System.out.print("삭제할 학번>");
		         int num = sc.nextInt();
		            
		         data.remove(num+"학번");
		         data.remove(num+"국어");
		         data.remove(num+"영어");
		         data.remove(num+"수학");
			}
		}
		
		
	} // main end

} // class end
