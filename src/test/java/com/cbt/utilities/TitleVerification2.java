package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        // 2.
        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");

        // 3.
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://www.luluandgeorgia.com");
        String title1 = driver.getTitle();
        System.out.println(title1);
        title1 = title1.replace(" ","");
        String CurrentURL1 = driver.getCurrentUrl();

        System.out.println(CurrentURL1);
        System.out.println("==============================");

        driver.get("https://wayfair.com/");
        String title2 = driver.getTitle();
        System.out.println(title2);
        title2 = title2.replace(" ","");
        String CurrentURL2 = driver.getCurrentUrl();
        System.out.println(CurrentURL2);
        System.out.println("==============================");

        driver.get("https://walmart.com");
        String title3 = driver.getTitle();
        System.out.println(title3);
        title3 = title3.replace(" ","");
        String CurrentURL3 = driver.getCurrentUrl();
        System.out.println(CurrentURL3);
        System.out.println("==============================");

        driver.get("https://westelm.com/");
        String title4 = driver.getTitle();
        System.out.println(title4);
        title4 = title4.replace(" ","");
        String CurrentURL4 = driver.getCurrentUrl();
        System.out.println(CurrentURL4);
        System.out.println("==============================");

        // 4. Verify that URL of the website contains the title of the website.Ignore spaces and case in comparison.
        title1= title1.replace(" ","");
        if (CurrentURL1.toLowerCase().contains(title1.toLowerCase()) ){
            System.out.println("TEST CASE 3.1: URL1 CONTAINS TITLE1?  ==> PASS");
        }else{
            System.out.println("TEST CASE 3.1: URL1 CONTAINS TITLE1?  ==> FAIL");
        }

        if (CurrentURL2.toLowerCase().contains(title2.toLowerCase()) ){
            System.out.println("TEST CASE 3.2: URL2 CONTAINS TITLE2?  ==> PASS");
        }else{
            System.out.println("TEST CASE 3.2: URL2 CONTAINS TITLE2?  ==> FAIL");
        }

        if (CurrentURL3.toLowerCase().contains(title3.toLowerCase()) ){
            System.out.println("TEST CASE 3.3: URL3 CONTAINS TITLE3?  ==> PASS");
        }else{
            System.out.println("TEST CASE 3.3: URL3 CONTAINS TITLE3?  ==> FAIL");
        }

        if (CurrentURL4.toLowerCase().contains(title4.toLowerCase()) ){
            System.out.println("TEST CASE 3.4: URL4 CONTAINS TITLE4?  ==> PASS");
        }else{
            System.out.println("TEST CASE 3.4: URL4 CONTAINS TITLE4?  ==> FAIL");
        }
        // 5.
        driver.quit();

/*
        Tests: Title and URLtest 2
        1.Create a new class TitleVerification2under utilities packageand create a main method.
        2.Add this ArrayList declaration to the main method: List<String> urls = Arrays.asList("https://lulugandgeorgia.com", "https://wayfair.com/", "https://walmart.com, "https://westelm.com/");
        3.Visit all websites one by one.
        4.Verify that URLof the website contains the title of the website.Ignore spaces and case in comparison.
        For example,title of in the first website title is Lulu and Giorgia and the URL is https://lulugandgeorgia.com.
        So, this test case must pass.
        5.Close the browser at the endof the test.
        */

    }

}