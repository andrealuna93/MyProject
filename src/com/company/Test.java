package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test {

    static WebDriver driver;

    public static void setUp(){
        //llamado al driver de Chrome
        driver = new ChromeDriver();
        //pagina a la cual se va a ingresar
        driver.navigate().to("https://co.hoteles.com/");
        // espera para realizar la carga de la pagina
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //comprobar carga de la pagina con el boton Sign in
        driver.findElement(By.id("header-sign-in"));
    }

    public static void signIn(){
        //seleccion de la opcion Sign In
        WebElement buttonsignIn = driver.findElement(By.id("header-sign-in"));
        buttonsignIn.click();
        //crear cuenta de nuevo usuario
    }

    public static void registro() {
        //seleccionar opcion de registro
        WebElement opcionRegistro = driver.findElement(By.xpath("//a[@href='/profile/signup.html']"));
        opcionRegistro.click();
    }
}
