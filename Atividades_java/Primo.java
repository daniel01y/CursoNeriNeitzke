package estudos.atividade;
import javax.swing.JOptionPane;
public class Primo {

	public static void main(String[] args) {
	                  
		int numero,i,contador;
		String mensagem="";
		contador = 0;
		i = 2;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero = "));
		while (i < numero)
		{
			if (numero % i == 0)
			contador = contador + 1;
		i = i + 1;
	     } 
		if (contador > 0)
		mensagem = mensagem + "O número "+numero+" não é primo";
		else
	    mensagem = mensagem + "O número "+numero+" é primo";
		
		JOptionPane.showMessageDialog(null, mensagem);
		System.out.println(mensagem);
		mensagem = mensagem + "\n\n>>>>FIM<<<<";	

	}

}
