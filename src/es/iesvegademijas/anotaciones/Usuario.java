package es.iesvegademijas.anotaciones;

public class Usuario {
		private String nombre;
		private String passwd;
		public String getNombre() {
			return nombre;
		}
		
		public Usuario() {
			
		}
		
		public Usuario(String nombre, String passwd) {
			this.nombre=nombre;
			this.passwd=passwd;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getContraseña() {
			return passwd;
		}
		
		public void setContraseña(String contraseña) {
			this.passwd = contraseña;
		}
		
		
}
