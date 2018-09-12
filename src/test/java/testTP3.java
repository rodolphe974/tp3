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
    public void testEnter()
    {
        //Arrange
        String expectedResult = "Site officiel de la ville de Bordeaux | Bordeaux";

        //Act
        HomePage homePage = new HomePage(driver);
        //rechercheEnter me retourne la page de resultat...
        ResultPage resultsPage = homePage.rechercheEnter("Bordeaux");
        String result = resultsPage.getResult(0);

        //Assert
        Assert.assertThat(result, is(expectedResult));
    }

    @Test
    public void testClickRollMenu()
    {
        HomePage homePage = new HomePage(driver);
        ResultPage resultsPage = homePage.rechercheClick1("Bordeaux");

        //ici on va comparer avec le 2ème résultat de la page
        Assert.assertThat(resultsPage.getResult(1), is ("Bordeaux — Wikipédia"));
    }
    @Test
    public void testClick()
    {
        //sur ma page accueil
        HomePage homePage = new HomePage(driver);
        ResultPage resultsPage = homePage.rechercheClick2("Bordeaux");

        //on va comparer avec le 7eme résultat de la page de recheche
        Assert.assertThat(resultsPage.getResult(6), is ("Bordeaux - Sud Ouest.fr"));
    }
}
