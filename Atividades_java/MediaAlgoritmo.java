package estudos.atividade;
import javax.swing.JOptionPane;


public class MediaAlgoritmo {

	public static void main(String[] args) 
	{
		float nota1,nota2,calc_media;
	nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota" ));
    calc_media = (nota1 + nota2) / 2;
    System.out.println("A media = "+calc_media);
	}

}
