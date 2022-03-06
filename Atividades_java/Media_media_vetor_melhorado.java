package estudos.atividade;
import javax.swing.JOptionPane;
public class Media_media_vetor_melhorado {

	public static void main(String[] args) {
		 					
				float nota[] = new float[5];
				float calc_media,soma_notas;
				int contador;
				String msg="";
				contador = 0;
				soma_notas = 0;
				for (int i=0;i<=4;i++)
				{
				nota[i]	= Float.parseFloat(JOptionPane.showInputDialog("Digite a "+i+". nota: "));
				soma_notas = soma_notas + nota[i];	
				}
				calc_media = soma_notas / 5;
				for (int i = 0;i<=4;i++)
					if (nota[i] >= calc_media)
					contador = contador + 1;
				msg = msg + "A média é "+calc_media+"\n"+contador+" Aluno(s) ficaram com a nota acima da média";
				JOptionPane.showMessageDialog(null, msg);
				System.out.println(msg);

	}

}
