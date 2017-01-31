package widgets;


import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class SearchBarOnMainPage {

    public static void setCity (String cityNameRU){
        $("[id*=ExtendedSearchForm] [id*=CityType]").click();
        $(By.xpath("//li[text()='"+cityNameRU+"']")).click();
    }

    public static void startSearch (){
        $("[id*=ExtendedSearchForm] button[type=submit]").click();
    }
}
