package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ParabankPage;

public class RegisterParabankSteps {
    ParabankPage parabank = new ParabankPage();

    @Given("que el usuario hace click en el boton register")
    public void que_el_usuario_hace_click_en_el_boton_register() {
    parabank.navegar_a_parabank();
    parabank.click_boton_register();



    }
    @When("el usuario ingresa toda la informacion y hace clic en el boton de registro")
    public void el_usuario_ingresa_toda_la_informacion_y_hace_clic_en_el_boton_de_registro() {
        parabank.escribirEnInputsRegister();

    }
    @Then("El usuario debe ver la pagina de bienvenida")
    public void el_usuario_debe_ver_la_pagina_de_bienvenida() {

    }
}
