package com.lambdatest.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    /*public WebDriver driver;

    @BeforeTest
    public void setDriver(){

        System.setProperty("webdriver.chrome.driver",
                "C://Users//Sri Priya P Kulkarni//Softwares//Selenium//chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @AfterTest
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(30, TimeUnit.SECONDS);
        this.driver.quit();
    }*/

    public String username = "sripriyapkulkarni";
    public String accesskey = "0JtfDYxpML64zCQoyNfb9RBRkZSry5Q1LZ6LXPrJxbVJmVjx4M";

    public static RemoteWebDriver driver;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;

    @BeforeSuite
    public void setUp() throws Exception {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("117.0");
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", "sripriyapkulkarni");
        ltOptions.put("accessKey", "0JtfDYxpML64zCQoyNfb9RBRkZSry5Q1LZ6LXPrJxbVJmVjx4M");
        ltOptions.put("project", "Untitled");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        browserOptions.setCapability("LT:Options", ltOptions);
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), browserOptions);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterSuite
    public void tearDown() throws Exception {
        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
        }
    }

}
