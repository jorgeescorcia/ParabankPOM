package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        Assert.assertEquals("A Customer Care Representative will be contacting you.",contact.validateContactUs());
        contact.cerrarNavegador();
    }
    @Given("que el usuario esta en la pagina de contactUs")
    public void que_el_usuario_esta_en_la_pagina_de_contact_us() {
        contact.navegar();
        contact.click_boton_contactUs();
    }
    @When("el usuario ingresa no ingresa email y presiona click")
    public void el_usuario_ingresa_no_ingresa_email_y_presiona_click() {
        contact.escribirEnContactUsFailed();
    }
    @Then("El usuario no deberia poder enviar mensaje")
    public void el_usuario_no_deberia_poder_enviar_mensaje() {
        Assert.assertEquals("Email is required.",contact.validarContactFailed());
        contact.cerrarNavegador();

    }
}
