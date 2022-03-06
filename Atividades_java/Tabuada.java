package estudos.atividade;
import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para tabuada de multiplicacao de 1 a 10 = "));
		JOptionPane.showMessageDialog(null,"O numero digitado = "+numero);
		JOptionPane.showMessageDialog(null,"\n"+numero + " x 1 = "+(numero * 1)+
			                               "\n"+numero + " x 2 = "+(numero * 2)+
				                           "\n"+numero + " x 3 = "+(numero * 3)+
				                           "\n"+numero + " x 4 = "+(numero * 4)+
				                           "\n"+numero + " x 5 = "+(numero * 5)+
				                           "\n"+numero + " x 6 = "+(numero * 6)+
				                           "\n"+numero + " x 7 = "+(numero * 7)+
				                           "\n"+numero + " x 8 = "+(numero * 8)+
				                           "\n"+numero + " x 9 = "+(numero * 9)+
				                           "\n"+numero + " x 10 = "+(numero * 10));
		System.out.println("\n"+numero + " x 1 = "+(numero * 1)+
                "\n"+numero + " x 2 = "+(numero * 2)+
                "\n"+numero + " x 3 = "+(numero * 3)+
                "\n"+numero + " x 4 = "+(numero * 4)+
                "\n"+numero + " x 5 = "+(numero * 5)+
                "\n"+numero + " x 6 = "+(numero * 6)+
                "\n"+numero + " x 7 = "+(numero * 7)+
                "\n"+numero + " x 8 = "+(numero * 8)+
                "\n"+numero + " x 9 = "+(numero * 9)+
                "\n"+numero + " x 10 = "+(numero * 10));
		JOptionPane.showMessageDialog(null,"____________FIM___________");
		System.out.println("__________FIM_________");
		//JOptionPane.showMessageDialog(null,numero + " x 1 = "+(numero * 1));
		//JOptionPane.showMessageDialog(null,numero + " x 2 = "+(numero * 2));
		//JOptionPane.showMessageDialog(null,numero + " x 3 = "+(numero * 3));
		//JOptionPane.showMessageDialog(null,numero + " x 4 = "+(numero * 4));
		//JOptionPane.showMessageDialog(null,numero + " x 5 = "+(numero * 5));
		//JOptionPane.showMessageDialog(null,numero + " x 6 = "+(numero * 6));
		//JOptionPane.showMessageDialog(null,numero + " x 7 = "+(numero * 7));
		//JOptionPane.showMessageDialog(null,numero + " x 8 = "+(numero * 8));
		//JOptionPane.showMessageDialog(null,numero + " x 9 = "+(numero * 9));
		//JOptionPane.showMessageDialog(null,numero + " x 10 = "+(numero * 10));

	}

}
