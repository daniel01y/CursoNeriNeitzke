package estudos.atividade;
import javax.swing.JOptionPane;

public class Consorcio {

	public static void main(String[] args) {
	int total_prest,qtd_prest_pagas;
	float valor_prest,total_pago,saldo_devedor;
	total_prest = Integer.parseInt(JOptionPane.showInputDialog("Digite o total das presta��es = "));
	qtd_prest_pagas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de presta��es pagas = "));
	valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das presta��es = "));
    
	total_pago = qtd_prest_pagas * valor_prest;
	saldo_devedor = valor_prest * (total_prest - qtd_prest_pagas);
	JOptionPane.showMessageDialog(null,"Total de presta��es = "+total_prest
			+ "\nQuantidade de presta��es pagas = "+qtd_prest_pagas
			+ "\nValor de presta��o = "+valor_prest
			+ "\nTotal pago = "+total_pago
			+"\nSaldo devedor = "+saldo_devedor);
	}

}
