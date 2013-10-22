package content;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Bloks extends BasicTestCase {

		@Test(priority=1, description="Проверяет отображение блоков на <<Музыка>>")
		public void blocksOnMusic () throws Exception {
			  driver.get(musicUrl);
			  	try{
			  		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][1]")).isDisplayed();//block top 10 tracks of the week
		  		}
				  catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , блок <<Топ 10 треков за неделю>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Топ 10 треков за неделю>>");
				  		throw new NoSuchElementException ("");
				  		}
			  	try{
			  		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][2]")).isDisplayed();//block pop genres
			  	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , блок <<Популярные жанры>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Популярные жанры>>");
				  		throw new NoSuchElementException ("");
				  		}
			  	try {
			  		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section']")).isDisplayed();//block top artists
			  	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается , блок <<Топ артисты>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Топ артисты>>");
				  		throw new NoSuchElementException ("");
				  		}
		}
/*------------------------------------------------------------------------------------------------------------------------------------------------*/
		 //Check blocks
		 @Test(priority=2, description="Проверяет отображение блоков на <<Новинки>>")
		 public void blocksOnNovinki () throws Exception {
			 driver.get(novinkiUrl);
			 	try{
			 		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section'][1]")).isDisplayed(); //block new pop artists
			 	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается блок <<Новые популярные артисты>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новые популярные артисты>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section'][2]")).isDisplayed(); // block new albums
			 	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается  блок <<Новые альбомы>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новые альбомы>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][1]")).isDisplayed(); // block new tracks
			 	}
			  	 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается блок <<Новые треки>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новые треки>>");
				  		throw new NoSuchElementException ("");
				  		}
}
/*-----------------------------------------------------------------------------------------------------------------------------------------*/
		//Check blocks on a page
		 @Test(priority=3, description="Проверяет отображение блоков на <<Азербайджанская>>")
		 public void CheckBlocks () throws Exception {
			 driver.get(azerUrl);
			 	try{
			 		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][1]")).isDisplayed();//block top 10 tracks of the week
				}
			  	 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается блок <<ТОП 10 Азербайджанских треков за неделю>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<ТОП 10 Азербайджанских треков за неделю>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='maincontent']//*[@class='section'][2]")).isDisplayed();//block pop genres
			 	}
			 		catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается блок <<Популярные жанры>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Популярные жанры>>");
				  		throw new NoSuchElementException ("");
				  		}
			 	try{
			 		driver.findElement(By.xpath("//*[@class='aside']//*[@class='section']")).isDisplayed();//block top artists
			 		}
			 	catch (NoSuchElementException e) {
				    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается блок <<Топ артисты азербайджана>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Топ артисты азербайджана>>");
			  		throw new NoSuchElementException ("");
			  		}
			
	}
}

