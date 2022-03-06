package estudos.atividade;
import javax.swing.JOptionPane;
public class prestação {

	public static void main(String[] args) {
		float prestação,valor_prest,taxa;
		int dias_atraso;
		valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da prestação ="));
		taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de taxa de juros = " ));
		dias_atraso = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias em atraso = "));
		
		prestação = valor_prest + (valor_prest * (taxa / 100) * dias_atraso);
		JOptionPane.showMessageDialog(null,"Valor da prestação = "+valor_prest
				                           +"\nTaxa = "+taxa
				                           +"\nDias em atraso = "+dias_atraso
				                           +"\nValor CORRIGIDO da prestação = "+prestação);
	}

}
