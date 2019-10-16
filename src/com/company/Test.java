package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    static WebDriver driver;

    public static void setUp(){
        //llamado al driver de Chrome
        driver = new ChromeDriver();
        //pagina a la cual se va a ingresar
        driver.navigate().to("https://www.imdb.com/");
    }

    public static void signIn(){
        //seleccion de la opcion Sign In
    WebElement buttonsignIn = driver.findElement(By.id("imdb-signin-link"));
    buttonsignIn.click();

        //


    }


}
