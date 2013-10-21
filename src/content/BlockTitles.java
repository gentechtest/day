package content;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class BlockTitles extends BasicTestCase {
	 //Check title on a block
		@Test(priority=1, description="��������� ����������� ���� ������ �� <<������>>")
		public void MusicTitles () throws Exception {
			  driver.get(musicUrl);
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'���-�����������')]")).isDisplayed();
		  		}
				  catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ��� ����� <<���-�����������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���-�����������>>");
				  		throw new NoSuchElementException ();
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'���-10 ������ �� ������')]")).isDisplayed();
				}
				  catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ��� ����� <<���-10 ������ �� ������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���-10 ������ �� ������>>");
				  		throw new NoSuchElementException ();
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'���������� �����')]")).isDisplayed();
			  	}
			  		 catch (NoSuchElementException e) {
						    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ��� ����� <<���������� �����>>");
					    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������� �����>>");
					  		throw new NoSuchElementException ();
					   		}
	}
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
		
		 @Test(priority=2, description="��������� �����������  ���� ������ �� <<�������>>")
		 public void NovinkiTitles () throws Exception {
			 driver.get(novinkiUrl);
			 try {
			 driver.findElement(By.xpath("//h3[contains(text(),'����� ���������� �����������')]")).isDisplayed();
			 } catch (NoSuchElementException e) {
				    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ��� ����� <<����� ���������� �����������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<����� ��������� �����������>>");
			  		throw new NoSuchElementException (); 
			 }
		 }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/
		 @Test(priority=3, description="��������� ����������� ���� ������ �� <<����������������>>")
		 public void AzerTitles () throws Exception {
			 driver.get(azerUrl);
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'���-����������� ������������')]")).isDisplayed();
			 }
				 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ��� ����� <<���-����������� ������������>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���-����������� ������������>>");
				  		throw new NoSuchElementException (); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'���������� �����')]")).isDisplayed();
		 			}
				 catch (NoSuchElementException e) {
					    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ��� ����� <<���������� �����>>");
				    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������� �����>>");
				  		throw new NoSuchElementException (); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'���-10 ��������������� ����� �� ������')]")).isDisplayed();
			   	}
			 catch (NoSuchElementException e) {
				    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� , ��� ����� <<���-10 ��������������� ����� �� ������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���-10 ��������������� ����� �� ������>>");
			  		throw new NoSuchElementException (); 
			 }
		   
		
	}
}
