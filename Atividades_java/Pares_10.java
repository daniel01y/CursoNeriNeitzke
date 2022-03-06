package estudos.atividade;
import javax.swing.JOptionPane;

public class Pares_10 {

	public static void main(String[] args) {
		int conta_pares = 0,numero = 1;
		String mensagem = "";
		while (conta_pares < 10)
		{
			if (numero % 2 == 0)
			{
				mensagem = mensagem + "O numero "+numero+" é par\n";
				conta_pares = conta_pares + 1;
			}
			numero = numero + 1;
		}
        JOptionPane.showMessageDialog(null,mensagem);
        System.out.println(mensagem);
	}

}
