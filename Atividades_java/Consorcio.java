package estudos.atividade;
import javax.swing.JOptionPane;

public class Consorcio {

	public static void main(String[] args) {
	int total_prest,qtd_prest_pagas;
	float valor_prest,total_pago,saldo_devedor;
	total_prest = Integer.parseInt(JOptionPane.showInputDialog("Digite o total das prestações = "));
	qtd_prest_pagas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de prestações pagas = "));
	valor_prest = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das prestações = "));
    
	total_pago = qtd_prest_pagas * valor_prest;
	saldo_devedor = valor_prest * (total_prest - qtd_prest_pagas);
	JOptionPane.showMessageDialog(null,"Total de prestações = "+total_prest
			+ "\nQuantidade de prestações pagas = "+qtd_prest_pagas
			+ "\nValor de prestação = "+valor_prest
			+ "\nTotal pago = "+total_pago
			+"\nSaldo devedor = "+saldo_devedor);
	}

}
