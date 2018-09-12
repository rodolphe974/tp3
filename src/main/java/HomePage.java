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

    //constructeur
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //une methode pour utiliser la champ recherche de la page home
    public void recherche (String text)
    {

    }
}
