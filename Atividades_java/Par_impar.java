package estudos.atividade;
import javax.swing.JOptionPane;

public class Par_impar {

	public static void main(String[] args) {
                 int numero;
                 numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero = "));
                 if (numero % 2 == 0)
                	 JOptionPane.showMessageDialog(null,"O N�MERO "+numero+" � PAR");
                 else 
                	 JOptionPane.showMessageDialog(null,"O N�MERO "+numero+" � �MPAR");
                 
                 JOptionPane.showMessageDialog(null,"...........FIM..........");
	}

}
