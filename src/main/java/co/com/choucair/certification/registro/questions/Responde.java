package co.com.choucair.certification.registro.questions;

import co.com.choucair.certification.registro.userinterface.ValidarFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Responde implements Question <Boolean>
{
    private String question;

    public Responde(String question)
        {
            this.question = question;
        }


    public static Responde toThe(String question)
        {
            return new Responde(question);
        }

    @Override
    public Boolean answeredBy(Actor actor)
        {
            boolean resultado;
            String tituloRegistro = Text.of(ValidarFormulario.TITULO_REGISTRO).viewedBy(actor).asString();
                if (question.equals(tituloRegistro))
                    {
                        resultado = true;
                    }else{
                        resultado = false;
                    }
                return resultado;
        }
}
