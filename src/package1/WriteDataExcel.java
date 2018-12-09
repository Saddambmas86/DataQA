package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataExcel {
	
public static void main(String[] Args) throws InterruptedException, Exception{

File src = new File("C:\\Users\\Shusain\\Desktop\\JS\\TestData.xlsx");

FileInputStream Fin=new FileInputStream(src);

XSSFWorkbook wb=new XSSFWorkbook(Fin);

XSSFSheet sheet=wb.getSheetAt(0);

//String A= sheet.getRow(0).getCell(0).getStringCellValue();

sheet.getRow(0).createCell(2).setCellValue("Pass");
sheet.getRow(1).createCell(2).setCellValue("False");
	
FileOutputStream Fout=new FileOutputStream(src);
wb.write(Fout);
wb.close();

	
	
	
}

}
