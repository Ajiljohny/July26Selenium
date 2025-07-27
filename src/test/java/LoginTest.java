import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setUp() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validLogin(){
        driver.get("https://rahulshettyacademy.com/client/");
        loginPage.waitForElement(By.id("userEmail"));
        loginPage.setLogin("johnd@email.com", "John@123");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

}
