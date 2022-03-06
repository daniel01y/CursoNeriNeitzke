package estudos.atividade;
import javax.swing.JOptionPane;
public class Tabuada_do_while{

	public static void main(String[] args) {
		int numero,i;
		String mensagem = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero = "));
            i = 1;
            do
    {
		    mensagem = mensagem + "\n"+numero+" x "+i+" = "+(numero * i);
            i++;
	}
            while(i <= 10);
    		System.out.println(mensagem);
    		JOptionPane.showMessageDialog(null,mensagem);
			}

	}
