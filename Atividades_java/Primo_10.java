package estudos.atividade;
import javax.swing.JOptionPane;
public class Primo_10 {

	public static void main(String[] args) {
		
		int contador,numero,i;
		boolean num_primo;
		String mensagem="";
		num_primo = true;
		numero = 1;
		contador = 0;
		while (contador < 10)
		{
			num_primo = true;
			numero = numero + 1;
			i = 2;
			while ((i <= (numero / 2)) && (num_primo == true))
			{
				if (numero % i == 0)
					num_primo = false;
				    i = i + 1;
			}
		if (num_primo)
		{
			contador = contador + 1;
			mensagem = mensagem + "\nO número "+numero+" e o "+contador+". número primo\n";
		}
		}
		JOptionPane.showMessageDialog(null, mensagem);
		System.out.println(mensagem);
	    }
        }
