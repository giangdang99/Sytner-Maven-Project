package sytnerWeb.sytner;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import sytnerWeb.sytnerPO.menuItemsPO;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Homepage_001_MenuItems extends BaseTest {
    private menuItemsPO loginPage;
    private String totalVehicles;


    public Homepage_001_MenuItems(String browser, String server) {
        driver = getBrowserDriver(browser, server);
        loginPage = new menuItemsPO(driver);
    }

    @Description("TC_01: Login account")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void TC_01_Login_Account() {
        System.out.println("Login account is ");
        System.out.println("Click to Login Btn");
        loginPage.clickToLogInButton();
        assertTrue(loginPage.isShowMeDisplayed(), "Text Show me is displayed");
    }

    @Description("TC_02: Bid Vehicles on Listing")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void TC_02_Bid_Vehicles_On_Listing_Page() {


    }

    @Description("TC_03: Bid Vehicles on Details Page")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void TC_03_Bid_Vehicles_On_Details_Page() {


    }

    @AfterClass
    public void afterClass() {
        closeBrowserDriver();
    }
}

