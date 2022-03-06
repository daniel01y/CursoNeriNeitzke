package estudos.atividade;
import javax.swing.JOptionPane;

public class Subalgoritmos_metodos {
	static float num1, num2, soma, multiplicacao, subtracao, divisao;
	public static void main(String[] args) 
	{
    leitura();
    JOptionPane.showMessageDialog(null,"A soma = "+somar(num1,num2)+ "\nA subtracao = "+subtrair(num1,num2)+
		    "\nA multiplicacao = "+multiplicar(num1,num2)+"\nA divisao = "+dividir(num1,num2));
	}
	public static void leitura()
	{
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 1"));
	    num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor numero 2"));
	}
	public static float somar(float pn1,float pn2)
	{
		soma = pn1 + pn2;
	    return soma; 
	}
	public static float subtrair(float pn1,float pn2)
	{
		subtracao = pn1 - pn2;
		return subtracao;
	}
	public static float multiplicar(float pn1,float pn2)
	{
		multiplicacao = pn1 * pn2;
		return multiplicacao;
	}
	public static float dividir(float pn1,float pn2)
	{
		divisao = pn1 / pn2;
		return divisao;
	}
}