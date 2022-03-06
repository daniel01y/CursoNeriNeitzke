package estudos.atividade;
import javax.swing.JOptionPane;
public class Vendas2 {
	

	public static void main(String[] args) {
	
	float fixo, bonus, qtd_softw_vend, salario_total;
	fixo = 500;
    qtd_softw_vend = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de software vendida = "));
    bonus = qtd_softw_vend * 50;
    salario_total = fixo + bonus;
    JOptionPane.showMessageDialog(null,"O salario fixo = "+fixo+
                                       "\nO bonus  = "+bonus+
                                       "\nO salario total = "+salario_total);
		
	}

}
