package estudos.atividade;
import javax.swing.JOptionPane;
public class Vetor_crescente {

	public static void main(String[] args) {
		         	int a[] = {50,14,21};
		         	int aux;
		         	String msg="";
		         	msg = msg + "O valor de a[1] = "+a[0]+
		         				"\nO valor de a[2] = "+a[1]+
		         				"\nO valor de a[3] = "+a[2];
		         	for (int j=0;j<=1;j++)
		         	for (int i=0;i<=1;i++)
		         	{
		         		if (a[i] > a[i + 1])
		         		{
		         			aux = a[i];
		         			a[i] = a[i + 1];
		         			a[i + 1] = aux;
		         					
		         		}
		         	}
		         	msg = msg + "\n\nReagrupados em ordem crescente = \na[1] = "+a[0]+"\na[2] = "+a[1]+"\na[3] = "+a[2];
		         	JOptionPane.showMessageDialog(null,msg);
		         	System.out.println(msg);
	}

}
