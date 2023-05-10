package com.primerproyecto.pom.flor.web.stepdefinition;

import com.primerproyecto.pom.flor.web.steps.TestNgStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestNgStepDefinition {

    TestNgStep testNgStep = new TestNgStep();


    @Given("Que ingresé a la pagina web")
    public void queIngreséALaPaginaWeb() {


        System.out.println("HI TESTNG WITH CUCUMBER,  METODO 1");
        testNgStep.tearDown();



    }


    @When ("Verifico el titulo de mi pagina web")
    public void verifico_el_titulo_de_mi_pagina_web() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("HI TESTNG WITH CUCUMBER, METODO 2");

    }

    @Then("El titulo de mi pagina web deber ser: PERURAIL - ¡Machu Picchu te espera!")
    public void el_titulo_de_mi_pagina_web_deber_ser_perurail_machu_picchu_te_espera() {
        System.out.println("HI TESTNG WITH CUCUMBER,  METODO 3");
    }



}
