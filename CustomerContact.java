
public class CustomerContact extends Contact{
	

	String customerName;
	String item;
	String position;
	
	public CustomerContact(String name, String phone, String mail, String adress, String birth,String group) {
		super(name,phone,mail,adress,birth,group);
	}
	
	public CustomerContact(String name, String phone, String mail, String adress, String birth,String group,String customerName,String item,String position ) {
		super(name,phone,mail,adress,birth,group);
		this.customerName = customerName;
		this.item=item;
		this.position=position;
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("거래처 이름:"+customerName);
		System.out.println("거래품목:"+item);
		System.out.println("직급:"+position);
		
	}
	
	@Override
	public void showData() {
		 System.out.println("이름:"+getName());
		 System.out.println("번호:"+getPhone());
		
	}
	

}
