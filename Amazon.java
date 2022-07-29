package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>phonePrice = driver.findElements(By.className("a-price-whole"));
        List<Integer> phone =new ArrayList<Integer>();
        for(int i=0; i<phonePrice.size(); i++) {
        	System.out.println(phonePrice.get(i).getText());
        	String pricestr = phonePrice.get(i).getText().replace(",","");
        	int price = Integer.parseInt(pricestr);
        	phone.add(price);
                }
		Collections.sort(phone);
		System.out.println("lowest price" + phone.get(0));
	}

}
