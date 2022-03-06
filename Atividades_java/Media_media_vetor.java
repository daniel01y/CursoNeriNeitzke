package estudos.atividade;
import javax.swing.JOptionPane;
public class Media_media_vetor {

	public static void main(String[] args) {
							
				float nota [] = new float[5];
				float calc_media,soma_notas;
				int contador=0;
				String mensagem="";
				
				nota[0] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1. nota = "));
				nota[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2. nota = "));
				nota[2] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3. nota = "));
				nota[3] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 4. nota = "));
				nota[4] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 5. nota = "));
				soma_notas = nota[0] + nota[1] + nota[2] + nota[3] + nota[4];
				calc_media = soma_notas / 5;
				if (nota[0] > calc_media)
					contador = contador + 1;
				if (nota[1] > calc_media)
					contador = contador + 1;
				if (nota[2] > calc_media)
					contador = contador + 1;
				if (nota[3] > calc_media)
					contador = contador + 1;
				if (nota[4] > calc_media)
					contador = contador + 1;
				mensagem = mensagem + "\nA média é "+calc_media+"\n";
				mensagem = mensagem + "\n"+contador+" Aluno(s) ficaram com nota acima da média";
				mensagem = mensagem + "\n\n................fim................";
				JOptionPane.showMessageDialog(null, mensagem);
				System.out.println(mensagem);
				//\n\n................fim................"
				//"\nA média é "+calc_media+"
				//"\n\n"+contador+" Alunos ficaram com nota acima da média
	}

}