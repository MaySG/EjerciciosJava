import javax.swing.JOptionPane;

public class BucleWhile {

	public static void main(String[] args) {
		
		String clave = "Mayte";
		String pass = "";
		
		while(clave.equals(pass)==false) {
			pass =JOptionPane.showInputDialog("Dime la contraseña, por favor: ");
			
			if(clave.equals(pass)==false){
				System.out.println("La contraseña es incorrecta");
			}
			
		}
		System.out.println("La contraseña es correcta");
	}

}
