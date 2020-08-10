package runnerTest.webPages;

import cucumber.api.java.gl.E;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.BasePage;
import utils.ElementUtil;

import java.util.ArrayList;
import java.util.List;

public class DarkSkyHomePage extends ElementUtil {
    public SoftAssert softAssert = new SoftAssert();
//    ElementUtil elementUtil;

    By todayBtn  =  By.xpath("//span[contains(text(),'Today')]");
    By temp =By.xpath("//div[@id='timeline']//div[@class='temps']//span");
    By hours=By.xpath("//div//span [contains(@class,'am') or contains(@class,'pm')]");
    By temps=By.cssSelector("span[style^=opacity]");

    By minTemp = By.xpath("//span[@class='minTemp'][1]");
    By maxTemp = By.xpath("//span[@class='maxTemp'][1]");
    By minTempActual = By.xpath("//span[@class='temp'][1]");
    By maxTempActual = By.xpath("//span[@class='lowTemp swap']//span[1]");

  public void expandToday(){
      ElementUtil.clickElementByJS(todayBtn);

  }
    public Integer getLowestDisTemp(){
        Integer lowestDisplay=null;
        String lowtext=getTextFromElement(By.className("low-temp-text"));
                //ElementUtil.getTextFromElement(By.className("low-temp-text"));
        lowestDisplay = (Integer.parseInt(lowtext.replaceAll("[^\\d.]", "")));
        return lowestDisplay;
    }

    public Integer getHighestDisTemp(){
        Integer highestDisplay=null;
        String hightext= getTextFromElement(By.className("high-temp-text"));
        highestDisplay = (Integer.parseInt(hightext.replaceAll("[^\\d.]", "")));
        return highestDisplay;
    }
    public Integer gettingLowestTemp() {

        List<WebElement> tempList= BasePage.get().findElements(temp);
        ArrayList<Integer> tempInt= new ArrayList<Integer>();

        for (int i = 0; i < tempList.size(); i++) {
            String tempText= tempList.get(i).getText();

            tempInt.add(Integer.parseInt(tempText.replaceAll("[^\\d.]", "")));
            System.out.println("Temperature is: " +tempInt.get(i));

        }
        Integer[] array = tempInt.toArray(new Integer[0]);
        int lowest = array[0];
        for(int x : array ){
            if (x < lowest) {
                lowest = x;
            }}System.out.println("Lowest temperature is: " + lowest);
        return lowest;
  }


    public Integer gettingHighestTemp() {

        List<WebElement> tempList= BasePage.get().findElements(temp);
        ArrayList<Integer> tempInt= new ArrayList<Integer>();

        for (int i = 0; i < tempList.size(); i++) {
            String tempText= tempList.get(i).getText();

            tempInt.add(Integer.parseInt(tempText.replaceAll("[^\\d.]", "")));
//            System.out.println("Temperature is: " +tempInt.get(i));

        }
        Integer[] array = tempInt.toArray(new Integer[0]);
        int highest=array[0];
        int i;

        for (i = 1; i < array.length; i++)
            if (array[i] > highest)
                highest = array[i];
        System.out.println("Highest temperature is: " +highest);

        return highest;
    }

}
