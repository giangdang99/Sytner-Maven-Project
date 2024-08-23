package browserFactory;

public class BrowserNotSupportedException extends IllegalStateException {
    private static final Long serialVersionUID = 3540548682203339240L;
    public BrowserNotSupportedException(String browser) {

        super(String.format("Browser not supported: %s", browser));
    }
}
