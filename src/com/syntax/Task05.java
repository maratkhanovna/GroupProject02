package com.syntax;

public class Task05 {
    public static void main(String[] args) {
        RemoteWebDriver[] browsers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for(RemoteWebDriver browser:browsers){
            browser.open();
            browser.close();
            browser.getTitle();
            browser.getScreenshot();
            browser.navigate();
        }
    }
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closes Chrome browser");
    }

    @Override
    public String getTitle() {
        return "New Tab";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Clicking on the three dots in the browser's top right corner");
    }

    @Override
    public void navigate() {
        System.out.println("Navigation bar: the Back, Forward, and Refresh buttons");
    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens FireFox browser");
    }

    @Override
    public void close() {
        System.out.println("Closes FireFox browser");
    }

    @Override
    public String getTitle() {
        return "New Tab";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Clicking on the three dots in the browser's top right corner");
    }

    @Override
    public void navigate() {
        System.out.println("Navigation bar: the Back, Forward, and Refresh buttons");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Closes Safari browser");
    }

    @Override
    public String getTitle() {
        return "Starting page";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Clicking on the three dots in the browser's top right corner");
    }

    @Override
    public void navigate() {
        System.out.println("Navigation bar: the Back and Forward buttons");
    }
}
