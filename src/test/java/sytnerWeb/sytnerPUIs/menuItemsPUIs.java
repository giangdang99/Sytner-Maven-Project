package sytnerWeb.sytnerPUIs;

public class menuItemsPUIs {
    public static final String TEXTBOX_LOGIN = "xpath=//input[@name='%s']";
    public static final String LOGIN_BUTTON = "xpath=//button[@type='submit']";
    public static final String SHOW_ME_TEXT = "xpath=//div[contains(text(), 'Show me')]";
    public static final String TOTAL_VEHICLE = "xpath=//div[contains(@class, 'mb-3')]//h2[text()]";
    public static final String BID_BUTTON_OF_LISTING = "xpath=(//div//button[@type='button']//div[contains(normalize-space(),'Bid +$100')])[%s]";
    public static final String CONFIRM_MODEL = "xpath=//div[normalize-space()='Confirm']";
    public 	static final String TEXT_OF_BANNER = "xpath=(//div//button[@type='button']//div[contains(normalize-space(),'Bid +$100')])[%s]/ancestor::div[1]/ancestor::div[1]/preceding-sibling::div//span[text()]";

    public static final String VIEW_DETAILS_BUTTON = "xpath=(//span[contains(text(),'Bid and view details')])[%s]";
    public static final String BID_BTN_OF_DETAIL = "xpath=(//button[contains(@type,'button') and contains(normalize-space(.),'Bid +$100')])[2]";
    public static final String TEXT_OF_CONFIRM_MODEL = "xpath=//h3[normalize-space()='Very exciting!']";
    public static final String TEXT_OF_BANNER_DETAILS = "xpath=//div[contains(@class,'md:border md:pb-5 font-inter hidden md:block')]//span[contains(@class,'ml-1 line-clamp-1 text-xs')][text()]";
}
