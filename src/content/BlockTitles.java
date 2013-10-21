package content;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class BlockTitles extends BasicTestCase {
	 //Check title on a block
		@Test(priority=1, description="Проверяет отображение имен блоков на <<Музыка>>")
		public void MusicTitles () throws Exception {
			  driver.get(musicUrl);
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Топ-исполнители')]")).isDisplayed();
		  		}
				  catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , имя блока <<Топ-исполнители>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Топ-исполнители>>");
				  		throw new NoSuchElementException ();
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Топ-10 треков за неделю')]")).isDisplayed();
				}
				  catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , имя блока <<Топ-10 треков за неделю>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Топ-10 треков за неделю>>");
				  		throw new NoSuchElementException ();
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Популярные жанры')]")).isDisplayed();
			  	}
			  		 catch (NoSuchElementException e) {
						    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , имя блока <<Популярные жанры>>");
					    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Популярные жанры>>");
					  		throw new NoSuchElementException ();
					   		}
	}
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
		
		 @Test(priority=2, description="Проверяет отображение  имен блоков на <<Новинки>>")
		 public void NovinkiTitles () throws Exception {
			 driver.get(novinkiUrl);
			 try {
			 driver.findElement(By.xpath("//h3[contains(text(),'Новые популярные исполнители')]")).isDisplayed();
			 } catch (NoSuchElementException e) {
				    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , имя блока <<Новые популярные исполнители>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новые популярны исполнители>>");
			  		throw new NoSuchElementException (); 
			 }
		 }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/
		 @Test(priority=3, description="Проверяет отображение имен блоков на <<Айзербайджанская>>")
		 public void AzerTitles () throws Exception {
			 driver.get(azerUrl);
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Топ-Исполнители Азербайджана')]")).isDisplayed();
			 }
				 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , имя блока <<Топ-Исполнители Азербайджана>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Топ-Исполнители Азербайджана>>");
				  		throw new NoSuchElementException (); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Популярные жанры')]")).isDisplayed();
		 			}
				 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , имя блока <<Популярные жанры>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Популярные жанры>>");
				  		throw new NoSuchElementException (); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Топ-10 азербайджанских песен за неделю')]")).isDisplayed();
			   	}
			 catch (NoSuchElementException e) {
				    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , имя блока <<Топ-10 азербайджанских песен за неделю>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Топ-10 азербайджанских песен за неделю>>");
			  		throw new NoSuchElementException (); 
			 }
		   
		
	}
}
