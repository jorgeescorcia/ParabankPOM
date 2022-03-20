# new feature
# Tags: optional

Feature: atencion al cliente

  Scenario: el usuario no envia el mensaje exitosamente
    Given que el usuario esta en la pagina de contactUs
    When el usuario ingresa no ingresa email y presiona click
    Then El usuario no deberia poder enviar mensaje