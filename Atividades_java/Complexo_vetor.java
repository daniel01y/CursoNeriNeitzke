package estudos.atividade;

import javax.swing.JOptionPane;

public class Complexo_vetor {

	public static void main(String[] args) {
		float vetor5[] = {9,3,-7,8,5};
		float media=0,soma=0,iguais_maior=0,perc_maior=0,qtd_pos=0,qtd_neg=0;
		int i;
		String msg="";
		for (i=0;i<=4;i++)
		soma = soma + vetor5[i];
		media = soma / 5;
		for (i=0;i<=4;i++)
		{
			if (vetor5[i] >= media)
			iguais_maior = iguais_maior + 1;
			if (vetor5[i] >= 0)
			qtd_pos = qtd_pos + 1;
			else 
			qtd_neg = qtd_neg + 1;
			msg = msg + "\nO vetor5["+i+"] corresponde ao valor = "+vetor5[i]+"\n";
		}
		perc_maior = (iguais_maior * 100) / 5;
		msg = msg + "\nA soma foi "+soma;
		msg = msg + "\nA media foi "+media;
		msg = msg + "\n"+iguais_maior+" sao maiores ou iguais a media";
		msg = msg + "\n"+qtd_pos+" sao positivos";
		msg = msg + "\n"+qtd_neg+" sao negativos";
		msg = msg + "\n"+perc_maior+"% O percentual de maiores que a media";
		JOptionPane.showMessageDialog(null, msg);
		System.out.println(msg);
	}

}
