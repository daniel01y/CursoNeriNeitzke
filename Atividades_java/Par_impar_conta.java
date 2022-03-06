package estudos.atividade;
import javax.swing.JOptionPane;
public class Par_impar_conta {

	public static void main(String[] args) {
		int numero_inicial,numero_final,numeros_pares,numeros_impares,i;
		String mensagem="";
		numeros_pares = 0;
		numeros_impares = 0;
		numero_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero incial = "));
		i = numero_inicial;
		numero_final = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero final = "));  
		while (i <= numero_final)
	    {
	    	if (i % 2 == 0)
	    	numeros_pares++;
	    	else
	    	numeros_impares++;
	    	i++;
		}
		mensagem = mensagem + "Entre o numero "+numero_inicial+" e o numero "+numero_final+" existem "+numeros_pares+" par(es) e "+numeros_impares+" impar(es)";
        JOptionPane.showMessageDialog(null,mensagem);
        System.out.println(mensagem);
	}

}
