package estudos.atividade;
import javax.swing.JOptionPane;
public class Maior_menor_vetor {

	public static void main(String[] args) {
				
					int maior_menor[] = {2,3,7,8,5,9,1,0,6,4};
					int i,maior,menor;
					String msg="";
					maior = 0;
					menor = 999;
					for (i = 0;i<=9;i++)
					{
						if (maior_menor[i] > maior)
							maior = maior_menor[i];
						if (maior_menor[i] < menor)
							menor = maior_menor[i];
					}
					msg = msg + "O maior valor é ("+maior+")";
					msg = msg + "\nO menor valor é ("+menor+")";
					JOptionPane.showMessageDialog(null,msg);
					System.out.println(msg);
	}

}
