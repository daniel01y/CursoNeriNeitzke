package estudos.atividade;
import javax.swing.JOptionPane;

public class Abc_crescente {

	public static void main(String[] args) {
		{
			int a, b, c;
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a"));
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b"));
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c"));
			if ((a <= b) && (a <= c))
			if (b <= c)
			JOptionPane.showMessageDialog(null,"Em ordem crescente ficou = "+a+"-"+b+"-"+c);
			else
			JOptionPane.showMessageDialog(null,"Em ordem crescente ficou = "+a+"-"+c+"-"+b);
			else if ((b <= a) && (b <= c))
			if (a <= c)
			JOptionPane.showMessageDialog(null,"Em ordem crescente ficou = "+b+"-"+a+"-"+c);
			else
			JOptionPane.showMessageDialog(null,"Em ordem crescente ficou = "+b+"-"+c+"-"+a);
		    else if (a <= b)
		    JOptionPane.showMessageDialog(null,"Em ordem crescente ficou = "+c+"-"+a+"-"+b);
		    else
		    JOptionPane.showMessageDialog(null,"Em ordem crescente ficou = "+c+"-"+b+"-"+a);
			JOptionPane.showMessageDialog(null,"\n\n\n............FIM..........");
		    
		}

	}

}
