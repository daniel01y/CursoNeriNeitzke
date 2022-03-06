package estudos.atividade;
import javax.swing.JOptionPane;
public class MaiorMenorSE {

	public static void main(String[] args) {
		int n1,n2,n3;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número = "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número = "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número = "));
		if ((n1 >= n2) & (n1 >= n3))
			JOptionPane.showMessageDialog(null,"\nO maior e = "+n1);
		else if ((n2 >= n1) & (n2 >= n3)) 
		    JOptionPane.showMessageDialog(null,"\nO maior e = "+n2);
		else
		    JOptionPane.showMessageDialog(null,"\nO maior e = "+n3);
		if ((n1 <= n2) & (n1 <= n3))
			JOptionPane.showMessageDialog(null,"\nO menor e = "+n1);
		else if ((n2 <= n1) & (n2 <= n3)) 
			JOptionPane.showMessageDialog(null,"\nO menor e = "+n2);
		else
			JOptionPane.showMessageDialog(null,"\nO menor e = "+n3);
	}

}
