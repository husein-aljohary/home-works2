package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\aa\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sales Tax Calculator")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div/table/tbody/tr[1]/td[2]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div/table/tbody/tr[1]/td[2]/input")).sendKeys("200");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div/table/tbody/tr[2]/td[2]/input")).sendKeys("5");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table[1]/tbody/tr/td/div/table/tbody/tr[4]/td/input")).click();
		
		String result=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/font/b")).getText();
		if (result.equals("$210.00"))
			System.out.println("success");
		else
			System.out.println("failor");
		
		
		driver.close();


	}

}
