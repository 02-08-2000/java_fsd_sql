package BATCH3.Selenium;

/**
 * Hello world!
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 public class App{
    	   public static void main(String[] args) {
    	      WebDriver driver = new ChromeDriver();
    	      String url = " https://www.tutorialspoint.com/questions/index.php";
    	      driver.get(url);
    	   }
    	}
    

