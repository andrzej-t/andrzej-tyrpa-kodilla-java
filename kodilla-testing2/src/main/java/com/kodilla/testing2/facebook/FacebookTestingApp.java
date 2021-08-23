package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_COOKIES = "//div[contains(@class, \"_9o-r\")]/button[2]";
    public static final String XPATH_CREATE_ACCOUNT = "//div[contains(@class, \"_6luv _52jv\")]/form/div[5]";
    public static final String XPATH_DAY_SELECT = "//div[@id=\"birthday_wrapper\"]/div[2]/span/span/select[1]";
    public static final String XPATH_MONTH_SELECT = "//div[@id=\"birthday_wrapper\"]/div[2]/span/span/select[2]";
    public static final String XPATH_YEAR_SELECT = "//div[@id=\"birthday_wrapper\"]/div[2]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCookies = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        selectCookies.click();

        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);

        WebElement selectCreate = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));
        selectCreate.click();

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_DAY_SELECT)));
        Select selectMonth = new Select(driver.findElement(By.xpath(XPATH_MONTH_SELECT)));
        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_YEAR_SELECT)));

        while(!driver.findElement(By.xpath(XPATH_DAY_SELECT)).isDisplayed());
        selectDay.selectByValue("13");
        selectMonth.selectByVisibleText("gru");
        selectYear.selectByValue("1981");
    }
}
