# new feature
# Tags: optional

Feature: Registro invalido en Parabank

  Scenario: registro fallido
    Given que el usuario esta en la opcion register
    When el usuario no ingresa informacion en el campo city
    Then El usuario no debe registrarse en la web