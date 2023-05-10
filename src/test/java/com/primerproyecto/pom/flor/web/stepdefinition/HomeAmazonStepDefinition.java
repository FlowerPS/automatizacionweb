package com.primerproyecto.pom.flor.web.stepdefinition;

import com.primerproyecto.pom.flor.web.steps.HomeAmazonStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;



/*
By Flor Paucar
*/


public class HomeAmazonStepDefinition  extends HomeAmazonStep {



   HomeAmazonStep homeAmazonStep= new HomeAmazonStep();

    @When("Ingresé a la web de Amazon")
    public void Ingresé_a_la_web_de_amazon() throws IllegalAccessException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hi Flor you entered the first method");
        homeAmazonStep.setUp();

    }

/*
    @When("Paso el mouse por un producto")
    public void paso_el_mouse_por_un_producto() {

        homeAmazonStep.pasarMouse();


    }

*/

    @When("Busco producto  ok")
    public void busco_producto_ok() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Hi Flor you entered the second method");
        homeAmazonStep.busquedaProducto();


    }

    @And("Validar que el  campo Deliver to sea Peru")
    public void Validar_que_el_campo_Deliver_to_sea_Peru() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hi Flor you entered the third method");

        assertEquals("Peru", homeAmazonStep.captureDeliverTo());
    }

    @And("Reviso los elementos del campo Idiomas")
    public void revisoLosElementosDelCampoIdiomas() {

        System.out.println("Hi Flor you entered the fourth method");


        homeAmazonStep.ListarIdiomas();

    }

    @And("Presiono el teclado TAB")
    public void presionoElTecladoTAB() {
        System.out.println("Hi Flor you entered the seventh method");
        homeAmazonStep.TecladoTAB();

    }

    @Then("Salgo de la web")
    public void salgo_de_la_web() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Hi Flor you entered the sixth method");
        //homeAmazonStep.tearDown();

    }

}
