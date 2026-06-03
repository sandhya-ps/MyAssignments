package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CrateLeadFun {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driver = new ChromeDriver(opt);

        // load url

        driver.get("http://leaftaps.com/opentaps/control/main");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("DemoCSR");

        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // click crmsfa
        driver.findElement(By.partialLinkText("CRM")).click();

        // click on the leads
        driver.findElement(By.linkText("Leads")).click();

        // click create lead
        driver.findElement(By.linkText("Create Lead")).click();

        // enter company name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

        // enter first name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandhya");

        // enter last name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balakrishna");

        // dropdown
        // find the element
        WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));

        // create obj for select class
        Select options = new Select(dropdown);

        // selectbyvalue
        options.selectByValue("LEAD_CONFERENCE");

        // click create lead
        driver.findElement(By.className("smallSubmit")).click();

        String titlename = driver.getTitle();
        System.out.println("Title of the page is:" + " " + titlename);
    }

}
