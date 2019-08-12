package com.telran.tests.test;

import com.telran.tests.fw.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestChangeAvatar extends TestBase {
    @BeforeMethod (alwaysRun = true)
    public void preconditions() throws IOException {
        app.getProfileHelper().takeScreenShot();// take screenshot
    }
    @Test
    public void changeAvatarTest() throws Exception {

        app.getHeader().clickOnHeaderMemberMenuButton();
        app.getProfileHelper().clickOnProfileAndVisibilityOnHeader();
        app.getSession().pause(2000);
        app.getProfileHelper().moveToImage();
        app.getProfileHelper().attachPhotoToProfile(new File("src/test/resources/Zajka.jpg"));
        app.getHeader().clickOnHomeButtonOnHeader();
    }
    @AfterMethod (alwaysRun = true)
    public void afterMetod() throws IOException {
        app.getProfileHelper().takeScreenShot();// take screenshot
    }
}
