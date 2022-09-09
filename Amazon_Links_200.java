package a.in;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon_Links_200 {
	WebDriver driver;
	 String s="https://www.amazon.in/ref=nav_logo";

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	 driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	  @Test public void step1() throws Exception { 
		  driver.get(s);
		  List<WebElement> Links_collection=driver.findElements(By.xpath("//div[@class='nav-progressive-content'][@id='nav-xshop']/a"));
		  System.out.println(Links_collection.size());
		  for(WebElement e:Links_collection) {
			  try {
				  if(e.getAttribute("href")!=null) {
					  int count=1;
					  URL u=new URL(e.getAttribute("href"));
					  count++;

					  HttpURLConnection hr=(HttpURLConnection)u.openConnection();
					  hr.connect();
					  if(hr.getResponseCode() == 200)
						{
							System.out.println("Link:  " +u+"---> is working fine"+count++);
						}
						else
						{
							System.out.println("Link:"+u+"---> is not working");
							
						}
					  
				  }
			  }
			  catch(Exception ie){
				  System.out.println(ie);
			  }
		  }
	  }

}
