Feature: Identification Page
  As a website Amazon
  I want identify me and log me in

  @AppWeb2
  Scenario: Inicio de Sesion
    Given Que navegué a diferentes paginas y logré ingresar a la pagina de INICIO DE SESION
    When Ingreso mi celular, y continuo
    When  Reviso las condiciones de uso de la Web usando mi teclado
    And Ingreso mi clave e inicio sesion
    Then Deberé estar logueado con mi usuario

