package com.primerproyecto.pom.flor.web.stepdefinition;

import com.primerproyecto.pom.flor.web.steps.IdentificacionStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class IdentificacionStepDefinition {

     IdentificacionStep identificacionStep = new IdentificacionStep();



    @Given("Que navegué a diferentes paginas y logré ingresar a la pagina de INICIO DE SESION")
    public void que_navegué_a_diferentes_paginas_y_logré_ingresar_a_la_pagina_de_inicio_de_sesion() {
        System.out.println("1 metodo");
        identificacionStep.setUp();
    }

    @When("Ingreso mi celular, y continuo")
    public void ingreso_mi_celular_y_continuo() {
        System.out.println("2 metodo");

        identificacionStep.ingresodecelular();


    }

    @When("Ingreso mi clave e inicio sesion")
    public void ingreso_mi_clave_e_inicio_sesion() {
        System.out.println("4 metodo");
        identificacionStep.ingresodeclave();

    }


    @When("Reviso las condiciones de uso de la Web usando mi teclado")
    public void reviso_las_condiciones_de_uso_de_la_web_usando_mi_teclado() {
        System.out.println("3 metodo");
        //identificacionStep.leercondicionesdeuso();
    }




    @Then("Deberé estar logueado con mi usuario")
    public void deberé_estar_logueado_con_mi_usuario() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("5 metodo");
    }


}
