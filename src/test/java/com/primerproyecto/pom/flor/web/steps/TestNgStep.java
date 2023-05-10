package com.primerproyecto.pom.flor.web.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestNgStep  {


    private WebDriver webdriver;



    //Selenium Web Driver And testNG
    //Simulando la apertura y comparando el resultados esperados con Assert.assertEqual de testNG
    @org.testng.annotations.Test(priority = 1, description = "Open the web page and validate title---/")
    public void tearDown(){


        System.out.println("Using testNG");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        webdriver = new ChromeDriver(options);
        webdriver.get("https://book.perurail.com/"); //Metodo que navega en la web indicada


        //Thread.sleep(4000);



        org.testng.Assert.assertEquals(webdriver.getTitle(), "PERURAIL - ¡Machu Picchu te espera!");


    }

}
