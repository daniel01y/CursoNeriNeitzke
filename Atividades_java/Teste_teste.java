package estudos.atividade;
import javax.swing.JOptionPane;
public class Teste_teste {

	public static void main(String[] args) {
		int a,b,c,numeros_conta,impares,pares,ia,ib,juncao_pares,juncao_impares;
		String mensagem="";
		
		impares = 0;
		pares = 0;
		juncao_impares = 0;
		juncao_pares = 0;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para vari�vel A = "));
		do
		{
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para vari�vel B maior que A = "));
			if (b < a)
				JOptionPane.showMessageDialog(null,"Numero vari�vel B inv�lida,deve ser maior que vari�vel A\n");
		}
		while (b < a);
		
		do
		{
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para vari�vel C maior que A e B = "));
			if (c < b)
				JOptionPane.showMessageDialog(null,"Numero vari�vel C inv�lido,deve ser maior que vari�vel B\n");
		}
		while (c < b);
		ia = a;
		ib = b;
		numeros_conta = a + b + c;
		while (ia < ib)
		{
			if (ia % 2 == 0)
				pares = pares + 1;
			else 
				impares = impares + 1;
			
			ia++;
		}
		while (ib < c)
		{
			if (ib % 2 == 0)
				juncao_pares = juncao_pares + 1;
			else
				juncao_impares = juncao_impares + 1;
			
			ib++;
		}
		mensagem = mensagem + "Entre os numeros "+a+" e "+b+" existem "+pares+" pares e "+impares+" impares. \nE entre os numeros "+b+" e "+c+" existem "+juncao_pares+" pares e "+juncao_impares+" impares. \nN�meros apresentados "+numeros_conta+".";
		JOptionPane.showMessageDialog(null, mensagem);
		System.out.println(mensagem);
	}

}
