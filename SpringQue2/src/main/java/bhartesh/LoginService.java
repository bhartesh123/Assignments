package bhartesh;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equals("Bhartesh") && password.equals("pass");
	}

}