package content;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Bloks extends BasicTestCase {

		@Test(priority=1, description="��������� ����������� ������ �� <<������>>")
		public void blocksOnMusic () throws Exception {
			  driver.get(musicUrl);
			  	try{
			  		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][1]")).isDisplayed();//block top 10 tracks of the week
		  		}
				  catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ���� <<��� 10 ������ �� ������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� 10 ������ �� ������>>");
				  		throw new NoSuchElementException ("");
				  		}
			  	try{
			  		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][2]")).isDisplayed();//block pop genres
			  	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ���� <<���������� �����>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������� �����>>");
				  		throw new NoSuchElementException ("");
				  		}
			  	try {
			  		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section']")).isDisplayed();//block top artists
			  	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ���� <<��� �������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� �������>>");
				  		throw new NoSuchElementException ("");
				  		}
		}
/*------------------------------------------------------------------------------------------------------------------------------------------------*/
		 //Check blocks
		 @Test(priority=2, description="��������� ����������� ������ �� <<�������>>")
		 public void blocksOnNovinki () throws Exception {
			 driver.get(novinkiUrl);
			 	try{
			 		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section'][1]")).isDisplayed(); //block new pop artists
			 	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<����� ���������� �������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<����� ���������� �������>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section'][2]")).isDisplayed(); // block new albums
			 	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" ��������������  ���� <<����� �������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<����� �������>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][1]")).isDisplayed(); // block new tracks
			 	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<����� �����>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<����� �����>>");
				  		throw new NoSuchElementException ("");
				  		}
}
/*-----------------------------------------------------------------------------------------------------------------------------------------*/
		//Check blocks on a page
		 @Test(priority=3, description="��������� ����������� ������ �� <<���������������>>")
		 public void CheckBlocks () throws Exception {
			 driver.get(azerUrl);
			 	try{
			 		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][1]")).isDisplayed();//block top 10 tracks of the week
				}
			  	 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� 10 ��������������� ������ �� ������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� 10 ��������������� ������ �� ������>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][2]")).isDisplayed();//block pop genres
			 	}
			 		catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������� �����>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������� �����>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section']")).isDisplayed();//block top artists
			 		}
			 	catch (NoSuchElementException e) {
				    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ������� ������������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ������� ������������>>");
			  		throw new NoSuchElementException ("");
			  		}
			
	}
}

