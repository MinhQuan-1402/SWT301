import org.junit.jupiter.api.Test;
import quanpm.example.InsecureLogin;

public class InsecureLoginTest {
    @Test
    public void testLoginSuccess(){
        InsecureLogin.login("admin", "123456");
    }
    @Test
    public void testLoginFail(){
        InsecureLogin.login("user", "wrongpassword");
    }
    @Test
    public void testPrintUserInfo(){
        InsecureLogin insecureLogin = new InsecureLogin();
        insecureLogin.printUserInfo("John Doe");
    }
}
