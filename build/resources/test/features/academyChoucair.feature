# lenguaje:en
# autor: Conrado Iglesias G

@stories
Feature: Academy Choucair
  As a user, I want to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given que Carlos quiere acceder a la Web Automation Demo Site
    When  el realiza el registro en la página
      |   nombre  |   apellido  |    direccion    |          correo        |  telefono  | genero | hobbie1 | hobbie2 | hobbie3 |lenguaje_1 | lenguaje_2 | skills | ciudad  | seleccionarCiudad | año  |  mes   | dia |  contraseña | confirmarcontraseña |
      | Nombre029 | Apellido029 | Panama Arraijan | prueba29@prueba29.com | 4034097854 |  Male  | Cricket |  Movies | Hockey  | Spanish   |  English   |  CSS   | Angola  |       India       | 1996 | April  | 29  | Contra12345 |    Contra12345      |
    Then  el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row.