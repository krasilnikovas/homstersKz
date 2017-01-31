package widgets;


import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class ListOfOffers {

    public static int countOffersForRequestedCity(String city){
        List<SelenideElement> count = $(By.xpath("//*[@id='estate-list']")).findAll(By.xpath("//div[@class='posr']/span[contains(text(),'" + city + "')]"));
        return count.size();
    }

    public static void verifyAllOffersCorrespondSearchedCity(String city, int allOffersOnThePage){
        Assert.assertEquals(countOffersForRequestedCity(city),allOffersOnThePage);
    }


}
