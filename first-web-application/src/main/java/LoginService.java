
public class LoginService {
	public boolean validate(String name,String password) {
		return name.equalsIgnoreCase("Bhartesh") && password.equalsIgnoreCase("pass");
	}
}
