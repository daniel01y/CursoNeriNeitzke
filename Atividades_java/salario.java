package estudos.atividade;
import javax.swing.JOptionPane;
public class salario {

	public static void main(String[] args) {
		float salario_liquido,salario_bruto,inss;
		String nome;
		nome = JOptionPane.showInputDialog("Digite o nome do funcionario = ");
		salario_bruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o sal�rio bruto = "));
		inss = (salario_bruto * 9 ) / 100;
		salario_liquido = salario_bruto - inss;
		JOptionPane.showMessageDialog(null,"O nome do funcion�rio = "+nome+
				                           "\nO sal�rio bruto do funcion�rio = "+salario_bruto+
				                           "\nO inss = "+inss+
				                           "\nO sal�rio liquido do funcion�rio = "+salario_liquido);

	}

}
