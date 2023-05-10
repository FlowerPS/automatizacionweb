package com.primerproyecto.pom.flor.web.steps;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


public class HomeAmazonStep {


    private WebDriver webdriver;
    private WebElement webElement;

    // Etiqueta de jUNIt 5
    @BeforeEach
    public void setUp(){

        System.setProperty("flor.webdriver.chrome.driver", "/src/test/recursos/chromedriver.exe" );
        ChromeOptions options= new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-position=500,300");
        options.addArguments("--window-size=1200,400");
        //options.addArguments("--headless"); ejecuta el scrip sin la interfaz

        webdriver = new ChromeDriver(options);
        webdriver.get("https://www.amazon.com/"); //Metodo que navega en la web indicada
        webdriver.manage().window().maximize();
        // webdriver.manage().window().fullscreen();
        String title=webdriver.getTitle();
        System.out.println( "El titulo es "+ title ); //metodo que obtiene el titulo de la pagina
       // System.out.println(" La URL es "+ webdriver.getCurrentUrl()); //Metodo que obtiene la url de la web

        //Thread.sleep(4000);



    }





/*
    //La web Debe utilizar  un evento MouseOver(mover mouse sobre algo) y que muestre una alerta, para que funcione el metodo, en este caso lo comente porque la web de forosdelweb no esta utilizando el evento deseado(Mostrar alerta) y por lo tanto muestra error
     al no encontrar alerta.
    @Test
    public void pasarMouse(){

        try {


            webdriver.get("https://www.forosdelweb.com/f17/efecto-mouseover-con-imagenes-549317/");

            WebElement imagen = webdriver.findElement(By.xpath("//*[@id=\"register\"]"));

            Actions accion=new Actions(webdriver);

            accion.moveToElement(imagen).build().perform();

            Alert alert = webdriver.switchTo().alert();

            System.out.println(alert.getText());
            alert.accept();
            Assert.assertTrue(alert.getText().contains("Registrarse"));

        } catch (Exception e) {

            System.out.println("Hubo un error");
        }


    }

*/


    //Buscar un producto
    @Test
    public void busquedaProducto()  {

        WebElement intputBusqueda = webdriver.findElement(By.id("twotabsearchtextbox"));
        WebElement btnLupaBuscar = webdriver.findElement(By.xpath("//input[@id='nav-search-submit-button']" ));
        intputBusqueda.click();
        intputBusqueda.sendKeys("Top Gun [DVD]");
        //Thread.sleep(2000);
        btnLupaBuscar.click();
        //Thread.sleep(4000);
    }


 @Test
  public String captureDeliverTo() {


     webElement = webdriver.findElement(By.id("glow-ingress-line2"));
     String nombre = webElement.getText();


     return nombre;
 }


 // Evento click y obtener un Lista de los idiomas
    @Test
    public void ListarIdiomas() {


        WebElement IraIdiomas=webdriver.findElement(By.cssSelector("#icp-nav-flyout > span > span.nav-line-2"));
        IraIdiomas.click();


        List<WebElement> elementos = webdriver.findElements(By.xpath("//*[@id=\"icp-language-settings\"]"));



        for (WebElement element : elementos) {

            System.out.println("Captura de lista de texto: " + element.getText());
            System.out.println("Captura de lista de propiedades de CSS: " + element.getCssValue("font-family"));
            System.out.println("Captura de lista de propiedades de CSS: " + element.getCssValue("font-size"));

        }

        WebElement seleccionidioma= webdriver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/span/span"));
        seleccionidioma.click();

        WebElement BtnGuardarIdioma=webdriver.findElement(By.xpath("//*[@id=\"icp-save-button\"]/span/input"));

        BtnGuardarIdioma.click();

        WebElement BtnCancelar = webdriver.findElement(By.cssSelector("span#icp-cancel-button"));

        BtnCancelar.click();


    }


    //Siumulacion de Evento de interaccion con el  teclado #TAB
    @Test
    public void TecladoTAB(){

      WebElement LogoAmazon=webdriver.findElement(By.id("nav-logo-sprites"));
        LogoAmazon.sendKeys(Keys.TAB);


      //La web no genera alterta al hacer TAB, por eso no se va mostrar ninguna alerta
      //Alert alerta= webdriver.switchTo().alert();

    }




    @AfterEach
    public void tearDown(){

         webdriver.manage().window().minimize();

        //Dimension dimension = new Dimension(1200,500);
        //webdriver.manage().window().setSize(dimension);


        webdriver.close();//Metodo que cierra el navegador
       // webdriver.quit();//Metodo que cierra todos los navegadores

    }







}
