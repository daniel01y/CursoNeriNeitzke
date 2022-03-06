package estudos.atividade;
import javax.swing.JOptionPane;
public class Primo_logico {

	public static void main(String[] args) {
        
		int numero,i;
		boolean contador = true;
		String mensagem="";
		i = 2;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero = "));
		while ((i < (numero / 2)) && (contador == true))
		{
			System.out.println(i);
			if (numero / i == 0)
			contador = false;
		i = i + 1;
	     } 
		if (contador == false)
		mensagem = mensagem + "O número "+numero+" não é primo";
		else
	    mensagem = mensagem + "O número "+numero+" é primo";
		
		JOptionPane.showMessageDialog(null, mensagem);
		System.out.println(mensagem);
		mensagem = mensagem + "\n\n>>>>FIM<<<<";	
		System.out.println(mensagem);

	}

}
