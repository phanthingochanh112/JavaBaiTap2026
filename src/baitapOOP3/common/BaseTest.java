package baitapOOP3.common;
public class BaseTest {

    public void createDriver() {
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver() {
        closeDriver(Constants.browser);
    }

    public void closeDriver(String browserName) {
        System.out.println("Closed browser: " + browserName);
    }

}
