package estudos.atividade;
import javax.swing.JOptionPane;

public class Modularizando_subalgoritmos {
	static float num1, num2, soma, multiplicacao, subtracao, divisao;
	public static void main(String[] args) 
	{
    leitura();
    calculos();
    imprimir();
	}
	public static void leitura()
	{
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 1"));
	    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 2"));
	}
	public static void calculos()
	{
		soma = num1 + num2;
	    subtracao = num1 - num2;
	    divisao = num1 / num2;
	    multiplicacao = num1 * num2;
	}
	public static void imprimir()
	{
	JOptionPane.showMessageDialog(null,"A soma = "+soma+ "\nA subtracao = "+subtracao+
		    "\nA multiplicacao = "+multiplicacao+ "\nA divisao = "+divisao);	
	}

}