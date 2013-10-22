package basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import data.UserData;

//import data.UserData;

public class BasicTestCase {
	 public String baseUrl = ("http://www.music.day.az/");
	 protected String searchWord = "Armin";
	 protected static WebDriver driver;
	 public UserData user = new UserData("testpasswordz", "Test_day");
	 protected String musicUrl = "http://music.day.az";
	 protected String azerUrl = "http://music.day.az/audio_az";
	 protected String novinkiUrl = "http://music.day.az/new";
	 protected String playlistUrl = "http://music.day.az/user-993963";
	 protected String uploadUrl = "http://music.day.az/upload";
	 @BeforeTest
	 protected static WebDriver getWebDriver() {
	  if (driver == null) {
	  //System.setProperty("webdriver.chrome.driver", "/home/vadim/drivers/chromedriver");
	 // driver = new ChromeDriver();
		  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  }
	  return driver;
	 }
	 @AfterTest
	 public void thearDown() throws Exception {
	        driver.quit();
	  }
	 
}
