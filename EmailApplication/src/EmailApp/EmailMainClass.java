package EmailApp;

public class EmailMainClass {

	public static void main(String[] args) {
		Utilities ob = new Utilities();
		
		ob.InputDetails(); 
		System.out.println("Please find your corporate email address and first time encrypted password");
		String email = ob.GenerateEmail(); 
		System.out.println("Email    : " + email);
		String ranpass = ob.randomPassword(); 
		System.out.println("Password : " + ranpass.toCharArray());
		ranpass.toCharArray();
		String dept = ob.getDept(); 
		String newpass = ob.newPassword();
		System.out.println("The password is successfully updated!!");
		//String altaddress = ob.alternateAdd();
		
	}

}
