import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage {

    WebDriver driver;

    @FindBy(css = ".rc>.r>a")
    List<WebElement> listResults;

    //constructeur
    public ResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    //dans la page de résultat de recherche, on ira chercher des résultats de la recherche !
    public String getResult (int index)
    {
        return listResults.get(index).getText();
    }
}
