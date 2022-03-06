package estudos.atividade;
import javax.swing.JOptionPane;
public class Tabuada_While{

	public static void main(String[] args) {
		int numero,i;
		String mensagem = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero = "));
            i = 1;
            while (i <= 10)
    {
		    mensagem = mensagem + "\n"+numero+" x "+i+" = "+(numero * i);
            i++;
	}
    		System.out.println(mensagem);
    		JOptionPane.showMessageDialog(null,mensagem);
			}

	}
