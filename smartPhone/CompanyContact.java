
public class CompanyContact extends Contact {

	public String companyName;
	public String department;
	public String position;
	
	public CompanyContact(String name, String phone,String mail, String adress, String birth,String group ) {
		super(name,phone,mail,adress,birth,group);
	}
	public CompanyContact(String name, String phone, String mail, String adress, String birth,String group,String companyName,String department,String position ) {
		super(name,phone,mail,adress,birth,group);
		this.companyName = companyName;
		this.department=department;
		this.position=position;
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("회사이름:"+companyName);
		System.out.println("부서이름:"+department);
		System.out.println("직급:"+position);
		
	}
	
	@Override
	public void showData() {
		 System.out.println("이름:"+getName());
		 System.out.println("번호:"+getPhone());
		
	}
	
	


	
	
}
