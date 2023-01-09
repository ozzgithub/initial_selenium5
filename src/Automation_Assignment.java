import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class Automation_Assignment {
    public static void main(String[] args) {


     try{
       WebDriver driver = Driver.getDriver();

       driver.get("https://www.facebook.com/");

        if (driver.getTitle().equals("Facebook - log in or sign up")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        Waiter.pause(2);

        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        Waiter.pause(2);

        WebElement logo = driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img']"));

        if (logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        Waiter.pause(2);

        WebElement heading2 = driver.findElement(By.className("_8eso"));
        System.out.println(heading2.isDisplayed());
        System.out.println(heading2.getText());

        if (heading2.isDisplayed()) System.out.println("Heading2 validation PASSED");
        else System.out.println("Heading2 validation FAILED");

        if(heading2.getText().equals("Connect with friends and the world around you on Facebook.")) System.out.println("Heading2 text validation PASSED");
        else System.out.println("Heading2 validation FAILED");

        Waiter.pause(2);

        WebElement emailorPhone =  driver.findElement(By.id("email"));

        if (emailorPhone.isDisplayed()) System.out.println("Email or phone number validation PASSED");
        else System.out.println("Email or phone number validation FAILED");


       WebElement password =  driver.findElement(By.id("pass"));
       if (password.isDisplayed()) System.out.println("Password input box validation PASSED");
       else System.out.println("Password input box validation FAILED");

       WebElement login = driver.findElement(By.name("login"));
        System.out.println(login.isDisplayed());
        System.out.println(login.isEnabled());

        if (login.isDisplayed()) System.out.println("Login button displayed PASSED");
        else System.out.println("Login button displayed FAILED");

        if (login.isEnabled()) System.out.println("Login button enabled PASSED");
        else System.out.println("Login button enabled FAILED");

        Waiter.pause(2);

       WebElement forgotPass = driver.findElement(By.linkText("Forgot password?"));

        System.out.println(forgotPass.isDisplayed());
        System.out.println(forgotPass.isEnabled());
        System.out.println(forgotPass.getText());

     if (forgotPass.isDisplayed()) System.out.println("Forgot password validation PASSED");
     else System.out.println("Forgot password validation FAILED");

     Waiter.pause(2);

     System.out.println(driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).isDisplayed() ?
             "\"Create New Account\" Button Validation PASSED" :
             "\"Create New Account\" Button Validation FAILED");


        Waiter.pause(2);

     } catch (Exception e) {
      System.out.println("TEST FAILED due to " + e.getMessage());
     } finally {

      Driver.quitDriver();


     }


    }










    }

