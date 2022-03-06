package estudos.atividade;
import javax.swing.JOptionPane;

public class Par_impar {

	public static void main(String[] args) {
                 int numero;
                 numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número = "));
                 if (numero % 2 == 0)
                	 JOptionPane.showMessageDialog(null,"O NÚMERO "+numero+" É PAR");
                 else 
                	 JOptionPane.showMessageDialog(null,"O NÚMERO "+numero+" É ÍMPAR");
                 
                 JOptionPane.showMessageDialog(null,"...........FIM..........");
	}

}
