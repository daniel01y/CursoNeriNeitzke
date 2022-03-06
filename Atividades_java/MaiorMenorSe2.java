package estudos.atividade;
import javax.swing.JOptionPane;

public class MaiorMenorSe2 {

	public static void main(String[] args) {
		int n1,n2,n3;
		String mensagem="";
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número = "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número = "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número = "));
		
		if ((n1 >= n2) & (n1 >= n3))
		{
		mensagem = mensagem + "O maior é = "+n1;
		
		if (n2 <= n3)
			mensagem = mensagem + "\nO menor é = "+n2;
		
		else 
			mensagem = mensagem + "\nO menor é = "+n3;
		}	
		
		else if ((n2 >= n1) & (n2 >= n3))
		{
			mensagem = mensagem + "\nO maior é = "+n2;
		if (n1 <= n3)
			mensagem = mensagem + "\nO menor é = "+n1;
		else
			mensagem = mensagem + "\nO menor é = "+n3;
		}   
		else 
		{ 
			mensagem = mensagem + "\nO maior é = "+n3;
			if (n2 <= n1)
				mensagem = mensagem + "\nO menor é = "+n2;
			else
				mensagem = mensagem + "\nO menor é = "+n1;
		}
		JOptionPane.showMessageDialog(null,mensagem);
	}
}
