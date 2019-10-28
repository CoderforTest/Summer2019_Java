package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    // 1.
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
        driver.quit();
        System.out.println("==============================");

        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://wayfair.com/");
        String title2 = driver.getTitle();
        System.out.println(title2);
        title2 = title2.replace(" ","");
        String CurrentURL2 = driver.getCurrentUrl();
        System.out.println(CurrentURL2);
        driver.quit();
        System.out.println("==============================");

        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://walmart.com");
        String title3 = driver.getTitle();
        System.out.println(title3);
        title3 = title3.replace(" ","");
        String CurrentURL3 = driver.getCurrentUrl();
        System.out.println(CurrentURL3);
        driver.quit();
        System.out.println("==============================");

        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://westelm.com/");
        String title4 = driver.getTitle();
        System.out.println(title4);
        title4 = title4.replace(" ","");
        String CurrentURL4 = driver.getCurrentUrl();
        System.out.println(CurrentURL4);
        driver.quit();
        System.out.println("==============================");

        // Verify that URL of the website contains the title of the website.Ignore spaces and case in comparison.
        if (CurrentURL1.toLowerCase().contains(title1.trim().toLowerCase()) ){
            System.out.println("TEST CASE 4.1: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> PASS");
        }else{
            System.out.println("TEST CASE 4.1: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> FAIL");
        }

        if (CurrentURL2.toLowerCase().contains(title2.trim().toLowerCase()) ){
            System.out.println("TEST CASE 4.2: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> PASS");
        }else{
            System.out.println("TEST CASE 4.2: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> FAIL");
        }

        if (CurrentURL3.toLowerCase().contains(title3.trim().toLowerCase()) ){
            System.out.println("TEST CASE 4.3: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> PASS");
        }else{
            System.out.println("TEST CASE 4.3: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> FAIL");
        }

        if (CurrentURL4.toLowerCase().contains(title4.trim().toLowerCase()) ){
            System.out.println("TEST CASE 4.4: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> PASS");
        }else{
            System.out.println("TEST CASE 4.4: URL1 CONTAINS TITLE1? - OPEN&CLOSE NEW BROWSER FOR EACH SITE?  ==> FAIL");
        }

    }

}

/*
Tests: Title and URL test 3
1.Create a new class TitleVerification3under utilities package and create a main method.
2.Do the same test case as in the previous exercise, except this time open and close a new browser for each web site.
 */