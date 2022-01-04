Feature: Categoria crear cuenta
  como nuevo usuario quiero crear una cuenta.

  Scenario: Ingresar al formulario de crear cuenta desde la pantalla home
    Given El usuario se encuentra en la pantalla home de automationpractice
    When Hace click sobre el boton de iniciar sesion
    Then se debe redirigir al formulario de crear cuenta