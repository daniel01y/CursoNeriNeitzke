package estudos.atividade;
import javax.swing.JOptionPane;

public class crescente_A_B {

	public static void main(String[] args) {
		int A,B;
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A = "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B = "));
		if (A > B)
	 	JOptionPane.showMessageDialog(null,"Em ordem crescente B = "+B+" - A ="+A);
	 	else 
	 	JOptionPane.showMessageDialog(null,"Em ordem crescente A = "+A+" - B="+B);
	}

}
