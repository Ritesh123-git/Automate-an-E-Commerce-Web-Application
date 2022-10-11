package com.service;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class FlipcartTestNG {
	
	@Test
	public void flipcartPageTest() throws MalformedURLException {
		
		
	    wd.get("https://www.flipkart.com/");
		
//		long start =System.currentTimeMillis();
//		wd.get("https://www.flipkart.com/");
//		long finish=System.currentTimeMillis();
//		long Total_Time=(finish-start)/1000;
//		System.out.println("Total page load time : "+Total_Time+"seconds");
//		
//		if(Total_Time>10) {
//			System.out.println("Page load time is more than expected");
//		}
//		else {
//			System.out.println("Hurray its loading quickly ");
//		}
		
	
	
//	  wd.manage().window().maximize();
//	  WebElement textFieldRef = wd.findElement(By.name("q"));
//	  textFieldRef.sendKeys("mobiles");
//		WebElement buttonRef = wd.findElement(By.name("btnK"));
//		buttonRef.click();
//	 
//	  	buttonRef.sendKeys(Keys.ENTER);
//	  	try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	  	wd.navigate().back();
		
	//	*[@id="__LOADABLE_REQUIRED_CHUNKS__"]
		
//		WebElement image =wd.findElement(By.xpath("/html/body/script[2]"));
//		if(image.isDisplayed()) {
//			System.out.println("the image text is "+image.getAttribute("alt"));
//		}
//		else {
//			System.out.println("image is not displayed ");
//		}
//		
//		
//		WebElement ExplorePlus= wd.findElement(By.xpath("//*[@id=\"jsonLD\"]"));
//		if(ExplorePlus.isEnabled()) {
//			System.out.println("ExplorePlus in image is enabled ");
//		}
//		else {
//			System.out.println("ExplorePlus in image is not enabled ");
//		}
   
		
		
			
	
////	@Test
//	public void Navigation() {
//		JavascriptExecutor js= (JavascriptExecutor) wd;
//		wd.get("https://www.flipkart.com/");
//		wd.manage().window().maximize();
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
//		
//	}
//		
		
//		  :- Check the frequency at which the content will be refreshed while scrolling
//		JavascriptExecutor js= (JavascriptExecutor) wd;
//		  		try {
//		  			long lastHeight=((Number)js.executeScript("return document.body.scrollHeight")).longValue();
//		  			while (true) {
//		  				((JavascriptExecutor) wd).executeScript("window.scrollTo(0, document.body.scrollHeight);");
//		  				Thread.sleep(2000);
//
//		  				long newHeight = ((Number)js.executeScript("return document.body.scrollHeight")).longValue();
//		  				if (newHeight == lastHeight) {
//		  					break;
//		  				}
//		  				lastHeight = newHeight;
//		  				
//		  				System.out.println(lastHeight);
//		  			}
//		  		} catch (InterruptedException e) {
//		  			e.printStackTrace();
//		  		}
	    
	    
//	    List<WebElement> list = (List<WebElement>) wd.findElement(By.tagName("img"));
//		
//	    int count=1;
//	    for(WebElement element : list) {
//	    	String src=element.getAttribute("src");
//	    	System.out.println(src);
//	    	URL imageURL= new URL(src);
//	    	
//	    	
//			try {
//				BufferedImage saveImage = ImageIO.read(imageURL);
//			
//				ImageIO.write(saveImage, "jpg", new File(count + ".jpg"));
//			}
//			catch(Exception e) {
//				
//			}
//	    }
	    
	    
	    Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
	    System.out.println("height "+screensize.getHeight());
	    System.out.println("width "+screensize.getWidth());
	    int screenresolution= Toolkit.getDefaultToolkit().getScreenResolution();
	    System.out.println("resoltion "+ screenresolution);
	    
	}
	    
		
	

	
	
	
	
  
	
	
	WebDriver wd;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ritesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
  }
  

}

//  @AfterMethod
//  public void afterMethod() {
//  }
//
//
//  @Test
//  public void afterMethodTest() {
//    throw new RuntimeException("Test not implemented");
//  }
//
//  @Test
//  public void beforeMethodTest() {
//    throw new RuntimeException("Test not implemented");
//  }
//}
