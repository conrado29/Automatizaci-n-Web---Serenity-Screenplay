package co.com.choucair.certification.registro.stepdefinitions;

import co.com.choucair.certification.registro.model.DatosRegistro;
import co.com.choucair.certification.registro.questions.Responde;
import co.com.choucair.certification.registro.tasks.Registrar;
import co.com.choucair.certification.registro.tasks.OpenUp;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.GivenWhenThen;
import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ChoucairRetoStepDefintions {

    @Before
    public void setStage ()
        {
            OnStage.setTheStage(new OnlineCast());
        }

    @Given("^que Carlos quiere acceder a la Web Automation Demo Site$")
        public void queCarlosquiereaccederalaWebAutomationDemoSite()
        {
            OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
        }

    @When("^el realiza el registro en la página$")
        public void elrealizaelregistroenlapágina(List<DatosRegistro> Data)
        {
            OnStage.theActorInTheSpotlight().attemptsTo(Registrar.usuario(Data));
        }

    @Then("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to (.*) the Table Row\\.$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String question)
        {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responde.toThe(question)));
        }
}

