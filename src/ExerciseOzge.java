import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOzge {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chromedriver" , "/Users/ozanatc/IdeaProjects/initial_selenium_project_5");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("ozgcaglyn");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("Oo1998Oo!");
        Thread.sleep(3000);
        driver.findElement(By.className("_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm")).click();



    }
}
