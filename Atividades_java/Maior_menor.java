package estudos.atividade;
import javax.swing.JOptionPane;

public class Maior_menor {

	public static void main(String[] args) {
		int n1,n2,n3;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero = "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero = "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero = "));
		
		if ((n1 >= n2) & (n1 >= n3))
		{
		JOptionPane.showMessageDialog(null,"O maior � = "+n1);
		
		if (n2 <= n3)
		JOptionPane.showMessageDialog(null,"O menor � = "+n2);
		
		else 
			JOptionPane.showMessageDialog(null,"O menor � = "+n3);
		}	
		
		else if ((n2 >= n1) & (n2 >= n3))
		{
			JOptionPane.showMessageDialog(null,"O maior � = "+n2);
		if (n1 <= n3)
			JOptionPane.showMessageDialog(null,"O menor � = "+n1);
		else
			JOptionPane.showMessageDialog(null,"O menor � = "+n3);
		}   
		else 
		{ 
			JOptionPane.showMessageDialog(null,"O maior � = "+n3);
			if (n2 <= n1)
				JOptionPane.showMessageDialog(null,"O menor � = "+n2);
			else
				JOptionPane.showMessageDialog(null,"O menor � = "+n1);
		}
	}
}
