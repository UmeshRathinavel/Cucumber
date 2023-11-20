package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static final Actions Actionsobj = null;
	public static WebDriver driver;
	
	//1.LaunchBrowser
	public static void launchbrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	} else if (browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}else if (browsername.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver();
		driver = new EdgeDriver();
	}
		driver.manage().window().maximize();
		
	}
	
		//2.Get  URLLaunch
		public static void launchurl(String url) {
			driver.get(url);
		
		}
		
		//3.Navigate To Forward
		
		private static void forwardpage() {
			driver.navigate().forward();		
		}
		
		//4.navigate to url
		
		public static void navigateto (String url) {
			driver.navigate().to(url);
		}
		
		//5.navigate back
		public static void backpage(WebElement element) {
			driver.navigate().back();
		}
		
		//6.Navigate Refresh
		public static void refresh (WebElement element) {
			driver.navigate().refresh();
		}
		
		//7.Radiobutton
		public static void radiobutton (WebElement element) {
			element.click();
		}
		
		//8.Close
		public static void close() {
			driver.close();
		}
		
		//9.Quit
		public static void quit () {
			driver.quit();
			
		}
		
		//10.Send Key
		public static void passinput (WebElement element, String input) {
			element.sendKeys(input);
			
		}
		
		//11.Click
		public static void click (WebElement element) {
			element.click(); 
		}
		
		//12.Clear
		public static void clear (WebElement element) {
			element.clear();
		}
		
		//13.Select
		public static Select dropdownobject1 (WebElement element) {
			Select s = new Select(element);
			return s;
		}
		
		//14.Select By Value
		public static void selectbyvalue (WebElement element, String input) {
			dropdownobject1(element).selectByValue(input);
			
		}
		
		//14. Select By Index
		public static void selectbyindex(WebElement element, int input) {
			dropdownobject1(element).selectByIndex(input);
		}
		
		//15.Select By Visible Text
		public static void selectbyvisibletext(WebElement element, String sec) {
			dropdownobject1(element).selectByVisibleText(sec);
		}
		
		//16.Take Screenshot
		public static void screenshot(String loc) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scr = ts.getScreenshotAs(null);
			FileUtils.copyDirectory(scr, new File("loc"));
		}
			
		//17.Full Takescreenshot
