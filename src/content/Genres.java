package content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Genres extends BasicTestCase {
	@Test(priority=1, description="��������� ����������� ������ �� <<������>>")
	public void MusicGenres () throws Exception {
	driver.get(musicUrl);
	checkGenres(24);
	}
	@Test(priority=2, description="��������� ����������� ������ �� <<���������������>>")
	public void NovinkiGenres () throws Exception {
	driver.get(azerUrl);
	checkGenres(25);
	}


//check genre tags is present
public void checkGenres (int expected_numb_genres) throws Exception {
 int real_numb_genres = driver.findElements(By.xpath (".//*[@class='popular-genres']/li")).size();
 for (int i=1; i<=real_numb_genres; i++) {
  driver.findElement(By.xpath (".//*[@class='popular-genres']/li["+i+"]")).isDisplayed();
 }
 if (expected_numb_genres !=real_numb_genres) {
  System.out.println("�� �������� "+driver.getCurrentUrl()+" ��������������� �����");
  Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� �����");
  throw new NullPointerException();
 }
}
}
