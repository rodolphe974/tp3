import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "hplogo")
    WebElement logo;

    @FindBy(name="q")
    WebElement barreRecherche;

    @FindBy(css = ".lsb")
    // identique à  @FindBy(className = "lsb")
    WebElement boutonRecherche;

    @FindBy(name = "btnK")
    // identique à  @FindBy(className = "lsb")
    WebElement boutonRecherche2;

    //constructeur
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //une methode pour utiliser la champ recherche de la page home
    public void rechercheEnter (String text)
    {
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);
    }
    public void rechercheClick1 (String text)
    {
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ARROW_DOWN);
        boutonRecherche.click();
    }
    public void rechercheClick2 (String text)
    {
        barreRecherche.sendKeys(text);
        logo.click();
        boutonRecherche2.click();
    }
}
