package co.com.choucair.certification.registro.tasks;


import co.com.choucair.certification.registro.userinterface.FormularioRegistro;
import co.com.choucair.certification.registro.model.DatosRegistro;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;





import java.util.List;


public class Registrar implements Task {
    private List<DatosRegistro> Data;

    public Registrar(List<DatosRegistro> data)
        {
            this.Data = data;
        }

    public static Registrar usuario(List<DatosRegistro> Data)
        {
            return Tasks.instrumented(Registrar.class,Data);
        }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo
                (
                        Enter.theValue(Data.get(0).getNombre()).into(FormularioRegistro.CAMPO_NOMBRE),
                        Enter.theValue(Data.get(0).getApellido()).into(FormularioRegistro.CAMPO_APELLIDO),
                        Enter.theValue(Data.get(0).getDireccion()).into(FormularioRegistro.CAMPO_DIRECCION),
                        Enter.theValue(Data.get(0).getCorreo()).into(FormularioRegistro.CAMPO_CORREO),
                        Enter.theValue(Data.get(0).getTelefono()).into(FormularioRegistro.CAMPO_TELEFONO),
                        Check.whether(Data.get(0).getGenero().toString().trim().equals("Male"))
                                                 .andIfSo(Click.on(FormularioRegistro.CHECK_GENERO_M))
                                                 .otherwise(Click.on(FormularioRegistro.CHECK_GENERO_F)),
                        Check.whether(Data.get(0).getHobbie1().toString().trim().equals("Cricket"))
                                                 .andIfSo(Click.on(FormularioRegistro.SELECTOR_HOBBIE_1)),
                        Check.whether(Data.get(0).getHobbie2().toString().trim().equals("Movies"))
                                                 .andIfSo(Click.on(FormularioRegistro.SELECTOR_HOBBIE_2)),
                        Check.whether(Data.get(0).getHobbie3().toString().trim().equals("Hockey"))
                                                 .andIfSo(Click.on(FormularioRegistro.SELECTOR_HOBBIE_3)),
                        Click.on(FormularioRegistro.DISPLAY_LENGUAGES),
                            Check.whether(Data.get(0).getLenguaje_1().trim().equals("Spanish"))
                                                     .andIfSo(Click.on(FormularioRegistro.SELECT_LENGUAGE_1)),
                            Check.whether(Data.get(0).getLenguaje_2().trim().equals("English"))
                                                     .andIfSo(Click.on(FormularioRegistro.SELECT_LENGUAGE_2)),
                        SelectFromOptions.byVisibleText(Data.get(0).getSkills()).from(FormularioRegistro.SELECTOR_SKILLS),
                        SelectFromOptions.byVisibleText(Data.get(0).getCiudad()).from(FormularioRegistro.CAMPO_CIUDAD),
                        SelectFromOptions.byVisibleText(Data.get(0).getSeleccionarCiudad()).from(FormularioRegistro.SELECTOR_CIUDAD),
                        SelectFromOptions.byVisibleText(Data.get(0).getAño()).from(FormularioRegistro.CAMPO_AÑO),
                        SelectFromOptions.byVisibleText(Data.get(0).getMes()).from(FormularioRegistro.CAMPO_MES),
                        SelectFromOptions.byVisibleText(Data.get(0).getDia()).from(FormularioRegistro.CAMPO_DIA),
                        Enter.theValue(Data.get(0).getContraseña()).into(FormularioRegistro.CAMPO_CONTRASEÑA),
                        Enter.theValue(Data.get(0).getConfirmarContraseña()).into(FormularioRegistro.REPETIR_CONTRASEÑA),
                        Click.on(FormularioRegistro.BOTON_ENVIAR)

                );
    }
}
