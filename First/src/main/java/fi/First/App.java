package fi.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://artoftesting.com/samplesiteforselenium");
        
        
        
        String text = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[1]/div/p/b")).getText();
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[1]/p[2]/input")).sendKeys(text);
        
        
//        driver.close();
    }
}
