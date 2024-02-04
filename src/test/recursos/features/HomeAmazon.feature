Feature: Homepage
  As a website Amazon user
  I want do any validations in page Homepage

  @AppWeb1
  Scenario: Homepage Display
    Given Ingresé a la web de Amazon
    #When Paso el mouse por un producto
    When Busco producto  ok
    And Valido que el  campo Deliver to sea Peru
    And Reviso los elementos del campo Idiomas
    And Presiono el teclado TAB
    Then Salgo de la web


