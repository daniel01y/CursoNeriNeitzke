package estudos.atividade;
import javax.swing.JOptionPane;

public class Dados_Salario_Nome_Idade {

	public static void main(String[] args) {
    float salario;
    int idade;
    String nome;
    
    nome = JOptionPane.showInputDialog("Digite o nome");
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
    salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário"));
    
    System.out.println("O nome = "+nome);
    System.out.println("A idade = "+idade);
    System.out.println("O salario = "+salario);
   
	}

}
