package estudos.atividade;
import javax.swing.JOptionPane;
public class Cadastro_cliente {

	public static void main(String[] args) 
	{
		cadastro dados_cliente = new cadastro();
		dados_cliente.nome = JOptionPane.showInputDialog("Digite o nome do cliente = ");
		dados_cliente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente = "));
		dados_cliente.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do cliente = "));
		
		JOptionPane.showMessageDialog(null,"Nome do cliente "+dados_cliente.nome+
											"\nIdade do cliente = "+dados_cliente.idade+
											"\nSalário do cliente = "+dados_cliente.salario);
	}

}

class cadastro
{
	String nome;
	int idade;
	float salario;
}