package com.primerproyecto.pom.flor.web.steps;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class PeruRailStep {


    private WebDriver webdriver;
    private WebElement webElement;



    //Simulando abrir web y el uso de Assert.assertEquals de jUnit
    @BeforeEach
    public void setUp(){

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        webdriver = new ChromeDriver(options);
        webdriver.get("https://book.perurail.com/"); //Metodo que navega en la web indicada


        Assert.assertEquals( webdriver.getTitle(), "PERURAIL - ¡Machu Picchu te espera!");




    }







//Simulacion de seleccion de un select(origen del viaje)
    @Test
    public void seleccionoIdayVuelta(){


        try {

            Select Origen = new Select(webdriver.findElement(By.xpath("//*[@id=\"Filtros_Ida_Origen\"]")));

            Origen.selectByVisibleText("Ciudad de Cusco");



            Select destino = new Select(webdriver.findElement(By.xpath("//*[@id=\"Filtros_Ida_Destino\"]")));

            destino.selectByVisibleText("Arequipa");
            //thread to sleep for the specified number of milliseconds
            Thread.sleep(2000);



        } catch ( java.lang.InterruptedException ie) {
            System.out.println(ie);
        }

    }


    @Test
    public void cerrarmodal(){

        WebElement modal= webdriver.findElement(By.xpath("//*[@id=\"btnCerrarModal\"]"));
        modal.click();

    }




    //Simulacion seleccion de checkbox

    @Test
    public void SeleccionarCupon(){

     WebElement cupon=webdriver.findElement(By.xpath("//*[@id=\"frmBuscaTren\"]/div/div[2]/div/div[1]/div/div[9]/div/label"));

        //performing click operation if element is not checked
        if(!cupon.isSelected()) {
            cupon.click();
        }



    }



    //Simulacion de ingreso de datos y s captura de imagen con Apache commons IO
    //Para utilizar Apache commons IO descargamos el archivo.zip de la pagina https://commons.apache.org/proper/commons-io/download_io.cgi), descomprimimos  y copiamos solo los files . JAR en carpeta libs del proyecto.
     @Test
    public void IngresoCupon(){

        WebElement codigo=webdriver.findElement(By.xpath("//*[@id=\"Filtros_CodCupon\"]"));
         codigo.sendKeys("flor1234");

         // Almacenamos un archvio de tipo file(File de java), Usamos  TakesScreenshot de selenium(TomaCaptura de pantalla), hacemos un casting con webdriver, y tomamos la info que viene del driver
         File src=((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);


         //Ahora copiamos la imagen obtenida y lo guardamos en la ruta indicada
         try {


             FileUtils.copyFile(src, new File("C:\\Users\\princ\\IdeaProjects\\InicioAutomatizacion\\ImagesPeruReailTest\\imagee.png"));


         } catch(IOException e){

             System.out.println(e.getMessage());


         }


    }








}
