package com.primerproyecto.pom.flor.web.stepdefinition;

import com.primerproyecto.pom.flor.web.steps.PeruRailStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PeruRailStepDefinition {


    private PeruRailStep PeruRailStep= new PeruRailStep();


    @Given("Que ingresé a la pagina de PeruRail")
    public void que_ingresé_a_la_pagina_de_PeruRail() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Hola");

        PeruRailStep.setUp();

    }
    @When("Selecciono la Ruta")
    public void selecciono_la_Ruta() {
        // Write code here that turns the phrase above into concrete actions

        PeruRailStep.seleccionoIdayVuelta();

    }

    @When("Cierro el modal")
    public void cierro_el_modal() {
        // Write code here that turns the phrase above into concrete actions
        PeruRailStep.cerrarmodal();
    }


    @When("Hago check en cupon")
    public void hago_check_en_cupon() {
        // Write code here that turns the phrase above into concrete actions
       PeruRailStep.SeleccionarCupon();
    }

    @When("Ingreso el cupon de descuento")
    public void ingreso_el_cupon_de_descuento() {
        // Write code here that turns the phrase above into concrete actions
       PeruRailStep.IngresoCupon();
    }

    @Then("Se muestra la ubicacion Lima")
    public void se_muestra_la_ubicacion_lima() {
        // Write code here that turns the phrase above into concrete actions

    }














}
