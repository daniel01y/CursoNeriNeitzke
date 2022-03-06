package estudos.atividade;
import javax.swing.JOptionPane;
public class Par_impar_conta_2 {

	public static void main(String[] args) {
		int numero_inicial,numero_final,numeros_pares,numeros_impares,i;
		String mensagem="";
		numeros_pares = 0;
		numeros_impares = 0;
		numero_inicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero incial = "));
		i = numero_inicial;
		do
		{
			numero_final = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero final maior que o "+numero_inicial+" = "));
			if (numero_final < numero_inicial)
				JOptionPane.showMessageDialog(null,"Numero final invalido,deve ser maior que o inicial\n");
		}  
		while (numero_final < numero_inicial);
		
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
