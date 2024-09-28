package currenturl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url 
{
	public static void main(String[] args) {
		
	
    WebDriver driver = new ChromeDriver();

    // Navigate to Actitime homepage
    driver.get("https://online.actitime.com/sambhu/login.do");

    // Maximize the browser window
    driver.manage().window().maximize();

    // Get the title of the current page
    String actualTitle = driver.getTitle();
    String expectedTitle = "Expected Title of Actitime"; // Replace with the actual title

    // Validate the title
    if (actualTitle.equals(expectedTitle)) {
        System.out.println("Title validation passed!");
    } else {
        System.out.println("Title validation failed! Expected: " + expectedTitle + ", but got: " + actualTitle);
    }

    // Get the current URL of the page
    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://example.actitime.com"; // Replace with the actual URL

    // Validate the URL
    if (actualUrl.equals(expectedUrl)) {
        System.out.println("URL validation passed!");
    } else {
        System.out.println("URL validation failed! Expected: " + expectedUrl + ", but got: " + actualUrl);
    }

    // Close the browser
    driver.quit();
}
}


