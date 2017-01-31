package widgets;

import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$;

public class SearchMenu {

    public static String getTextValueFromItemOfTheMenuByID(String itemID){
        return $(itemID).getText();
    }

    public static void verifyCityInTheSearchMenu(String searchMenuItemID, String city){
        Assert.assertEquals((getTextValueFromItemOfTheMenuByID(searchMenuItemID)), city);
    }

}
