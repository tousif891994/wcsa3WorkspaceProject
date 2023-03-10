package pageObjectModel;

import java.io.IOException;

public class TestLogoutActitime extends BaseTest {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		String validUsername = flib.readPropertyData(PROP_PATH, "username");
		String validPassword = flib.readPropertyData(PROP_PATH, "password");
		
		lp.validLoginActitime(validUsername,validPassword);
		
		HomePage hp = new HomePage(driver);
		hp.logOutMethod();
	}


}
