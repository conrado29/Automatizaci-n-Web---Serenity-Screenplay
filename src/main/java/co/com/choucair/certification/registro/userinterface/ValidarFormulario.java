package co.com.choucair.certification.registro.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarFormulario extends PageObject
{
    public static final Target TITULO_REGISTRO = Target.the("titulo de pagina").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]/b"));
}
