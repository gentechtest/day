package content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Playmusic extends BasicTestCase {
	 //Play music on a page
	@Test(priority=7, description="��������� ������ �� ���� �� �������� ��������")
	public void PlayMusic () throws Exception {
		 driver.get(musicUrl);
		 playMusic();
}
	   //Play music test
	   public void playMusic () throws Exception {
	   driver.findElement(By.xpath("//*[@class='row']/strong/a")).click();
	   driver.findElement(By.xpath("//*[@class='mainsection']//*[@class='advanced_playlist']/li/a")).click();
	   for(int i=0; i<=35; i++) {
	   String styl = driver.findElement(By.xpath(".//*[@id='progress_slider']/a")).getAttribute("style");   
	   if(styl.equals("left: 0%;")) {    
	   Thread.sleep(1000);
	   } else break;
	   if(i>=30) { //set how long wait
	    	 System.out.println("�� �������� "+driver.getCurrentUrl()+" �� ������ ����");
		     Reporter.log("�� �������� "+driver.getCurrentUrl()+" �� ������ ����");
		   throw new NullPointerException ();
	   }   
	   }
	   }
}
