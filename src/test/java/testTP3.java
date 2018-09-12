import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testTP3 {

    WebDriver driver ;

    @Before
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.fr");
        //on ouvre le navigateur en grand
        driver.manage().window().maximize();
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

    @Test
    public void test1()
    {
        HomePage homePage = new HomePage();
        homePage.recherche("Bordeaux");

        ResultPage resultPage = new ResultPage();

        Assert.assertThat(resultPage.getResult(0), is ("Site officiel de la ville de Bordeaux | Bordeaux"));
    }
}
