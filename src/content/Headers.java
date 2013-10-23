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
		    assertEquals("�������",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("������",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	throw new AssertionError ();
		    }
		    
		    //azer music
			try {
		    element.Azerbaijanskaya.isDisplayed();
		    assertEquals("���������������",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	throw new AssertionError ();
			    }
		    //my play list
			try {
		    element.PlayList.isDisplayed();
		    assertEquals("��� ��������",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	throw new AssertionError ();
			    }
			//upload
			try {
		    element.Upload.isDisplayed();
		    assertEquals("���������",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	throw new AssertionError ();
			    }
	}
		/*-------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 3, groups={"Header"}, description="��������� ������ �� ����� <<���������������>>")
		public void AzerHeader () throws Exception {
			driver.get(azerUrl);
		    //azer music
			try {
		    element.Azerbaijanskaya.click();
		    assertEquals("���������������",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    element.NewMusic.isDisplayed();
		    assertEquals("�������",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("������",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	throw new AssertionError ();
		    }
		    //my play list
			try {
		    element.PlayList.isDisplayed();
		    assertEquals("��� ��������",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	throw new AssertionError ();
			    }
			//upload
			try {
		    element.Upload.isDisplayed();
		    assertEquals("���������",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	throw new AssertionError ();
			    }
	}
/*--------------------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 4, groups={"Header"}, description="��������� ������ �� ����� <<��� ��������>>")
		public void PlaylistHeader () throws Exception {
			driver.get(playlistUrl);
			//my play list
			try {
		    element.PlayList.click();
		    assertEquals("��� ��������",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	throw new AssertionError ();
			    }
		    //azer music
			try {
		    element.Azerbaijanskaya.isDisplayed();
		    assertEquals("���������������",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    element.NewMusic.isDisplayed();
		    assertEquals("�������",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("������",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	throw new AssertionError ();
		    }
			//upload
			try {
		    element.Upload.isDisplayed();
		    assertEquals("���������",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	throw new AssertionError ();
			    }
	}
/*-----------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 4, groups={"Header"}, description="��������� ������ �� ����� <<���������>>")
		public void UploadHeader () throws Exception {
			driver.get(playlistUrl);
			//upload
			try {
		    element.Upload.click();
		    assertEquals("���������",element.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������>>");
			    	throw new AssertionError ();
			    }
			//my play list
			try {
		    element.PlayList.isDisplayed();
		    assertEquals("��� ��������",element.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<��� ��������>>");
			    	throw new AssertionError ();
			    }
		    //kazahs music
			try {
		    element.Azerbaijanskaya.isDisplayed();
		    assertEquals("���������������",element.Azerbaijanskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<���������������>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    element.NewMusic.isDisplayed();
		    assertEquals("�������",element.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<�������>>");
			    throw new AssertionError ();
			}
			//music
			try {
			element.Music.isDisplayed();
		    assertEquals("������",element.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	Reporter.log("�� �������� "+driver.getCurrentUrl()+" �������������� ���� <<������>>");
		    	throw new AssertionError ();
		    }
	}
}
		
		
		
