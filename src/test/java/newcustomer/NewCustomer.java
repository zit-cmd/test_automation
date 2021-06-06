package newcustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class NewCustomer {

    private final WebDriver driver = new ChromeDriver();

    public void logIn() {
        driver.get("http://www.demo.guru99.com/V4/");
        WebElement userName = driver.findElement(By.name("uid"));
        userName.sendKeys("mngr331896");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("EgEgEtU");
        System.out.println("Name attribute of username button: " + userName.getAttribute("name"));
        driver.findElement(By.name("btnLogin")).click();
//        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
    }
    //  nameGender value : male, female
    public void addNewCustomer(String name, String nameGender, String dateBirth, String adrCus, String cityCus, String stateCus, String pinCus,
                               String mobile, String emailCus, String pass) {
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
        WebElement cusName = driver.findElement(By.name("name"));
        cusName.sendKeys(name);
        if(nameGender.equals("male")) {
            driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
        } else {
            driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
        }
//        date
        WebElement date = driver.findElement(By.name("dob"));
        date.sendKeys(dateBirth);
//        Address
        WebElement address = driver.findElement(By.name("addr"));
        address.sendKeys(adrCus);
//        City
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys(cityCus);
//        State
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys(stateCus);
//        PIN
        WebElement pinno = driver.findElement(By.name("pinno"));
        pinno.sendKeys(pinCus);
//        Mobile
        WebElement telephoneno = driver.findElement(By.name("telephoneno"));
        telephoneno.sendKeys(mobile);
//        Email
        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys(emailCus);
//        Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(pass);

        driver.findElement(By.name("sub")).click();
    }

    public void resetValue(String name, String nameGender, String dateBirth, String adrCus, String cityCus, String stateCus, String pinCus,
                               String mobile, String emailCus, String pass) {
        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
        WebElement cusName = driver.findElement(By.name("name"));
        cusName.sendKeys(name);
        if(nameGender.equals("male")) {
            driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
        } else {
            driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
        }
//        date
        WebElement date = driver.findElement(By.name("dob"));
        date.sendKeys(dateBirth);
//        Address
        WebElement address = driver.findElement(By.name("addr"));
        address.sendKeys(adrCus);
//        City
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys(cityCus);
//        State
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys(stateCus);
//        PIN
        WebElement pinno = driver.findElement(By.name("pinno"));
        pinno.sendKeys(pinCus);
//        Mobile
        WebElement telephoneno = driver.findElement(By.name("telephoneno"));
        telephoneno.sendKeys(mobile);
//        Email
        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys(emailCus);
//        Password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(pass);

        driver.findElement(By.name("res")).click();
    }

    public void TC_008() {
        /*
         Customer Name: viet
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang, Viet Nam
         City: Da Nang
         State: California
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456
        */
        String name = "viet";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_009() {
         /*
         "Customer Name: 123
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Da Nang
         State: California
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "123";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_010() {
         /*
         "Customer Name: viet
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Đà Nẵng 123
         State: California
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "viet";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Đà Nẵng 123";
        String state = "California";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_011() {
         /*
         "Customer Name: viet
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang, Viet Nam
         City: Da Nang
         State: Trường Sơn45
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"

        */
        String name = "viet";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "Trường Sơn45";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_012() {
         /*
         "Customer Name: viet
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang, Viet Nam
         City: Da Nang
         State: California
         PIN: abcxyz
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "viet";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "abcxyz";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_013() {
         /*
         "Customer Name: 123
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Da Nang
         State: California
         PIN: 1234
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "123";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "1234";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_014() {
         /*
         "Customer Name: viet
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Da Nang
         State: California
         PIN: 123456
         Mobile Number: aaaaabbbccc
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "viet";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "123456";
        String mobi = "aaaaabbbccc";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_015() {
         /*
         "Customer Name: 123
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Da Nang
         State: California
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvvietgmail.com
         Password: 123456"
        */
        String name = "viet";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvvietgmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_016() {
         /*
         "Customer Name: nguyen van viet
         Gender: Male
         Date of Birth: 21/2/1999
         Address: Sai Gon Viet Nam
         City: Sai Gon
         State: California
         PIN: 987654
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 987654"
        */
        String name = "nguyen van viet";
        String gender = "male";
        String date = "2121999";
        String adr = "Sai Gon Viet Nam";
        String city = "Sai Gon";
        String state = "California";
        String pin = "987654";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "987654";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_017() {
        String name = "";
        String gender = "";
        String date = "";
        String adr = "";
        String city = "";
        String state = "";
        String pin = "";
        String mobi = "";
        String email = "";
        String pass = "";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_018() {
         /*
         "Customer Name:
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Da Nang
         State: California
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_019() {
         /*
         "Customer Name: viet@
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Da Nang
         State: California
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "viet@";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        addNewCustomer(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_020() {
         /*
         "Customer Name: viet
         Gender: Male
         Date of Birth: 31/3/2000
         Address: Da Nang Viet Nam
         City: Da Nang
         State: California
         PIN: 123456
         Mobile Number: 0999999999
         Email: nvviet@gmail.com
         Password: 123456"
        */
        String name = "viet";
        String gender = "male";
        String date = "3132000";
        String adr = "Da Nang Viet Nam";
        String city = "Da Nang";
        String state = "California";
        String pin = "123456";
        String mobi = "0999999999";
        String email = "nvviet@gmail.com";
        String pass = "123456";
        resetValue(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public void TC_021() {
        String name = "";
        String gender = "";
        String date = "";
        String adr = "";
        String city = "";
        String state = "";
        String pin = "";
        String mobi = "";
        String email = "";
        String pass = "";
        resetValue(name, gender, date, adr, city, state, pin, mobi, email, pass);
    }

    public static void main(String[] args) {
        NewCustomer test = new NewCustomer();
        test.logIn();
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JButton btn008 = new JButton("TC_008");
        frame.getContentPane().add(btn008);
        JButton btn009 = new JButton("TC_009");
        frame.getContentPane().add(btn009);
        JButton btn010 = new JButton("TC_010");
        frame.getContentPane().add(btn010);
        JButton btn011 = new JButton("TC_011");
        frame.getContentPane().add(btn011);
        JButton btn012 = new JButton("TC_012");
        frame.getContentPane().add(btn012);
        JButton btn013 = new JButton("TC_013");
        frame.getContentPane().add(btn013);
        JButton btn014 = new JButton("TC_014");
        frame.getContentPane().add(btn014);
        JButton btn015 = new JButton("TC_015");
        frame.getContentPane().add(btn015);
        JButton btn016 = new JButton("TC_016");
        frame.getContentPane().add(btn016);
        JButton btn017 = new JButton("TC_017");
        frame.getContentPane().add(btn017);
        JButton btn018 = new JButton("TC_018");
        frame.getContentPane().add(btn018);
        JButton btn019 = new JButton("TC_019");
        frame.getContentPane().add(btn019);
        JButton btn020 = new JButton("TC_020");
        frame.getContentPane().add(btn020);
        JButton btn021 = new JButton("TC_021");
        frame.getContentPane().add(btn021);

        btn008.addActionListener(e -> test.TC_008());
        btn009.addActionListener(e -> test.TC_009());
        btn010.addActionListener(e -> test.TC_010());
        btn011.addActionListener(e -> test.TC_011());
        btn012.addActionListener(e -> test.TC_012());
        btn013.addActionListener(e -> test.TC_013());
        btn014.addActionListener(e -> test.TC_014());
        btn015.addActionListener(e -> test.TC_015());
        btn016.addActionListener(e -> test.TC_016());
        btn017.addActionListener(e -> test.TC_017());
        btn018.addActionListener(e -> test.TC_018());
        btn019.addActionListener(e -> test.TC_019());
        btn020.addActionListener(e -> test.TC_020());
        btn021.addActionListener(e -> test.TC_021());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
