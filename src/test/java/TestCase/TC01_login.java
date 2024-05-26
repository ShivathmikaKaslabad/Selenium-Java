package TestCase;

public class TC01_login extends LoginPage {

	public static void main(String[] args)
	{
		Browser_Launch();
		Enter_EmailId("Naresh@gmail.com");
		Enter_password("P@123");
		Login();
	}
}
