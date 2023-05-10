package com.primerproyecto.pom.flor.web.stepdefinition;

import com.primerproyecto.pom.flor.web.steps.SunatStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SunatStepDefinition {

    private SunatStep sunatStep = new SunatStep();



    @Given("Que ingresé a la pagina de la sunat e ingresé a la pagina de Monitor de Covid")
    public void que_ingresé_a_la_pagina_de_la_sunat_e_ingresé_a_la_pagina_de_monitor_de_covid() {
        // Write code here that turns the phrase above into concrete actions
        sunatStep.AbrirPaginaEnOtraVentana();
    }
    @Then("Deberé poder descargar el documento de EL CONTROL EN TIEMPOS DE COVID-{int}")
    public void deberé_poder_descargar_el_documento_de_el_control_en_tiempos_de_covid(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    sunatStep.javaScript();
    }


}
