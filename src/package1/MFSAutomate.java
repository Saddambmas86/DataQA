package package1;
public class MFSAutomate {

public static void main(String[] args) throws InterruptedException {
	
//SelfLink Thread1=new SelfLink();
ManagerLink Thread2=new ManagerLink();
Colleague1Link Thread3=new Colleague1Link();
Colleague2Link Thread4=new Colleague2Link();
Direct1Link Thread5=new Direct1Link();
Direct2Link Thread6=new Direct2Link();
Other1Link Thread7=new Other1Link();
Other2Link Thread8=new Other2Link();

//Thread1.start();
//Thread2.start();
//Thread3.start();	
Thread4.start();
//Thread5.start();
//Thread6.start();
//Thread7.start();
//Thread8.start();







/*	
==========================================================================================================
//Excel Sheet:	

ReadExcelData T1=new ReadExcelData("C:\\Users\\Shusain\\Desktop\\Automate MFS\\Project Links Sheet.xlsx");
String LinkB2=T1.getData(0, 1, 1);
String UsernameC2=T1.getData(0, 1, 2);
String PasswordD2=T1.getData(0, 1, 3);

System.setProperty("webdriver.chrome.driver","C://Users//Shusain//Desktop//JS//Selenium//Selenium Setup//chromedriver_win32//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get(LinkB2);
Thread.sleep(5000);
driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='ContentFrame']")));
driver.findElement(By.id("UserID")).sendKeys(UsernameC2);
driver.findElement(By.id("userpw")).sendKeys(PasswordD2);
driver.findElement(By.id("cmdLogin")).click();
Thread.sleep(3000);
driver.findElement(By.id("chkAgreement")).click();
driver.findElement(By.id("cmdsave")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("html/body/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/a")).click();
driver.findElement(By.id("cmdNext")).click();

//First question:
//driver.findElement(By.xpath("//input[@name='i1'][@value='4']")).click();

Random RanNumber=new Random();

//Importance Rating Next button
try{
		
//Questionnaire:	
for(int j=1;j<=200;j++){
	int min=1;
	int max=5;
	int Z=min+ RanNumber.nextInt(max);
String B="i"+j;	
String A="//input[@name='"+B+"'][@value='"+Z+"']";

try{
	boolean C=driver.findElement(By.xpath(A)).isDisplayed();
	if(C==true){
	driver.findElement(By.xpath(A)).click();
	Thread.sleep(1000);
	}
	}
catch(Exception E){
	driver.findElement(By.id("cmdNext")).click();	
	Thread.sleep(4000);
	}
finally{
		driver.findElement(By.xpath(A)).click();
	}
}
}catch(Exception X1){

boolean SendButton=driver.findElement(By.id("cmdSend")).isDisplayed();

		
if(SendButton==false){	
	driver.findElement(By.id("cmdNext")).click();
	Thread.sleep(4000);
	//Importance Rating Page Questions	

for(int j=1;j<=200;j++){
	int min=1;
	int max=5;
	int Z=min+ RanNumber.nextInt(max);
	String B="i"+j;	
	String A="//input[@name='"+B+"'][@value='"+Z+"']";
try{
boolean C=driver.findElement(By.xpath(A)).isDisplayed();
if(C==true){
	driver.findElement(By.xpath(A)).click();
	Thread.sleep(2000);
	}
	}
catch(Exception E){
driver.findElement(By.id("cmdNext")).click();	
Thread.sleep(5000);
}
finally{
	driver.findElement(By.xpath(A)).click();
}
}	
}
else{
driver.findElement(By.id("cmdSend")).click();
}
}
driver.switchTo().defaultContent();
driver.close();	
}
===============================================================================================
*/
}
}
