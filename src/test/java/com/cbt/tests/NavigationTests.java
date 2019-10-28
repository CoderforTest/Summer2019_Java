package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {

        Chrome();
        Firefox();
        Edge();
    }
    public static void Chrome () {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");

        String title1 = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();

        String title3 = driver.getTitle();

        String result = StringUtility.verifyEquals(title1, title3);
        System.out.println("Chrome " + result);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        String result2 = StringUtility.verifyEquals(title2, title4);
        System.out.println("Chrome " + result2);

        driver.quit();
    }

    public static void Firefox () throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");

        Thread.sleep(5000);

        String title1 = driver.getTitle();
        driver.get("https://etsy.com");
        Thread.sleep(5000);
        String title2 = driver.getTitle();

        driver.navigate().back();
        Thread.sleep(5000);

        String title3 = driver.getTitle();

        String result = StringUtility.verifyEquals(title1, title3);
        System.out.println("Firefox" + result);

        driver.navigate().forward();
        Thread.sleep(5000);
        String title4 = driver.getTitle();

        String result2 = StringUtility.verifyEquals(title2, title4);
        System.out.println("Firefox" + result2);

        driver.quit();
    }

    public static void Edge () {

        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");

        String title1 = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();

        String title3 = driver.getTitle();

        String result = StringUtility.verifyEquals(title1, title3);
        System.out.println("Edge " + result);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        String result2 = StringUtility.verifyEquals(title2, title4);
        System.out.println("Edge " + result2);

        driver.quit();
    }



        /*
        Open browser
2.
Go to website
https://google.com
3.
Save the title in a string variable
4.
Go to
https://etsy.com
5.
Save the title in a string
variable
6.
Navigate back to previous page
7.
Verify that title is same is in step 3
8.
Navigate forward to previous page
9.
Verify that title is same is in step 5




         */


        }
