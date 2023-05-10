package com.primerproyecto.pom.flor.web.steps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class SunatStep {


    private WebDriver webdriver;

    private WebElement  webelement;



 //Silumacion de  abrir pagina en una nueva ventana
  @Before
  public  void AbrirPaginaEnOtraVentana(){

    System.setProperty("flor.webdriver.chrome.driver", "/src/test/recursos/chromedriver.exe" );
    ChromeOptions options= new ChromeOptions();

    options.addArguments("--remote-allow-origins=*");
    ;
    //options.addArguments("--headless"); ejecuta el scrip sin la interfaz

    webdriver = new ChromeDriver(options);

    //IR Pagina Home
    webdriver.get("https://www.transparencia.gob.pe/enlaces/pte_transparencia_enlaces.aspx?id_entidad=83&id_tema=1&ver=D#.ZEBZVHbMJD-"); //Metodo que navega en la web indicada

    //captura de enlace de la pagina que se abre en la otra pestana
    webelement =webdriver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div/div[2]/a/img"));

    webelement.click();


    // Creacion de un lista con las ventanas abiertas
    ArrayList listaventanas= new ArrayList(webdriver.getWindowHandles());


    //Nos movemos a la  ventana N~ 2 con webdriver(indices 0,1)

    webdriver.switchTo().window(listaventanas.get(1).toString());

    //Obtenemos la url de la 2 ventana y lo mostramos en consola
     System.out.println("La ventana numero 2 es " + webdriver.getCurrentUrl());








  }
    @Test
    public  void javaScript() {



        JavascriptExecutor js = (JavascriptExecutor)  webdriver;

        js.executeScript("alert ('prueba Selenium con JavaScript')");



    }


}
