# new feature
# Tags: optional

Feature: funcionalidad de registro en parabank

  Scenario: registro para una nueva cuenta
    Given que el usuario hace click en el boton register
    When el usuario ingresa toda la informacion y hace clic en el boton de registro
    Then El usuario debe ver la pagina de bienvenida

