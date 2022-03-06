package estudos.atividade;
import javax.swing.JOptionPane;

public class Operações {

	public static void main(String[] args) {
    float num1, num2, soma, multiplicacao, subtracao, divisao;
    num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 1"));
    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 2"));
    
    soma = num1 + num2;
    subtracao = num1 - num2;
    divisao = num1 / num2;
    multiplicacao = num1 * num2;
    JOptionPane.showMessageDialog(null,"A soma = "+soma+ "\nA subtracao = "+subtracao+
    "\nA multiplicacao = "+multiplicacao+ "\nA divisao = "+divisao);			
	}

}
