package estudos.atividade;
import javax.swing.JOptionPane;
public class Media_media {

	public static void main(String[] args) {
							
				float nota1,nota2,nota3,nota4,nota5,calc_media,soma_notas=0;
				int contador=0;
				String mensagem="";
				
				nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1. nota = "));
				nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2. nota = "));
				nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3. nota = "));
				nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 4. nota = "));
				nota5 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 5. nota = "));
				soma_notas = nota1 + nota2 + nota3 + nota4 + nota5;
				calc_media = soma_notas / 5;
				if (nota1 > calc_media)
					contador = contador + 1;
				if (nota2 > calc_media)
					contador = contador + 1;
				if (nota3 > calc_media)
					contador = contador + 1;
				if (nota4 > calc_media)
					contador = contador + 1;
				if (nota5 > calc_media)
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
