package estudos.atividade;
import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		
			float le, ld, li;
			le = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento do lado esquerdo = "));
			ld = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento do lado direito = "));
			li = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento do lado inferior = "));
			if ((li < (le + ld)) && (le < (ld + li)) && (ld < (li + le))) 
			    if ((le == ld) && (le == li))
			JOptionPane.showMessageDialog(null,"É um triângulo equilátero");
			else if ((li == ld) || (li == le) || (le == ld))
			JOptionPane.showMessageDialog(null,"É um triângulo isósceles");
			else 
			JOptionPane.showMessageDialog(null,"É um triângulo escaleno");
			
			else
			JOptionPane.showMessageDialog(null,"Nao e um triangulo");
			JOptionPane.showMessageDialog(null,"\n\n\n.............fim.............");   
			

	}

}
