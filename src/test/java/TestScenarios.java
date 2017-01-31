import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.Constans;
import widgets.ListOfOffers;
import widgets.SearchBarOnMainPage;
import widgets.SearchMenu;


public class TestScenarios {

    @BeforeClass
    public static void beforeClass(){
        System.setProperty("selenide.browser", "chrome");
        ChromeDriverManager.getInstance().setup();
    }
    @Test
    public void searchTest (){
        Selenide.open("https://homsters.kz/");
        SearchBarOnMainPage.setCity("Алматы");
        SearchBarOnMainPage.startSearch();

        SearchMenu.verifyCityInTheSearchMenu(Constans.CITYID_ITEM, "Алматы");
        ListOfOffers.verifyAllOffersCorrespondSearchedCity("Алматы", 20);

    }
}
