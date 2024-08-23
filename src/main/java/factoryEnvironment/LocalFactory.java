package factoryEnvironment;

import org.openqa.selenium.WebDriver;

import browserFactory.BrowserList;
import browserFactory.BrowserNotSupportedException;
import browserFactory.ChromeDriverManager;
import browserFactory.FirefoxDriverManager;
import browserFactory.SafariDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocalFactory  implements EnvironmentFactory{
    public WebDriver driver;
    private String browserName;

    public LocalFactory(String browserName) {
        this.browserName = browserName;
    }

    public WebDriver createDriver() {
        BrowserList browser = BrowserList.valueOf(browserName.toUpperCase());
        switch (browser) {
            case FIREFOX :
                driver = new FirefoxDriverManager().getBrowserDriver();
                break;
            case CHROME :
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                driver = new ChromeDriverManager().getBrowserDriver();
                break;
            case SAFARI :
                driver = new SafariDriverManager().getBrowserDriver();
                break;
            default :
                throw new BrowserNotSupportedException(browserName);
        }
        return driver;
    }
}

