package estudos.atividade;
import javax.swing.JOptionPane;
public class Matriz_3x3_maior_menor {

	public static void main(String[] args) {
		int exerc_matriz[][] = new int [3][3];
		int maior=0,menor=99999;
		String msg="";
		for (int l=0;l<=2;l++)
			for (int c=0;c<=2;c++)
				{
					exerc_matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para exerc_matriz ["+l+","+c+"] = "));
					msg = msg + "\nO valor de exerc_matriz["+l+","+c+"] = "+exerc_matriz[l][c];
				}
		for (int l=0;l<=2;l++)
			for (int c=0;c<=2;c++)
			{
		if (exerc_matriz[l][c] > maior)
			maior = exerc_matriz[l][c];
		if (exerc_matriz[l][c] < menor)
			menor = exerc_matriz[l][c];
			}
		msg = msg + "\nO maior valor � o valor("+maior+")";
		msg = msg + "\nO menor valor � o valor("+menor+")";
			JOptionPane.showMessageDialog(null, msg);
			System.out.println(msg);
	}

}
