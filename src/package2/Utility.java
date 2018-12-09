package package2;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	
public static void screenShot(WebDriver driver, String screenshot){
try{	
TakesScreenshot TS=(TakesScreenshot)driver;	
File src=TS.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("./screenshots/"+screenshot+".png"));
}
catch(Exception E){
	System.out.println("Exception Handled");
}
System.out.println("Screenshots Taken");
}
}
