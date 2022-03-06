package estudos.atividade;
import javax.swing.JOptionPane;
public class Tabuada_PARA {

	public static void main(String[] args) {
		int numero,i;
		String mensagem = "";
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero = "));
/*		JOptionPane.showMessageDialog(null,"Numero digitado = "+numero);
		System.out.println("Numero digitado = "+numero); 
		for (i=0;i <= 10;i=i+1)
		    JOptionPane.showMessageDialog(null,"\n"+numero+" x "+i+" = "+(numero * i)); */ 
		for(i=0;i <= 10;i=i+1)  
		    mensagem = mensagem + "\n"+numero+" x "+i+" = "+(numero * i);
		System.out.println(mensagem);
		JOptionPane.showMessageDialog(null,mensagem);
	}

	}


