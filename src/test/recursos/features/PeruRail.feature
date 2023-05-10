#Escenario que simula seleccion de un comboBox

Feature: PeruRail page

  As a website  PeruRail user

  Scenario: Ingreso a la pagina home

    Given Que ingresé a la pagina de PeruRail
    When Selecciono la Ruta
    When Cierro el modal
    When Hago check en cupon
    And Ingreso el cupon de descuento
    Then Se muestra la ubicacion Lima


