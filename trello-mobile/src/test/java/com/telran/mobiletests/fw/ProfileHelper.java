package com.telran.mobiletests.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class ProfileHelper extends BaseHelper {

    public ProfileHelper(AppiumDriver driver) {
        super(driver);
    }
    public void moveToImage() {
        WebElement webElement = driver.findElement(By.xpath("//div[@class='rsiNque2CCqtPE']"));
        new Actions(driver).moveToElement(webElement).click().perform();
    }

    public void attachPhotoToProfile(File file) throws InterruptedException {
        attach(By.xpath("//*[@name='file']"), file);
    }
    public void clickOnProfileAndVisibilityOnHeader() {
        click(By.cssSelector("[data-test-id='header-member-menu-profile']"));
    }
}