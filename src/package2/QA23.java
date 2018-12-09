package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class QA23 {

public static WebDriver driver;	
@Test	
public void initiateBrowser(){
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
Utility.screenShot(driver,"A");
driver.findElement(By.id("email1errere")).sendKeys("Saddambmas86@gmail.com");
}


@AfterMethod
public void tearDown(ITestResult result){

if(ITestResult.FAILURE==result.getStatus()){
	Utility.screenShot(driver, result.getName());
}
driver.quit();
}



}
