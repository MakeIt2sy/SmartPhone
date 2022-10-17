import java.util.Scanner;
public class SmartPhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();

		
		System.out.println("#데이터 2개를 입력합니다.");
		
		for(int i=0; i<2; i++) {
		    smartPhone.addContact(smartPhone.inputContactData(i+1));  
			   	
		}


		while(true) {
			
			printMenu();
			String choiceMenu = sc.nextLine();
			
			switch(choiceMenu) {
			
			case "1": 
				System.out.println("-------------------");
				System.out.println("입력 타입을 선택하세요");
				System.out.println("1.회사 / 2.거래처");
				int select = sc.nextInt();
				sc.nextLine();
				smartPhone.addContact(smartPhone.inputContactData(select));
			          break;
			case "2": System.out.println("검색하고자하는 이름을 입력하세요.");
		              smartPhone.serchContact(sc.nextLine());
		              break;
			case "3": System.out.println("수정하고자 하는 이름을 입력해주세요.");
			          String name = sc.nextLine();
			          smartPhone.serchContact(name);
			          break;
			case "4": System.out.println("삭제하고자 하는 이름을 입력하세요.");
			          smartPhone.deleteContact(sc.nextLine());
			          break;
			case "5": smartPhone.printAllContact();
			          break; 
			
			case "6": System.out.println("프로그램을 종료합니다.");
			          System.exit(0);
			
			default : System.out.println("잘못된 선택입니다. 1~6 사이 숫자를 입력해주세요.");
			          return;
			}
			
		}
		
		
	}
			
			

             

	
	public static void printMenu() {
	   System.out.println("Contact----------------------------");
	   System.out.println("1. 연락처 입력 ");
	   System.out.println("2. 연락처 검색");
	   System.out.println("3. 연락처 수정");
	   System.out.println("4. 연락처 삭제");
	   System.out.println("5. 연락처 전체 리스트 보기");
	   System.out.println("6. 종료");
	   System.out.println("-----------------------------------");
	}
	
	
	
	
	

	}
	



