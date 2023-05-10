package com.primerproyecto.pom.flor.web.steps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class IdentificacionStep {


    private WebDriver webdriver;
    private WebElement webElement;



//Nagacion entre paginas en la misma pestana
    @BeforeEach
    public void setUp(){

        System.setProperty("flor.webdriver.chrome.driver", "/src/test/recursos/chromedriver.exe" );
        ChromeOptions options= new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        ;
        //options.addArguments("--headless"); ejecuta el scrip sin la interfaz

        webdriver = new ChromeDriver(options);

        //IR Pagina Home
        webdriver.get("https://www.amazon.com/"); //Metodo que navega en la web indicada
        System.out.println(webdriver.getCurrentUrl());

        //Ir a pagina Identificacion para inicio de session
        webdriver.navigate().to("https://www.amazon.com/-/es/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F-%2Fes%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        System.out.println(webdriver.getCurrentUrl());

        // Ir a pagina de  Ofertas del dia
        webdriver.navigate().to("https://www.amazon.com/-/es/gp/goldbox?ref_=nav_cs_gb");

         System.out.println(webdriver.getCurrentUrl());

        //Regresar a pagina de  Identificacion para inicio de session(Regresa a la pagina donde navegaste anteriormente)
         webdriver.navigate().back();

         System.out.println(webdriver.getCurrentUrl());

    }




    // Simulacion de Evento de registro de datos en un formulario usando selector name, se recomienda usar ese selector para formularios
    @Test
    public void ingresodecelular(){

      webElement=webdriver.findElement(By.name("email"));
      webElement.sendKeys("+51921666757");

      webElement=webdriver.findElement(By.xpath("//*[@id=\"continue\"]"));
      webElement.click();

    }

    // Simulacion de Evento de registro de datos en un formulario
    // Usando estrategia de localizacion con sintaxis corta, asignando los eventos(.sendKeys y .click()) en el mismo codigo de la captura de los elementos
    @Test
    public  void ingresodeclave(){


        webdriver.findElement(By.id("ap_password")).sendKeys("florBelinda2626");


        webdriver.findElement(By.id("signInSubmit")).click();




    }





    //SIMULACION DE NAVEGACION A OTRA PESTANA EN LA WEB USANDO EL TECLADO,

    @Test
    public void leercondicionesdeuso(){

        //Ingresos a otra pagina  usando teclas  CONTROL Y RETURN(ENTER)

        String abrirOtraPagintaConCONTROLyRETURN = Keys.chord( Keys.CONTROL,   Keys.RETURN );

        //captura de enlace de la pagina que se abre en otra ventana
        webElement=webdriver.findElement(By.xpath("//*[@id=\"legalTextRow\"]/a[1]"));

        webElement.sendKeys(abrirOtraPagintaConCONTROLyRETURN);


        //OBTENEMOS LA LISTA DE TABs(pestanas) e Ingresamos a la 2 pestana para obtener su URL

        ArrayList tabs= new ArrayList(webdriver.getWindowHandles());

        //Se obtiene la cantidad de TABs realizados o pestanas abiertas
        System.out.println("cantidad de TABs o pestanas " + tabs.size());

        //Nos movemos a la  pestanas N~ 2 con webdriver(indices 0,1)
        webdriver.switchTo().window(tabs.get(1).toString());

        //Obtenemos la Url  en la que nos encontramos,  indicada en la linea anterior
        System.out.println("Url de la segunda pestana con indice indicado 1" + webdriver.getCurrentUrl());



    }




}
