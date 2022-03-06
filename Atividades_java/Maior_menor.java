package estudos.atividade;
import javax.swing.JOptionPane;

public class Maior_menor {

	public static void main(String[] args) {
		int n1,n2,n3;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número = "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número = "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número = "));
		
		if ((n1 >= n2) & (n1 >= n3))
		{
		JOptionPane.showMessageDialog(null,"O maior é = "+n1);
		
		if (n2 <= n3)
		JOptionPane.showMessageDialog(null,"O menor é = "+n2);
		
		else 
			JOptionPane.showMessageDialog(null,"O menor é = "+n3);
		}	
		
		else if ((n2 >= n1) & (n2 >= n3))
		{
			JOptionPane.showMessageDialog(null,"O maior é = "+n2);
		if (n1 <= n3)
			JOptionPane.showMessageDialog(null,"O menor é = "+n1);
		else
			JOptionPane.showMessageDialog(null,"O menor é = "+n3);
		}   
		else 
		{ 
			JOptionPane.showMessageDialog(null,"O maior é = "+n3);
			if (n2 <= n1)
				JOptionPane.showMessageDialog(null,"O menor é = "+n2);
			else
				JOptionPane.showMessageDialog(null,"O menor é = "+n1);
		}
	}
}
