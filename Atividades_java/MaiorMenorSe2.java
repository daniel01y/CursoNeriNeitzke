package estudos.atividade;
import javax.swing.JOptionPane;

public class MaiorMenorSe2 {

	public static void main(String[] args) {
		int n1,n2,n3;
		String mensagem="";
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero = "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero = "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero = "));
		
		if ((n1 >= n2) & (n1 >= n3))
		{
		mensagem = mensagem + "O maior � = "+n1;
		
		if (n2 <= n3)
			mensagem = mensagem + "\nO menor � = "+n2;
		
		else 
			mensagem = mensagem + "\nO menor � = "+n3;
		}	
		
		else if ((n2 >= n1) & (n2 >= n3))
		{
			mensagem = mensagem + "\nO maior � = "+n2;
		if (n1 <= n3)
			mensagem = mensagem + "\nO menor � = "+n1;
		else
			mensagem = mensagem + "\nO menor � = "+n3;
		}   
		else 
		{ 
			mensagem = mensagem + "\nO maior � = "+n3;
			if (n2 <= n1)
				mensagem = mensagem + "\nO menor � = "+n2;
			else
				mensagem = mensagem + "\nO menor � = "+n1;
		}
		JOptionPane.showMessageDialog(null,mensagem);
	}
}
