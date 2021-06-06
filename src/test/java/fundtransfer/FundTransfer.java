package fundtransfer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

//mngr332186
//UbuqYqa
public class FundTransfer {

    public static WebDriver driver;
    public void Login() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
        Thread.sleep(1000);


        WebElement payers = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
        payers.sendKeys("mngr332186");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        payees.sendKeys("UbuqYqa");
        Thread.sleep(1000);
        aboutLink.click();
        Thread.sleep(2000);


    }
    public void InputBlank() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement payers = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payers.sendKeys("12345");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payees.sendKeys("12346");
        Thread.sleep(1000);
        WebElement amount = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amount.sendKeys("100000");
        Thread.sleep(2000);
        aboutLink.click();
        Thread.sleep(3000);

    }
    public void Invalid() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement payers = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payers.sendKeys("12345a");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payees.sendKeys("12346");
        Thread.sleep(1000);
        WebElement amount = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amount.sendKeys("100000");
        Thread.sleep(1000);
        WebElement description = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        description.sendKeys("giao dịch");
        Thread.sleep(2000);
        aboutLink.click();
        Thread.sleep(2000);
    }
    public void NoExist() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement payers = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payers.sendKeys("12345");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payees.sendKeys("12346");
        Thread.sleep(1000);
        WebElement amount = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amount.sendKeys("100000");
        Thread.sleep(1000);
        WebElement description = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        description.sendKeys("giao dịch");
        Thread.sleep(2000);
        aboutLink.click();
        Thread.sleep(2000);
    }
    public void Amount() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement payers = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payers.sendKeys("93595");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payees.sendKeys("93596");
        Thread.sleep(1000);
        WebElement amount = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amount.sendKeys("10000000");
        Thread.sleep(1000);
        WebElement description = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        description.sendKeys("giao dịch");
        Thread.sleep(2000);
        aboutLink.click();
        Thread.sleep(2000);
    }
    public void Success() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        Thread.sleep(1000);

        WebElement payers = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payers.sendKeys("93595");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payees.sendKeys("93596");
        Thread.sleep(1000);
        WebElement amount = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amount.sendKeys("1000");
        Thread.sleep(1000);
        WebElement description = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        description.sendKeys("giao dịch");
        Thread.sleep(2000);
        aboutLink.click();
        Thread.sleep(10000);
    }
    public void Reset() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[2]"));
        Thread.sleep(1000);

        WebElement payers = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payers.sendKeys("93595");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payees.sendKeys("93596");
        Thread.sleep(1000);
        WebElement amount = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amount.sendKeys("1000");
        Thread.sleep(1000);
        WebElement description = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        description.sendKeys("giao dịch");
        Thread.sleep(2000);
        aboutLink.click();
        Thread.sleep(2000);
    }
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\ANONYMOUS\\Downloads\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/index.php");
        FundTransfer test1 = new FundTransfer();
        String request ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập testcase bạn muốn chạy ");
        request =sc.next();
        switch(request) {
            case "InputBlank":
                test1.InputBlank();
                break;
            case "Reset":
                // code block
                test1.Reset();
                break;
            case "Invalid":
                test1.Invalid();
                break;
            case "NoExist":
                test1.Login();
                driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");
                test1.NoExist();
                break;
            case "Amount":test1.Login();
                driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");
                test1.Amount();
                break;
            case "Success":
                test1.Login();
                driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");
                test1.Success();
                break;
            default:
                System.out.println("Câu lệnh chưa đúng vui lòng nhập lại");
        }
//        driver.quit();
    }

}
