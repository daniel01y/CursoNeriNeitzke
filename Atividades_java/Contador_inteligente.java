package estudos.atividade;
import javax.swing.JOptionPane;
public class Contador_inteligente {

	public static void main(String[] args) {
                                      
		String mensagem="";
		int cont,n1,s,maior,menor;
		s = 0;
		cont = 1;
		cont = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de partida = "));
		maior = 0;
		menor = 1000000000;
		
		while (cont <= 10)
		{
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+cont+". valor = "));
			if (n1 > maior)
				maior = n1;
			if(n1 < menor)
				menor = n1;
			s = s + n1;
			cont = cont + 1;
		}
		while (cont >= 10)
		{
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+cont+". valor = "));
			if (n1 > maior)
				maior = n1;
			if(n1 < menor)
				menor = n1;
			s = s + n1;
			cont = cont - 1;
		}
            mensagem = mensagem + "A soma de todos os valores é "+s+
            		               ",E o maior valor digitado foi = "+maior+
            		               ",E o menor valor digitado foi = "+menor;		
 			JOptionPane.showMessageDialog(null,mensagem);
 			System.out.println(mensagem);         			
	}

}
