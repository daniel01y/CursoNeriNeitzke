package estudos.atividade;
import javax.swing.JOptionPane;
public class Media_para {

	public static void main(String[] args) {
		
		float nota,calc_media=0,soma_notas=0;
		int i;
		for (i=1;i<=10;i++)
		{
			nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a"+i+". nota de 10 notas.Somente nota de 0 a 10"));
			if ((nota >= 0) && (nota <= 10))
				soma_notas = soma_notas + nota;
			else
			{
				JOptionPane.showMessageDialog(null,"\nNota inválida,digite apenas notas entre 0 e 10\n");
				i--;
			}
		}
		        calc_media = soma_notas / 10;
                JOptionPane.showMessageDialog(null,"A media geral das notas = "+calc_media);
	}

}
