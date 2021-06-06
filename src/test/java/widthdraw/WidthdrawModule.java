package widthdraw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class WidthdrawModule {

    private final WebDriver driver = new ChromeDriver();

    public void logIn() {
        driver.get("http://www.demo.guru99.com/V4/");
        WebElement userName = driver.findElement(By.name("uid"));
        userName.sendKeys("mngr331896");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("EgEgEtU");
        System.out.println("Name attribute of username button: " + userName.getAttribute("name"));
        driver.findElement(By.name("btnLogin")).click();
    }

    public void widthdraw(String idAccount, String amountAcc, String description) {
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
        WebElement accountNo = driver.findElement(By.name("accountno"));
        accountNo.sendKeys(idAccount);
        WebElement amount = driver.findElement(By.name("ammount"));
        amount.sendKeys(amountAcc);
        WebElement desc = driver.findElement(By.name("desc"));
        desc.sendKeys(idAccount);
        driver.findElement(By.name("AccSubmit")).click();
    }

    public void TC_036() {
        /*
        "Account No: 93540
        Amount: 10000
        Description: Rút tiền"
        **/
        String idAcc = "93540";
        String amount = "10000";
        String desc = "Rút tiền";
        widthdraw(idAcc, amount, desc);
    }

    public void TC_037() {
        /*
        "Account No: 930
        Amount: 10000
        Description: Rút tiền"
        **/
        String idAcc = "930";
        String amount = "10000";
        String desc = "Rút tiền";
        widthdraw(idAcc, amount, desc);
    }

    public void TC_038() {
        /*
        "Account No: 93540
        Amount: 3000000 (Amount > Current Amount)
        Description: Rút tiền"
        **/
        String idAcc = "93540";
        String amount = "3000000";
        String desc = "Rút tiền";
        widthdraw(idAcc, amount, desc);
    }

    public void TC_039() {
        /*
        "Account No: 93540
        Amount:
        Description: Rút tiền"
        **/
        String idAcc = "93540";
        String amount = "";
        String desc = "Rút tiền";
        widthdraw(idAcc, amount, desc);
    }

    public void resetWidthdraw(String idAccount, String amountAcc, String description) {
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
        WebElement accountNo = driver.findElement(By.name("accountno"));
        accountNo.sendKeys(idAccount);
        WebElement amount = driver.findElement(By.name("ammount"));
        amount.sendKeys(amountAcc);
        WebElement desc = driver.findElement(By.name("desc"));
        desc.sendKeys(idAccount);
        driver.findElement(By.name("res")).click();
    }

    public void TC_040() {
        /*
        "Account No: 93540
        Amount: 10000
        Description: Rút tiền"
        **/
        String idAcc = "93540";
        String amount = "10000";
        String desc = "Rút tiền";
        resetWidthdraw(idAcc, amount, desc);
    }

    public void TC_041() {
        String idAcc = "";
        String amount = "";
        String desc = "";
        resetWidthdraw(idAcc, amount, desc);
    }

    public static void main(String[] args) {
        WidthdrawModule test = new WidthdrawModule();
        test.logIn();
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JButton btn036 = new JButton("TC_036");
        frame.getContentPane().add(btn036);
        JButton btn037 = new JButton("TC_037");
        frame.getContentPane().add(btn037);
        JButton btn038 = new JButton("TC_038");
        frame.getContentPane().add(btn038);
        JButton btn039 = new JButton("TC_039");
        frame.getContentPane().add(btn039);
        JButton btn040 = new JButton("TC_040");
        frame.getContentPane().add(btn040);
        JButton btn041 = new JButton("TC_041");
        frame.getContentPane().add(btn041);

        btn036.addActionListener(e -> test.TC_036());
        btn037.addActionListener(e -> test.TC_037());
        btn038.addActionListener(e -> test.TC_038());
        btn039.addActionListener(e -> test.TC_039());
        btn040.addActionListener(e -> test.TC_040());
        btn041.addActionListener(e -> test.TC_041());

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
