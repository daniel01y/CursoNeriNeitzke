package estudos.atividade;
import javax.swing.JOptionPane;
public class Desconto {

	public static void main(String[] args) {
		float valor_compra,valor_pagar;
		int desconto;
		String nome;
		nome = JOptionPane.showInputDialog("Digite o nome do cliente = ");
		valor_compra = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra = "));
		
		if (valor_compra <= 200)
			desconto = 10;
		else if (valor_compra <= 500)
				desconto = 15;
		else desconto = 20;
		
		valor_pagar = valor_compra - desconto;
		JOptionPane.showMessageDialog(null,"Nome do cliente = "+nome+
				                           "\nValor da compra = "+valor_compra+
				                           "\nValor do desconto = "+desconto+
				                            "\nValor a pagar = "+valor_pagar);
		System.out.println("Nome do cliente = "+nome+
                "\nValor da compra = "+valor_compra+
                "\nValor do desconto = "+desconto+
                 "\nValor a pagar = "+valor_pagar);
		//valor_desconto = (valor_compra * desconto) / 100; váriavel valor desconto estava
		//sendo usado,porém não vi necessidade e tirei do código

	}

}
