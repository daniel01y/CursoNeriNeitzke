package estudos.atividade;
import javax.swing.JOptionPane;
public class AvaliaçãoDeMedia {

	public static void main(String[] args) {
		float prova1,prova2,prova3,media;
		prova1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da primeira prova = "));
		prova2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da segunda prova = "));
		prova3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o a nota da terceira prova"));
		
		prova1 = prova1 * 2 / 10;
		prova2 = prova2 * 3 / 10;
		prova3 = prova3 * 5 / 10;
		media = (prova1 + prova2 + prova3);
		if (media >= 60)
				JOptionPane.showMessageDialog(null,"Aprovado com media "+media);
		else 
			    JOptionPane.showMessageDialog(null,"Reprovado com media "+media);
		JOptionPane.showMessageDialog(null,"\nNota da prova1 = "+prova1
				                           +"\nNota da prova2 = "+prova2
				                           +"\nNota da prova3 = "+prova3);
				
	}

}
