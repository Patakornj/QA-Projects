package Test;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//path must base on your computer
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zentania\\Desktop\\QA2Project\\webdriver\\chromedriver.exe");
		
		//get input of test case
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter test case number: ");
        int selectedcase = scan.nextInt();
        scan.close();
        
        //test Amazon page base on number that get as input
		switch (selectedcase) {
		case 1: testcase1(); break;
		case 2: testcase2(); break;
		case 3: testcase3(); break;
		case 4: testcase4(); break;
		case 5: testcase5(); break;
		case 6: testcase6(); break;
		case 7: testcase7(); break;
		case 8: testcase8(); break;
		case 9: testcase9(); break;
		case 10: testcase10(); break;
		default: System.out.println("We have only 10 case") ;break;
		}
	}
	
	//Scenario: Checking for Today's Deals
	public static void testcase1() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement todaydeal;
		
		todaydeal = d.findElement(By.linkText("Today's Deals"));
		todaydeal.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Sign in with invalid phone number
	public static void testcase2() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement signin, input;
		
		signin = d.findElement(By.linkText("Sign in"));
		signin.click();

		input = d.findElement(By.id("ap_email"));
		input.sendKeys("0830191871");
		input.submit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Create new account with invalid inputs
	public static void testcase3() {
			
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
			
		WebElement signin, newid, name, mail, pass, repass, create;
		
		signin = d.findElement(By.linkText("Sign in"));
		signin.click();
			
		newid = d.findElement(By.id("createAccountSubmit"));
		newid.click();

		name = d.findElement(By.id("ap_customer_name"));
		name.sendKeys("Get");
			
		mail = d.findElement(By.id("ap_email"));
		mail.sendKeys("Napadol");
			
		pass = d.findElement(By.id("ap_password"));
		pass.sendKeys("123456");
			
		repass = d.findElement(By.id("ap_password_check"));
		repass.sendKeys("get123");
			
		create = d.findElement(By.id("continue"));
		create.submit();
			
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		d.quit();	
	}
	
	//Scenario: Search box test
	public static void testcase4() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement searchbox;
		
		searchbox = d.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Nike Air Max");
		searchbox.submit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Select type of product before search
	public static void testcase5() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement searchselect, searchbox;
		
		searchselect = d.findElement(By.id("searchDropdownBox"));
		searchselect.click();
		
		Select type = new Select(searchselect);
		type.selectByVisibleText("Books");
		
		searchbox = d.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("car");
		searchbox.submit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Text Based on Picture
	public static void testcase6() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement searchbox, gray, pic, color;
		
		searchbox = d.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Nintendo Switch Lite");
		searchbox.submit();
		
		gray = d.findElement(By.linkText("Nintendo Switch Lite - Gray"));
		gray.click();
		
		pic = d.findElement(By.className("imgSwatch"));
		pic.click();
		
		color = d.findElement(By.className("selection"));
		if(color.getText().equals("Coral")) {
			System.out.println("Pass!!");
		}
		else {
			System.out.println("Fail!!");
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Searching with filter
	public static void testcase7() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement searchbox, system, price;
		
		searchbox = d.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Smartphone");
		searchbox.submit();
		
		system = d.findElement(By.linkText("iOS"));
		system.click();
		
		price = d.findElement(By.linkText("$250 to $400"));
		price.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Change money currency
	public static void testcase8() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement flag, money, submit, type, searchbox;
		
		flag = d.findElement(By.className("icp-nav-link-inner"));
		flag.click();
		
		money = d.findElement(By.id("a-autoid-0-announce"));
		money.click();
		
		type = d.findElement(By.id("icp-sc-dropdown_2"));
		type.click();
		
		submit = d.findElement(By.cssSelector("input[class='a-button-input']"));
		submit.click();
		
		searchbox = d.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Nike Air Max");
		searchbox.submit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Using Hamburger Menu to buy CD on Amazon Music
	public static void testcase9() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement ham, music, cd;
		
		ham = d.findElement(By.id("nav-hamburger-menu"));
		ham.click();
		
		music = d.findElement(By.linkText("Amazon Music"));
		music.click();
		
		cd = d.findElement(By.linkText("CDs & Vinyl"));
		cd.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
	//Scenario: Going to watch recently live on Amazon Live
	public static void testcase10() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		WebElement ham, amalive, live;
		
		ham = d.findElement(By.id("nav-hamburger-menu"));
		ham.click();
		
		amalive = d.findElement(By.linkText("Amazon Live"));
		amalive.click();
		
		live = d.findElement(By.linkText("Recently Live"));
		live.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.quit();
	}
	
}

