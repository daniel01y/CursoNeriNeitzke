package estudos.atividade;
import javax.swing.JOptionPane;

public class Modularizando_subalgoritmos_parametros {
	static float num1, num2, soma, multiplicacao, subtracao, divisao;
	public static void main(String[] args) 
	{
    leitura();
    calculos(num1,num2);
    imprimir(multiplicacao,divisao,subtracao,soma);
	}
	public static void leitura()
	{
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 1"));
	    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 2"));
	}
	public static void calculos(float pn1,float pn2)
	{
		soma = pn1 + pn2;
	    subtracao = pn1 - pn2;
	    divisao = pn1 / pn2;
	    multiplicacao = pn1 * pn2;
	}
	public static void imprimir(float mult,float div,float sub,float som)
	{
	JOptionPane.showMessageDialog(null,"A soma = "+som+ "\nA subtracao = "+sub+
		    "\nA multiplicacao = "+mult+"\nA divisao = "+div);	
	}

}