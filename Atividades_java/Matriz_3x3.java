package estudos.atividade;
import javax.swing.JOptionPane;
public class Matriz_3x3 {

	public static void main(String[] args) {
		int exerc_matriz[][] = new int [3][3];
		String msg="";
		for (int l=0;l<=2;l++)
			for (int c=0;c<=2;c++)
				{
					exerc_matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para exerc_matriz ["+l+","+c+"] = "));
					msg = msg + "\nO valor de exerc_matriz["+l+","+c+"] = "+exerc_matriz[l][c];
				}
			JOptionPane.showMessageDialog(null, msg);
			System.out.println(msg);
	}

}
