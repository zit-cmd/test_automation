package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Login {

    public static WebDriver driver;
    public void CorrectUserPass() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement user = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
        user.sendKeys("mngr331902");
        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        pass.sendKeys("ejUrAhy");
        Thread.sleep(3000);
        aboutLink.click();
    }
    public void CorrectUserAndInCorrectPass() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement user = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
        user.sendKeys("mngr331902");
        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        pass.sendKeys("123");
        Thread.sleep(3000);
        aboutLink.click();
    }
    public void CorrectPassAndInCorrectUser() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement user = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
        user.sendKeys("mngr3319");
        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        pass.sendKeys("ejUrAhy");
        Thread.sleep(3000);
        aboutLink.click();
    }
    public void InCorrectUserPass() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement user = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
        user.sendKeys("mngr");
        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        pass.sendKeys("ejUr");
        Thread.sleep(3000);
        aboutLink.click();
    }
    public void UserPassEmpty() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
        Thread.sleep(1000);
        aboutLink.click();
    }
    public void Reset() throws InterruptedException {
        WebElement user = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
        user.sendKeys("vantien@123");
        Thread.sleep(1000);
        WebElement pass = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        pass.sendKeys("1231233");
        Thread.sleep(3000);
        WebElement reset = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[2]"));
        reset.click();
        Thread.sleep(3000);
    }
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\ANONYMOUS\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/index.php");
        Login test1 = new Login();
        String request ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập testcase bạn muốn chạy ");
        request =sc.next();
        switch(request) {
            case "CorrectUserPass":
                test1.CorrectUserPass();
                break;
            case "Reset":
                // code block
                test1.Reset();
                break;
            case "CorrectUserAndInCorrectPass":
                test1.CorrectUserAndInCorrectPass();
                break;
            case "CorrectPassAndInCorrectUser":
                test1.CorrectPassAndInCorrectUser();
                break;
            case "InCorrectUserPass":
                test1.InCorrectUserPass();
                break;
            case "UserPassEmpty":
                test1.UserPassEmpty();
                break;
            default:
                System.out.println("Câu lệnh chưa đúng vui lòng nhập lại");
        }
        driver.close();
    }

}
