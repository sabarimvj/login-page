import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainLogin {
	public static WebDriver driver;
	
	@Before
	public void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	
	@After
	public void test1()
	{
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test2()
	{
		System.out.println("hello");
		
		
	}
}
