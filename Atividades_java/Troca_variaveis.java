package estudos.atividade;
import javax.swing.JOptionPane;

public class Troca_variaveis {

	public static void main(String[] args) {
	int A, B, Auxiliar;
	A = 5;
	B = 10;
	JOptionPane.showMessageDialog(null,"Antes da troca : \nA = "+A+"e \nB = "+B);
	Auxiliar = A;
	A = B;
	B = Auxiliar;
	 JOptionPane.showMessageDialog(null,"Depois da troca: \nA = "+A+"e \nB = "+B);

	}

}
