package estudos.atividade;

import java.io.*;

import javax.swing.JOptionPane; 
class Cadastro_cliente_arquivo {
	public static void main(String[] args) 
	{
		String menu = "Opções do Menu - Prof Neri - IFORMATICON\n\n\n"+
					  "1 - Cadastrar novo Cliente\n"+
					  "2 - Mostrar dados do Cliente\n"+
					  "3 - Sair do Sistema";
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		if (opcao == 1)
		{
			cadastro dados_cliente = new cadastro();
			dados_cliente.nome = JOptionPane.showInputDialog("Digite o nome do cliente = ");
			dados_cliente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente = "));
			dados_cliente.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do cliente = "));
			try
			{
				FileOutputStream arquivo = new FileOutputStream ("banco_dados_cliente.txt");
				try (ObjectOutputStream obj_dados_cliente = new ObjectOutputStream(arquivo)) {
					obj_dados_cliente.writeObject(dados_cliente);
					obj_dados_cliente.flush();
				}
				JOptionPane.showMessageDialog(null,"Parabéns, arquivo de dados do cliente gerados com sucesso");
				
			}
			catch(Exception erro_grava)
			{}
		}
		
		else if (opcao == 2)
		{
			try
			{
			FileInputStream arquivo = new FileInputStream ("banco_dados_cliente.txt");
			try (ObjectInputStream obj_dados_cliente = new ObjectInputStream(arquivo)) {
				cadastro dados_cliente = (cadastro)obj_dados_cliente.readObject();
				JOptionPane.showMessageDialog(null,"Nome do cliente "+dados_cliente.nome+
												   "\nIdade do cliente = "+dados_cliente.idade+
												   "\nSalário do cliente = "+dados_cliente.salario);
			}
			}
			catch(Exception erro_grava)
			{}
		}
	}
}

class cadastro implements Serializable
{
	String nome;
	int idade;
	float salario;
}
	


