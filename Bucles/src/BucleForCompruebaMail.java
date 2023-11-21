/*
 * Comprueba si hay una @ y al menos 1 punto
 */
import javax.swing.JOptionPane;

public class BucleForCompruebaMail {

	public static void main(String[] args) {
		
		int arroba = 0;
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu mail: ");
		
		for(int i=0; i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			if(mail.charAt(i)=='.');
				punto=true;
		}
		if (arroba==1&&punto==true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto ");
		}

	}

}
