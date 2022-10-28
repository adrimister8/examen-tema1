package es.iesvegademijas.anotaciones;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Repeatable(Usuarios.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface UsuarioAnotado {
	
	String nombre();
	String passwd();
}
