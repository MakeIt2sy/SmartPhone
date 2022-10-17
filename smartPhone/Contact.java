
public abstract class Contact implements ShowData {


	   private String name;
	   private String phone;
       private String mail;
	   private String adress;
	   private String birth;
	   private String group;



	public Contact() {
		  
	  }
	  
	  public Contact(String name, String phone, String mail, String adress, String birth, String group) {
		      this.name = name;
		      this.phone = phone;
		      this.mail = mail;
		      this.adress = adress;
		      this.birth = birth;
		      this.group = group;

	  } 
 
	public void printInfo() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phone);
		System.out.println("메일:"+mail);
		System.out.println("주소:"+adress);
		System.out.println("생일:"+birth);
		System.out.println("그룹:"+group);
		
		
	}

	
	public abstract void showData();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	
}
	
	


