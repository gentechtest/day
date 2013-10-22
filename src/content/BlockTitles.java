package content;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-исполнители>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-исполнители>>");
				  		throw new NoSuchElementException ("");
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Топ-10 треков за неделю')]")).isDisplayed();
				}
				  catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+"неотображается имя блока <<Топ-10 треков за неделю>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+"неотображается имя блока <<Топ-10 треков за неделю>>");
				  		throw new NoSuchElementException ("");
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Популярные жанры')]")).isDisplayed();
			  	}
			  		 catch (NoSuchElementException e) {
						    System.out.println("На странице "+driver.getCurrentUrl()+"неотображается имя блока <<Популярные жанры>>");
					    	Reporter.log("На странице "+driver.getCurrentUrl()+"неотображается имя блока <<Популярные жанры>>");
					  		throw new NoSuchElementException ("");
					   		}
	}
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
		
		 @Test(priority=2, description="Проверяет отображение имен блоков на  <<Музыка>>")
		 public void NovinkiTitles () throws Exception {
			 driver.get(novinkiUrl);
			 try {
			 driver.findElement(By.xpath("//h3[contains(text(),'Новые популярные исполнители')]")).isDisplayed();
			 } catch (NoSuchElementException e) {
				    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Новые популярные исполнители>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Новые популярные исполнители>>");
			  		throw new NoSuchElementException (""); 
			 }
		 }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/
		 @Test(priority=3, description="Проверяет отображение блоков на  <<Азербайджанская>>")
		 public void AzerTitles () throws Exception {
			 driver.get(azerUrl);
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Топ-Исполнители Азербайджана')]")).isDisplayed();
			 }
				 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-Исполнители Азербайджана>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-Исполнители Азербайджана>>");
				  		throw new NoSuchElementException (""); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Популярные жанры')]")).isDisplayed();
		 			}
				 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Популярные жанры>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Популярные жанры>>");
				  		throw new NoSuchElementException (""); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Топ-10 азербайджанских песен за неделю')]")).isDisplayed();
			   	}
			 catch (NoSuchElementException e) {
				    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-10 азербайджанских песен за неделю>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-10 азербайджанских песен за неделю>>");
			  		throw new NoSuchElementException (""); 
			 }
		   
		
	}
}
