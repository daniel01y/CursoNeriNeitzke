package estudos.atividade;
import javax.swing.JOptionPane;
public class presta��o {

	public static void main(String[] args) {
		float presta��o,valor_prest,taxa;
		int dias_atraso;
		valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da presta��o ="));
		taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de taxa de juros = " ));
		dias_atraso = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias em atraso = "));
		
		presta��o = valor_prest + (valor_prest * (taxa / 100) * dias_atraso);
		JOptionPane.showMessageDialog(null,"Valor da presta��o = "+valor_prest
				                           +"\nTaxa = "+taxa
				                           +"\nDias em atraso = "+dias_atraso
				                           +"\nValor CORRIGIDO da presta��o = "+presta��o);
	}

}
