package TestCasesNotomarEnCuenta;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCases {


    public WebDriver WebDriver;
    //private String PATH_CHROME_DRIVER= System.getProperty("user.dir")+ "/src/test/recursos/" ;

    @Test
    public void setUp(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/test/recursos/chromedriver.exe" );

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver = new ChromeDriver(options);
        WebDriver.manage().window().maximize();
        WebDriver.get("https://www.amazon.com/"); //Metodo que navega en la web indicada

        // System.out.println( "El titulo es "+ webDriver.getTitle()); //metodo que obtiene el titulo de la pagin
        // System.out.println(" La URL es "+ webDriver.getCurrentUrl()); //Metodo que obtiene la url de la web

        WebElement intputBusqueda = WebDriver.findElement(By.id("twotabsearchtextbox"));
        WebElement btnLupaBuscar = WebDriver.findElement(By.xpath("//input[@id='nav-search-submit-button']" ));

        intputBusqueda.click();
        intputBusqueda.sendKeys("zapatillas adidas para niño");
        //Thread.sleep(2000);
        btnLupaBuscar.click();
        //Thread.sleep(4000);
    }

    /**
     public void busquedaAmazon() throws InterruptedException {


     JavascriptExecutor js = (JavascriptExecutor) driver;

     js.executeScript("alert ('prueba')");

     }

     **/
    @AfterClass
    public void tearDown(){

        WebDriver.close();//Metodo que cierra el navegador
        WebDriver.quit();//Metodo que cierra todos los navegadores

    }
















}
