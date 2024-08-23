package sytnerWeb.sytnerPO;

import commons.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import sytnerWeb.sytnerPUIs.menuItemsPUIs;


public class menuItemsPO extends BasePage {
    private WebDriver driver;

    public menuItemsPO(WebDriver driver) {
        this.driver = driver;
    }


    @Step("Input to textbox - {0} {1}")
    public void inputToText(String field, String value) {
        waitForElementVisible(driver, menuItemsPUIs.TEXTBOX_LOGIN, field);
        sendkeyToElement(driver, menuItemsPUIs.TEXTBOX_LOGIN, value, field);
    }

    @Step("click to Log In buttton")
    public void clickToLogInButton() {
        waitForElementClickable(driver, menuItemsPUIs.LOGIN_BUTTON);
        clickToElement(driver, menuItemsPUIs.LOGIN_BUTTON);
    }

    @Step("Login Account {0} {1}")
    public void loginAccount(String email, String password) {
        inputToText("email", email);
        inputToText("password", password);
    }


    @Step("Verify text Show Me of Listing screen")
    public boolean isShowMeDisplayed() {
        waitForElementVisible(driver, menuItemsPUIs.SHOW_ME_TEXT);
        return isElementDisplayed(driver, menuItemsPUIs.SHOW_ME_TEXT);
    }

    @Step("get text of Alert")
    public String getTextOfTotalVehicle() {
        waitForElementVisible(driver, menuItemsPUIs.TOTAL_VEHICLE);
        return getElementText(driver, menuItemsPUIs.TOTAL_VEHICLE);
    }

    @Step("Verify text Show Me of Listing screen")
    public boolean isTextOfTotalVehicleDisplayed() {
        waitForElementVisible(driver, menuItemsPUIs.TOTAL_VEHICLE);
        return isElementDisplayed(driver, menuItemsPUIs.TOTAL_VEHICLE);
    }

    @Step("click to Bid buttton of Vehicle {0}")
    public void clickToBidBtnOfListing(String numberVehicle) {
        waitForElementClickable(driver, menuItemsPUIs.BID_BUTTON_OF_LISTING, numberVehicle);
        clickToElement(driver, menuItemsPUIs.BID_BUTTON_OF_LISTING, numberVehicle);
    }

    @Step("Verify Popup is displayed")
    public boolean isPopupDisplayed() {
        waitForElementVisible(driver, menuItemsPUIs.CONFIRM_MODEL);
        return isElementDisplayed(driver, menuItemsPUIs.CONFIRM_MODEL);
    }


    @Step("click to confirm modal")
    public void clickToConfirmBtn() {
        waitForElementClickable(driver, menuItemsPUIs.CONFIRM_MODEL);
        clickToElement(driver, menuItemsPUIs.CONFIRM_MODEL);
    }

    @Step("Text of Banner {0}")
    public String getTextBannerVehicle(String numberVehicle) {
        waitForElementVisible(driver, menuItemsPUIs.TEXT_OF_BANNER, numberVehicle);
        return getElementText(driver, menuItemsPUIs.TEXT_OF_BANNER, numberVehicle);
    }

    @Step("Alert present")
    public boolean isAlertPresent() {
        return isAlertPresent(driver);
    }

    @Step("Wait for Alert presence")
    public Alert waitForAlertPresence() {
        return waitForAlertPresence(driver);
    }


    @Step("Get text of Alert")
    public String getTextOfAlert() {
        waitForAlertPresence(driver);
        return getAlertText(driver);
    }

    @Step("Alert - accept alert")
    public void acceptAlert() {
        acceptAlert(driver);
    }

    @Step("click to View vehicle detail button")
    public void clickToViewVehicleDetailBtn(String vehicle) {
        waitForElementClickable(driver, menuItemsPUIs.VIEW_DETAILS_BUTTON, vehicle);
        clickToElement(driver, menuItemsPUIs.VIEW_DETAILS_BUTTON, vehicle);
    }

    @Step("Verify View vehicle detail button is displayed")
    public boolean isViewVehicleDetailBtnDisplayed(String vehicle) {
        waitForElementVisible(driver, menuItemsPUIs.VIEW_DETAILS_BUTTON, vehicle);
        return isElementDisplayed(driver, menuItemsPUIs.VIEW_DETAILS_BUTTON, vehicle);
    }

    @Step("click to Bid button of Vehicle Detail")
    public void clickToBidBtnOfVehicleDetail() {
        waitForElementClickable(driver, menuItemsPUIs.BID_BTN_OF_DETAIL);
        clickToElement(driver, menuItemsPUIs.BID_BTN_OF_DETAIL);
    }

    @Step("Verify Confirm Model is displayed")
    public boolean isConfirmModelDisplayed() {
        waitForElementVisible(driver, menuItemsPUIs.TEXT_OF_CONFIRM_MODEL);
        return isElementDisplayed(driver, menuItemsPUIs.TEXT_OF_CONFIRM_MODEL);
    }

    @Step("Text of Banner on Vehicle Details {0}")
    public String getTextBannerVehicleDetails() {
        waitForElementVisible(driver, menuItemsPUIs.TEXT_OF_BANNER_DETAILS);
        return getElementText(driver, menuItemsPUIs.TEXT_OF_BANNER_DETAILS);
    }






}

