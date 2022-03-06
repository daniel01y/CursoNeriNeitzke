package estudos.atividade;
import javax.swing.JOptionPane;
public class Contador {

	public static void main(String[] args) {
		String mensagem="";
		int cont,n,s,maior,menor;
		s = 0;
		cont = 1;
		maior = 0;
		menor = 1000000000;
		while (cont <= 10)
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+cont+". valor = "));
			if (n > maior)
				maior = n;
			if(n < menor)
				menor = n;
			s = s + n;
			cont = cont + 1;
		}
            mensagem = mensagem + "A soma de todos os valores é "+s+
            		               ",E o maior valor digitado foi = "+maior+
            		               ",E o menor valor digitado foi = "+menor;		
 			JOptionPane.showMessageDialog(null,mensagem);
 			System.out.println(mensagem);
	}

}
