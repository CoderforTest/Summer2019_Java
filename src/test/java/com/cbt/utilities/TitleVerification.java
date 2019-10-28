package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        // 2.
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        // 3.
       WebDriver driver = BrowserFactory.getDriver("chrome");

       // 4.
       driver.get("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        String CurrentURL1 = driver.getCurrentUrl();

       driver.get("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        String CurrentURL2 = driver.getCurrentUrl();

       driver.get("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        String CurrentURL3 = driver.getCurrentUrl();

        if(title1.equals(title2) && title2.equals(title3)){
            System.out.println("TEST CASE1: ALL WEBSITES' TITLES EQUAL?  ==> PASS");
        }else{
            System.out.println("TEST CASE1: ALL WEBSITES' TITLES EQUAL?  ==> FAIL");
        }

        // 5.
        if (CurrentURL1.startsWith("http://practice.cybertekschool.com") && CurrentURL2.startsWith("http://practice.cybertekschool.com") && CurrentURL3.startsWith("http://practice.cybertekschool.com")){
            System.out.println("TEST CASE2: ALL WEBSITES' URLS EQUAL?  ==> PASS");
        }else{
            System.out.println("TEST CASE2: ALL WEBSITES' URLS EQUAL?  ==> FAIL");
        }
        driver.quit();

/*
Tests: Title and URLtest1.Create a new class TitleVerification under utilitiespackageand create a main method.
2.Add this ArrayList declaration to the main method: List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
3.Open chrome browser
4.Visit all the websitesfrom step 3 and verify that they all have the same title.
5.Verify that all URLsof all pages start with http://practice.cybertekschool.com.
6.Close the browser at the end of the test.
 */

    }
}
