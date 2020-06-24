package co.com.choucair.certification.registro.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioRegistro extends PageObject
{
    public static final Target CAMPO_NOMBRE =      Target.the("campo de nombre ").located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target CAMPO_APELLIDO =    Target.the("campo apellido").located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target CAMPO_DIRECCION =   Target.the("campo direccion recidencial").located(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea[@ng-model='Adress']"));
    public static final Target CAMPO_CORREO =      Target.the("campo correo electronico").located(By.xpath("//div[@id='eid']/input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
    public static final Target CAMPO_TELEFONO =    Target.the("campo telefono").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input[@type='tel']"));
    public static final Target CHECK_GENERO_M =    Target.the("check box de genero m").located(By.xpath("//input[@value='Male']"));//
    public static final Target CHECK_GENERO_F =    Target.the("check box de genero f").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[2]"));
    public static final Target SELECTOR_HOBBIE_1 = Target.the("seleccionar hobbies criket").located(By.id("checkbox1"));
    public static final Target SELECTOR_HOBBIE_2=  Target.the("seleccionar hobbies movies").located(By.id("checkbox2"));
    public static final Target SELECTOR_HOBBIE_3=  Target.the("seleccionar hobbieshockey").located(By.id("checkbox3"));
    public static final Target DISPLAY_LENGUAGES = Target.the("caja de language").located(By.id("msdd"));
    public static final Target SELECT_LENGUAGE_1 = Target.the("seleccionar el lenguage ESPANOL").located(By.xpath("//li[@class='ng-scope' and contains(.,'English')]"));
    public static final Target SELECT_LENGUAGE_2 = Target.the("seleccionar el lenguaje INGLES").located(By.xpath("//li[@class='ng-scope' and contains(.,'Spanish')]"));
    public static final Target SELECTOR_SKILLS =   Target.the("selector de skills").located(By.id("Skills"));
    public static final Target CAMPO_CIUDAD =      Target.the("selector de ciudad").located(By.id("countries"));
    public static final Target SELECTOR_CIUDAD =   Target.the("selecion de ciudad dos").located(By.id("country"));
    public static final Target CAMPO_DIA =         Target.the("campo de dia en la fecha dia").located(By.id("daybox"));
    public static final Target CAMPO_MES =         Target.the("campo de mes en la fecha mes").located(By.xpath("//div[@class='col-md-3 col-xs-3 col-sm-3']/select[@placeholder='Month']"));
    public static final Target CAMPO_AÑO =         Target.the("campo de año en la fecha año").located(By.id("yearbox"));
    public static final Target CAMPO_CONTRASEÑA =  Target.the("campo de ingresar contraseña").located(By.id("firstpassword"));
    public static final Target REPETIR_CONTRASEÑA =Target.the("campo de repetir contraseña").located(By.id("secondpassword"));
    public static final Target BOTON_ENVIAR =      Target.the("boton para enviar datos").located(By.id("submitbtn"));
    public static final Target BOTON_REFRESCAR =   Target.the("boton para refrescar formulario").located(By.id("Button1"));
}
