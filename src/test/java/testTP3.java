import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;

public class testTP3 {

    WebDriver driver ;

    @Before
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.fr");
        //on ouvre le navigateur en grand
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

    @Test
    public void test1()
    {
        HomePage homePage = new HomePage(driver);
        homePage.recherche("Bordeaux");

        ResultPage resultsPage = new ResultPage();
        Assert.assertThat(resultsPage.getResult(0), is ("Site officiel de la ville de Bordeaux | Bordeaux"));
    }
}
