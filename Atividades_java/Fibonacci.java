package estudos.atividade;
import javax.swing.JOptionPane;
public class Fibonacci {

	public static void main(String[] args) {
		
		int num_anterior,num_atual,novo_numero,i;
		String mensagem="O 1. número fibonacci é 1\n";
		
		num_anterior = 0;
		num_atual = 1;
		for (i=2;i<=10;i++)
			{
				novo_numero = num_atual + num_anterior;
				num_anterior = num_atual;
				num_atual = novo_numero;
				mensagem = mensagem + "\nO "+i+". número Fibonacci é "+novo_numero+"\n";
			}
				JOptionPane.showMessageDialog(null, mensagem);
	    		System.out.println(mensagem);      										
	}

}