//		public static void fulltakescreenshot() {
//			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			try {
//				FileUtils.copyFile(screenshot ,new File ("path"));
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		//18.Scroll Up And Down
		public static void scroll(String src, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) element;
			js.executeAsyncScript (src, element);
		}
		
		//19.Alert Accept
		public static void alertaccept() {
			driver.switchTo().alert().accept();
		}

		//20.alert dismiss
		public static void alertdismiss() {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		}
		
		//21.Alert Send Keys 
		public static void alertsendkeys(String name) {
			Alert a = driver.switchTo().alert();
			a.sendKeys(name);
		}
		
		//22.Alert Get Text
		public static void gettext() {
			Alert a = driver.switchTo().alert();
			a.getText();
		}
		
		//23.Get URL
		public static void geturl() {
			System.out.println(driver.getCurrentUrl());
		}
		
		//24.Get Title
		public static void gettitle() {
			System.out.println(driver.getTitle());
		}
		
		//25.Get Text
		public static void gettext(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		
		private static Actions Actionsobj () {
			Actions ac = new Actions(driver);
			return ac;
		}
		
		//26.Action Click
		public static void actionsclick(WebElement element) {
			Actionsobj().click(element).perform();
		}
		
		//27.Actions Contextclick
		public static void actionscontextclick(WebElement element) {
			Actionsobj().contextClick(element).perform();
		}
		
		//28.Actions Doubleclick
		public static void actionsdoubleclick(WebElement element) {
			Actionsobj().doubleClick(element).perform();
		}
		
		//29.Actions Drag and drop
		public static void actionsdraganddrop(WebElement element, WebElement element2) {
			Actionsobj().dragAndDrop(element, element2).click().build().perform();
		}
		
		private static Robot robotobj() throws AWTException {
		      Robot r = new Robot();
			    return r;
		}
		
		//30.Robot Up Keypress
		public static void upkeypress() throws AWTException {
			robotobj().keyPress(KeyEvent.VK_UP);
			robotobj().keyRelease(KeyEvent.VK_UP);
		}
		
		//31.Roobot Downkeypress
		public static void downkeypress() throws AWTException {
			robotobj().keyPress(KeyEvent.VK_DOWN);
			robotobj().keyRelease(KeyEvent.VK_DOWN);
		}
		
		//32.Robot Enter
		public static void robotenter() throws AWTException {
			robotobj().keyPress(KeyEvent.VK_ENTER);
			robotobj().keyRelease(KeyEvent.VK_ENTER);
		}
		
		//33. Get Windows Handles
		public static void windowshandles() {
			Set<String> str =	driver.getWindowHandles();
			System.out.println(str);
			for (String id : str) {
				String name = driver.switchTo().window(id).getTitle();
				System.out.println(name);
			}
		}
		
		//34.get window handle
		public static void windowhandle() {
			String id = driver.getWindowHandle();
			System.out.println(id);
		}
		
		//35.isenable
		public static void isenable(WebElement element) {
			System.out.println(element.isEnabled());
		}
		
		//36.Isdisplayed
		public static void isdiplayed(WebElement element) {
			System.out.println(element.isDisplayed());
		}
		
		//37.Isselected
		public static void isselected(WebElement element) {
			System.out.println(element.isSelected());
		}
		
		//38.Deselect by visible text
		public static void deselectbyvisibletext(WebElement element, String text) {
			dropdownobject1(element).deselectByVisibleText(text);
		}
		
		
		//39.Deselect By Value
		public static void deselectbyvalue(WebElement element, String text) {
			dropdownobject1(element).deselectByValue(text);
		}
		
		//40.Deselect By Index
		public static void deselectbyindex(WebElement element, Integer input) {
			dropdownobject1(element).deselectByIndex(input);
		}
		
		//41.ismultiple
		public static void ismultiple(WebElement element) {
			Select s = new Select(element);
			System.out.println(s.isMultiple());
		}
		
		//42.Get Option
		public static void getoption(WebElement element) {
			Select s = new Select(element);
			List<WebElement> option =	s.getOptions();
			for (WebElement set : option) {
				System.out.println(set.getText());
		}
		}
		
		//43.Get All Selected Options
		public static void getallselectedoptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allselectedoptions =	s.getAllSelectedOptions();
			for (WebElement allset : allselectedoptions) {
				System.out.println(allset.getText());
			}
		}
		
		//44.Get First Selected Option
		public static void getfirstselectedoption(WebElement element) {
			Select s = new Select(element);
			WebElement firstselect = s.getFirstSelectedOption();
			System.out.println(firstselect.getText());
		}

		//45.Implicity Wait
		public static void implicitywait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
		
		//46.Explicity Wait
		public static void explicitywait(WebElement element, int sec) {
			WebDriverWait wait = new WebDriverWait(driver, sec);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		//47.Fluent Wait
		public static void fluentwait(int sec) {
			//FluentWait<T> w = new FluentWait(driver);
			//w.withTimeout(sec, TimeUnit.SECONDS);
			//w.pollingEvery(sec, TimeUnit.SECONDS);
			//w.ignoring(Exception.class);
		}
		
		//48.Webtable All Datas
		public static void webtablealldatas(List<WebElement> elements) {
			List<WebElement>  datas = elements;
			for (WebElement alldatas : datas) {
			System.out.println(alldatas.getText());
		}
		}
		
		//49.Web Table All Row
		public static void allrow(List<WebElement> elements) {
			List<WebElement> rdatas = elements;
			for (WebElement rowdatas : rdatas) {
			System.out.println(rowdatas.getText());
			}
		}
		
		//50.Web Wable Colums
		public static void colums(List<WebElement> elements) {
			List<WebElement> colum = elements;
			for (WebElement colums : colum) {
				System.out.println(colums.getText());
			}
		}
			
		//51.Web Table Singledata
		public static void singledata(WebElement element) {
			System.out.println(element.getText());
		}
		
		//52.Frameid
		public static void frame(String id) {
			driver.switchTo().frame(id);
			}
		
		//53.Frame Index
		public static void frameindex(int index) {
			driver.switchTo().frame(index);
		}
		
		//54.Frame Webelement
		public static void framewebelement(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		//55.Frame Exit
		public static void frameexit() {
			driver.switchTo().defaultContent();
			}
			
		//56.Outer Frame
		public static void outerframe() {
			driver.switchTo().parentFrame();
		}
		//57.Move to action click
		public static void actionsmoveto(WebElement element) {
			Actionsobj().moveToElement(element).perform();
		}
		//58.js executer
		//javascript
				public static void javascript() {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,200)","");
				}
}
