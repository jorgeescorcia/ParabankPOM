# new feature
# Tags: optional

Feature: funcionalidad Login en parabank
    Yo como usuario
    Quiero poder loguearme en la web
    Para  navegar dentro de ella

    Scenario: inicio de sesion invalido
        Given que el usuario intenta loguearse
        When el usuario no ingresa un nombre de usuario
        Then el usuario no debe tener acceso a la pagina de inicio