package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.contact.ContactUsPage;

public class ContactUsSteps {
    ContactUsPage contact = new ContactUsPage();

    @Given("que el usuario esta en la pagina de bienvenida")
    public void que_el_usuario_esta_en_la_pagina_de_bienvenida() {
        contact.navegar();
        contact.click_boton_contactUs();

    }
    @When("el usuario ingresa los campos y presiona click")
    public void el_usuario_ingresa_los_campos_y_presiona_click() {
        contact.escribirEnContactUs();

    }
    @Then("El usuario deberia ver un mensaje de confirmacion")
    public void el_usuario_deberia_ver_un_mensaje_de_confirmacion() {

    }
}
