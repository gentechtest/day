package content;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageFactory.ContentPage;
import basic.BasicTestCase;

public class Headers extends BasicTestCase { 
private ContentPage element = PageFactory.initElements(getWebDriver(), ContentPage.class);
	
	@Test(priority = 1,groups={"Header"}, description="Проверяет отображение ссылок на шапке <<Музыка>>")
	public void MusicHeader () throws Exception {
		driver.get(musicUrl);
		//music
		try {
		element.Music.click();
	    assertEquals("МУЗЫКА",element.Music.getText());
		}
	    catch (AssertionError e) { 
	    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
	    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
	    	throw new AssertionError ();
	    }
	    //new music
		try {
	    element.NewMusic.isDisplayed();
	    assertEquals("Новинки",element.NewMusic.getText());
		}
		catch (AssertionError e) { 
		    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
		    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
		    throw new AssertionError ();
		}
	    //azer music
		try {
	    element.Azerbaijanskaya.isDisplayed();
	    assertEquals("Азербайджанская",element.Azerbaijanskaya.getText());
		}
		 catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
		    	throw new AssertionError ();
		    }
	    //my play list
		try {
	    element.PlayList.isDisplayed();
	    assertEquals("Мой плейлист",element.PlayList.getText());
		}
		 catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
		    	throw new AssertionError ();
		    }
		//upload
		try {
	    element.Upload.isDisplayed();
	    assertEquals("Загрузить",element.Upload.getText());
		}
		 catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
		    	throw new AssertionError ();
		    }
	}
	/*------------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 2, groups={"Header"}, description="Проверяет отображение ссылок на шапке <<Новинки>>")
		public void NovinkiHeader () throws Exception {
			driver.get(novinkiUrl);
			//new music
			try {
		    element.NewMusic.click();
		    assertEquals("Новинки",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("МУЗЫКА",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
		    	throw new AssertionError ();
		    }
		    
		    //azer music
			try {
		    element.Azerbaijanskaya.isDisplayed();
		    assertEquals("Азербайджанская",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	throw new AssertionError ();
			    }
		    //my play list
			try {
		    element.PlayList.isDisplayed();
		    assertEquals("Мой плейлист",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
			//upload
			try {
		    element.Upload.isDisplayed();
		    assertEquals("Загрузить",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	throw new AssertionError ();
			    }
	}
		/*-------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 3, groups={"Header"}, description="Проверяет отображение ссылок на шапке <<Азербайджанская>>")
		public void AzerHeader () throws Exception {
			driver.get(azerUrl);
		    //azer music
			try {
		    element.Azerbaijanskaya.click();
		    assertEquals("Азербайджанская",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    element.NewMusic.isDisplayed();
		    assertEquals("Новинки",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("МУЗЫКА",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<МУЗЫКА>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<МУЗЫКА>>");
		    	throw new AssertionError ();
		    }
		    //my play list
			try {
		    element.PlayList.isDisplayed();
		    assertEquals("Мой плейлист",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
			//upload
			try {
		    element.Upload.isDisplayed();
		    assertEquals("Загрузить",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	throw new AssertionError ();
			    }
	}
/*--------------------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 4, groups={"Header"}, description="Проверяет отображение ссылок на шапке  <<Мой плейлист>>")
		public void PlaylistHeader () throws Exception {
			driver.get(playlistUrl);
			//my play list
			try {
		    element.PlayList.click();
		    assertEquals("Мой плейлист",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
		    //azer music
			try {
		    element.Azerbaijanskaya.isDisplayed();
		    assertEquals("Азербайджанская",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    element.NewMusic.isDisplayed();
		    assertEquals("Новинки",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("МУЗЫКА",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
		    	throw new AssertionError ();
		    }
			//upload
			try {
		    element.Upload.isDisplayed();
		    assertEquals("Загрузить",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	throw new AssertionError ();
			    }
	}
/*-----------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 4, groups={"Header"}, description="Проверяет отображение ссылок на шапке <<Загрузить>>")
		public void UploadHeader () throws Exception {
			driver.get(playlistUrl);
			//upload
			try {
		    element.Upload.click();
		    assertEquals("Загрузить",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Загрузить>>");
			    	throw new AssertionError ();
			    }
			//my play list
			try {
		    element.PlayList.isDisplayed();
		    assertEquals("Мой плейлист",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
		    //kazahs music
			try {
		    element.Azerbaijanskaya.isDisplayed();
		    assertEquals("Азербайджанская",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Азербайджанская>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    element.NewMusic.isDisplayed();
		    assertEquals("Новинки",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("МУЗЫКА",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается ссылка <<Музыка>>");
		    	throw new AssertionError ();
		    }
	}
}
		
		
		
