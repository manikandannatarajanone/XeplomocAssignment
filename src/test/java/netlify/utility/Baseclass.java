package netlify.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public void launchbrowser(String browsername) {
		if (browsername.equals("chrome")) {
			
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {

			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("invalid browser");
		}

	}

	public void loadurl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}
	
	
	
	

	public void entervalue(WebElement element,String data) {
		element.sendKeys(data);
	}
	public  void clickbtn(WebElement element) {
		element.click();

	}

	public  void togetetxt(WebElement element) {
		System.out.println(element.getText());

	}

	public  Actions Actionclass() {
		Actions a = new Actions(driver);
		return a;

	}

	public  void draganddrop(WebElement element1,WebElement element2) {
		Actions ac = Actionclass();
		ac.dragAndDrop(element1,element2).perform();

	}
	
	public void draganddropby(WebElement element,int x,int y) {
		Actions ac = Actionclass();
		ac.dragAndDropBy(element, x, y).perform();

	}
	
	
	public void doubleclick(WebElement element) {
		Actions ac = Actionclass();
		ac.doubleClick(element).perform();

	}
	public Select selfromddn(WebElement ele,int index) {
		
	    Select s = new Select(ele);
	    s.selectByIndex(index);
	    return s;

		}
	
	public Alert switchtoalert() {
		Alert al = driver.switchTo().alert();
		return al;

	}
	
	public void acceptalert() {
		Alert alert = switchtoalert();
		alert.accept();
	}

	public  void quitbrowser() throws InterruptedException {
		driver.quit();

	}
	
	public String toreaddatafromexcel(String sname,int rno,int cno) throws IOException {
		String value=null;
		File exelloc = new File("C:\\Users\\venka\\eclipse-workspace\\XeplomocAssignment\\Data\\data.xlsx");
		FileInputStream fin = new FileInputStream(exelloc);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sname);
		Row r = s.getRow(rno);
		Cell c = r.getCell(cno);
		int type = c.getCellType();
					if (type ==1) {
						value = c.getStringCellValue();
					}
						
					 else {
					if (DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
						SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
						value = sim.format(d);
						
					} else {
						double d = c.getNumericCellValue();
						long l =(long) d;
						value = String.valueOf(l);
					}
	}return value;
	
	}
	

}
