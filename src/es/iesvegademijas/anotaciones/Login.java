package es.iesvegademijas.anotaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@UsuarioAnotado(nombre = "adrian", passwd = "contraseña")
@UsuarioAnotado(nombre = "usuario", passwd = "usuario")

public class Login {
	Scanner sc = new Scanner(System.in);
	
	private List<Usuario> listaUsuarios;
	
	public Login() {
		this.listaUsuarios = new ArrayList<>();
	}
	
	public String login() {
		String usuario = sc.next();
		String contraseña = sc.next();
		
		Usuario nuevo = new Usuario(usuario, contraseña);
		
		if(listaUsuarios.contains(nuevo)) {
			return "ACCESO CONCEDIDO";
		}else {
			return "ACCESO DENEGADO";
		}
		
	}
	
	public void añadirUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	public static Login cargadorDeContexto() {
		 
		Login login = new Login();
		
		UsuarioAnotado[] anotadoUsuarios= Usuario.class.getAnnotationsByType(UsuarioAnotado.class);
		
		for (UsuarioAnotado anotadoUsuario: anotadoUsuarios) {
			Usuario usuario = new Usuario();
			usuario.setNombre(anotadoUsuario.nombre());
			usuario.setContraseña(anotadoUsuario.passwd());
			
			login.añadirUsuario(usuario);
		}
			
		return login;
	}
}
