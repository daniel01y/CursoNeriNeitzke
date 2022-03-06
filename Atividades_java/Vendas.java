package estudos.atividade;
import javax.swing.JOptionPane;
public class Vendas {
	

	public static void main(String[] args) {
	
	float fixo, comissao, vendas_mes, salario_total;
	fixo = 800;
	vendas_mes = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de vendas no mes"));
	comissao = (vendas_mes * 15) / 100;
	salario_total = fixo + comissao;
	JOptionPane.showMessageDialog(null,
			"O salario fixo = "+fixo+
			"\nA comissao = "+comissao+
			"\nO salario total = " + salario_total);
		
	}

}
