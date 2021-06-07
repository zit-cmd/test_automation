package newaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

    public static WebDriver driver;

    public void login() throws InterruptedException{
        WebElement payers = driver.findElement(By.name("uid"));
        payers.sendKeys("mngr332026");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.name("password"));
        payees.sendKeys("musErun");
        Thread.sleep(1000);
        WebElement login_button = driver.findElement(By.name("btnLogin"));
        login_button.click();
        Thread.sleep(2000);
    }
    public void test2(String uid, String accounttype,String inidep) throws InterruptedException{
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys(uid);

        WebElement type = driver.findElement(By.name("selaccount"));
        Select select = new Select(type);
        select.selectByVisibleText(accounttype);

        WebElement inideposit = driver.findElement(By.name("inideposit"));
        inideposit.sendKeys(inidep);
        Thread.sleep(2000);
        WebElement button2 = driver.findElement(By.name("button2"));
        button2.click();

    }
    public void reset(){
        WebElement reset_button = driver.findElement(By.name("reset"));
        reset_button.click();
    }

    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            //Mo trang web
            driver.get("http://www.demo.guru99.com/V4/index.php");


            driver.manage().window().maximize();

            System.out.println(driver.getTitle());
            NewAccount newaccount = new NewAccount();

            newaccount.login();
            driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
            newaccount.test2("", "Current","");
            Thread.sleep(2000);


            driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
            newaccount.test2("50084", "Current","");

            Thread.sleep(2000);
            driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
            newaccount.test2("500ab","Savings","20000");
            driver.switchTo().alert().accept();
            newaccount.reset();
            Thread.sleep(5000);
            driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
            newaccount.test2("50084","Savings","abc");
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
            newaccount.reset();
            Thread.sleep(5000);
            driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
            newaccount.test2("50084","Savings","20000");
            Thread.sleep(5000);
            driver.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
