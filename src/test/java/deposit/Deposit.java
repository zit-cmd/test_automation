package deposit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Deposit {

    public static WebDriver driver;
    public void login() throws InterruptedException{
        //driver.manage().window().maximize();
        System.out.println(driver.getTitle());
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
    public void deposit(String acc,String amou,String de) throws InterruptedException {
        WebElement acno = driver.findElement(By.name("accountno"));
        acno.sendKeys(acc);
        Thread.sleep(1000);

        WebElement amount = driver.findElement(By.name("ammount"));
        amount.sendKeys(amou);
        Thread.sleep(1000);

        WebElement des = driver.findElement(By.name("desc"));
        des.sendKeys(de);
        Thread.sleep(1000);
    }
    public void submit(){
        WebElement submit_button = driver.findElement(By.name("AccSubmit"));
        submit_button.click();
    }
    public void reset(){
        WebElement reset_button = driver.findElement(By.name("res"));
        reset_button.click();
    }

    public static void main(String[] args){
        try {
//            System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
            Deposit test = new Deposit();

            System.out.println("Moi chon test case");
            System.out.println("1: Verify User is Deposit with value VALID all fields");
            System.out.println("2: Verify User is NOT able to deposit with INCORRECT Account No and Amount");
            System.out.println("3: Verify User is NOT able to deposit with INCORRECT Account No");
            System.out.println("4: Verify User is NOT able to submit not success if data input amount greater than account ");
            System.out.println("5: Verify User is NOT able to deposit with all fields BLANK");
            System.out.println("6: Check RESET button work with value in all fields");
            System.out.println("7: Check RESET button NOT work with all fields BLANK");
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.print("Moi nhap testcase: ");
            number = sc.nextInt();
            switch (number){
                case 1:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    test.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                    test.deposit("93594","50000","saocxdc");
                    test.submit();
                    driver.quit();
                    break;
                case 2:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    test.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                    test.deposit("0400000","11111111","saocxdc");
                    test.submit();
                    break;
                case 3:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    test.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                    test.deposit("04000000","50000","saocxdc");
                    test.submit();
                    break;
                case 4:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    test.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                    test.deposit("93594","999999","saocxdc");
                    test.submit();

                    break;
                case 5:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    test.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                    test.deposit("","50000","saocxdc");
                    test.submit();
                    break;
                case 6:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    test.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                    test.deposit("93594","50000","saocxdc");
                    //Thread.sleep(5000);
                    //driver.switchTo().alert().accept();
                    test.reset();
                    break;
                case 7:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    test.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                    test.deposit("","","");
                    //Thread.sleep(5000);
                    //driver.switchTo().alert().accept();
                    test.reset();
                    break;

                default:
                    break;
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
