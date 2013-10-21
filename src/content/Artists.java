package content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Artists extends BasicTestCase {
	@Test(priority=1, description="��������� ����������� �������� ��  <<������>>")
	public void MusicArtists () throws Exception {
	  driver.get(musicUrl);
	  checkArtists(15);
}
	@Test(priority=2, description="��������� ����������� �������� ��  <<�������>>")
	public void NovinkiArtists () throws Exception {
	  driver.get(novinkiUrl);
	  checkArtists(7);
}
	@Test(priority=3, description="��������� ����������� �������� ��  <<���������������>>")
	public void AzerArtists () throws Exception {
	  driver.get(azerUrl);
	  checkArtists(15);
}
	//check artists is present
	public void checkArtists (int expected_numb_artists) throws Exception {
	    int real_numb_artists = driver.findElements(By.cssSelector(".ordered-list>li")).size();
	    for (int i=1; i<=real_numb_artists; i++) { 
	    driver.findElement(By.xpath("//*[@class='ordered-list']//li["+i+"]/h4/a")).isDisplayed();
	     }
	    if (expected_numb_artists != real_numb_artists) {
	    	 System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� �����������");
		     Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� �����������");
		     throw new NullPointerException ();
	    }
	} 

}
