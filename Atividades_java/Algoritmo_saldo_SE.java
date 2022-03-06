package estudos.atividade;
import javax.swing.JOptionPane;

public class Algoritmo_saldo_SE {

	public static void main(String[] args) {
		int saldo,cheque_entrou;
		saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do saldo inicial ="));
		cheque_entrou = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cheque que entrou = "));
		JOptionPane.showMessageDialog(null,"O saldo inicial = "+saldo+
				                           "\nO valor do Cheque que entrou = "+cheque_entrou);
		
		if (cheque_entrou <= saldo)
		{	
			saldo = saldo - cheque_entrou;
			JOptionPane.showMessageDialog(null,"Seu saldo atualizado = "+saldo);
			System.out.println("Seu saldo atualizado = "+saldo);
		}
		 
		 else
			{JOptionPane.showMessageDialog(null,"Esse cheque não pode ser descontado"+
		                                       "\nSeu saldo continua = "+saldo);
			System.out.println("Esse cheque não pode ser descontado"+
		                                       "\nSeu saldo continua = "+saldo);
			}

	}

}
