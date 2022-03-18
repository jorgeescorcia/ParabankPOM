# new feature
# Tags: optional

Feature: atencion al cliente

  Scenario: el usuario envia el mensaje exitosamente
    Given que el usuario esta en la pagina de bienvenida
    When el usuario ingresa los campos y presiona click
    Then El usuario debería ver un mensaje de confirmacion