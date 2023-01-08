import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Ttitle_Validation {
    public static void main(String[] args) throws InterruptedException {

        /*
        Test Case

        Go to https://www.techglobalschool.com
Get current url and validate it
Get title and validate it

EXPECTED RESULT:
URL  = https://www.techglobalschool.com/
Title = SDET Bootcamp | TechGlobal

         */

        // 1. Set up

        System.setProperty("webdriver.chromedriver", "/Users/ozanatc/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // all the elements should be display

        //2. Validation

        driver.get("https://www.techglobalschool.com/"); // no caches

        if(driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if (driver.getCurrentUrl().equals("https://www.techglobalschool.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");
        driver.getCurrentUrl();
        Thread.sleep(2000);
      //  driver.navigate().to("https://www.techglobalschool.com/"); // keep caches
        driver.navigate().refresh();



        // 3. Teardown

        Thread.sleep(2000);
        driver.close(); // only close the tab quit shutdown the chrome
    }
}
