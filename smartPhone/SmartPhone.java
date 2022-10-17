import java.util.Scanner;

public class SmartPhone {
    Scanner sc;
    Contact[] contactArr; 

    int length=0;
    boolean stop;
         
       public SmartPhone() {
    	   this.contactArr = new Contact[10];
    	   sc = new Scanner(System.in);
    	   
       }
 
    
       public Contact inputContactData(int select) {
    	  
    	   
    	   
    	  System.out.println("이름:");
    	  String name = hasEmpty(sc.nextLine());
    	  System.out.println("전화번호:");
    	  String phone = samePhone(hasEmpty(sc.nextLine()));
    	  System.out.println("메일:");
    	  String mail = hasEmpty(sc.nextLine());
    	  System.out.println("주소:");
    	  String adress = hasEmpty(sc.nextLine());
    	  System.out.println("생일:");
    	  String birth = hasEmpty(sc.nextLine());
    	  System.out.println("그룹: 회사(h)/거래처(g)");
    	  String group = hasEmpty(sc.nextLine());
    	  
    	 Contact contact = null; 
    	 
    	 if(select == 1) {
    		 
    	   System.out.println("회사이름: ");
      	   String companyName = hasEmpty(sc.nextLine());
     	   System.out.println("부서 이름:");
    	   String department = hasEmpty(sc.nextLine());
    	   System.out.println("직급:");
     	   String position = hasEmpty(sc.nextLine());
     	   
     	   contact = new CompanyContact(name,phone,mail,adress,birth,group,companyName,department,position);
    		 
    	 } else if(select == 2) {
      	   System.out.println("거래처 이름:");
     	   String customerName = hasEmpty(sc.nextLine());
     	   System.out.println("부서 이름:");
    	   String item = hasEmpty(sc.nextLine());
    	   System.out.println("직급:");
     	   String position = hasEmpty(sc.nextLine());
     	   
     	   contact = new CustomerContact(name,phone,mail,adress,birth,group,customerName,item,position);
    		  
    	 }
    	   
    	 return contact;
    	 
    	  
      
 }
        


	public void addContact(Contact contact) { 
		
	      contactArr[length] = contact;
	      length++;
	      System.out.println(">>> 데이터가 저장되었습니다. ("+length+")");

         }


     public void printContact(Contact contact) {
    	   
    	   contact.printInfo();
    	 

     }

     public void printAllContact() { 

    	 for (int i=0; i<length; i++) {
    		 
    		 printContact(contactArr[i]);
    		
    	 }
	      
     }
    	 
  
 
    public void serchContact(String name) {  

	      for(int i=0; i<length;i++) {
	    	  
		       if (contactArr[i].getName().contentEquals(name)) {
			       printContact(contactArr[i]);

		         }

	     }
	      System.out.println("검색 결과가 없습니다.");
	
    }



    public void deleteContact(String name) {  


	      for(int i=0; i<length;i++) {
	    	  Contact contact = (Contact) contactArr[i];
		      if (contact.getName().contentEquals(name)) {
			  for(int j=i; j<length; j++) {
				contactArr[j]=contactArr[j+1];

			 }
			 
			  --length;  

		      }
	        }
    }


     public void editContact(String name, Contact newContact) {
 
    	 for(int i=0; i<length; i++) {
    		if(((Contact)contactArr[i]).getName().contentEquals(name)) {
    			contactArr[i] = newContact;
    			return;
    		}
    	 }	
    	System.out.println("검색결과가 없습니다.");
                      
	          }
     
     public String hasEmpty(String string) {
    	 
    	 
    	 if(string.replaceAll(" ","").contentEquals(string)) {
    		 
    		 return string;
            } else {
               System.out.println("다시 입력하세요.");
             return sc.nextLine();
            }
    	 	 
     }
     
     
     public String samePhone(String phone) {
    	 
    	 for(int i=0; i<length;i++) {
	    	  
		       if (contactArr[i].getPhone().contentEquals(phone)) {
			       System.out.println("이미 존재하는 전화번호입니다.");
		    	   
			       return sc.nextLine();

		         }
		       
    	 
     }
      return phone;
     }

}

