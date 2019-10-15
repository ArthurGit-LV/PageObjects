
import com.beginningselenium.examples.pageobjects.AgeCalculatorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgeCalculatorScript {

    public static void main(String[] args)throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Arthur/Documents/Chromedriver/chromedriver.exe");
        checkAgeCalculator();
    }

    private static void checkAgeCalculator()throws  Exception{

        WebDriver driver = new ChromeDriver();
        //create an instance of AgeCalculatorPage class and open it

        AgeCalculatorPage ageCalculatorPage = new AgeCalculatorPage(driver);
        ageCalculatorPage.open();

        //start the test by means of the calculate method
        ageCalculatorPage.calculate("6", "October", "1979");


        //verify results

        if(ageCalculatorPage.getAge().equals("40")){
            System.out.println("Age was calculated correctly !");
        }
        else {
            System.out.println("There was an error in the age calculation");
        }
        if(ageCalculatorPage.getZodiacSign().equals("Libra")){
            System.out.println("Zodiac sign was calculated correctly !");
        }
        else {
            System.out.println("There was an error in the zodiac sign calculation");
        }
        ageCalculatorPage.close();
    }
}
