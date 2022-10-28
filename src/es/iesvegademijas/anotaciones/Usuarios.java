package es.iesvegademijas.anotaciones;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Usuarios {
	UsuarioAnotado[] value();
}
