package estudos.atividade;
import javax.swing.JOptionPane;
public class Vetores_troca_5 {

	public static void main(String[] args) {
		int a[] = {9,3,7,6,21};
		int b[] = {50,45,36,2,14};
		int c[] = new int[5] ;
		int i;
		String msg="";
		msg = msg + ".........VALORES.A.........";
		for (i=0;i<=4;i++)
		msg = msg + "\nO valor original de A["+i+"] é "+a[i];
		msg = msg + "\n\n.........VALORES.B.........";
		for (i=0;i<=4;i++)
		msg = msg + "\nO valor original de B["+i+"] é "+b[i];
		for (i=0;i<=4;i++)
		{
		c[i] = a[i];
	 	a[i] = b[i];
	  	b[i] = c[i];
		}
		msg = msg + "\n.........VALORES.A.........";
		for (i=0;i<=4;i++)
		msg = msg + "\nO valor atualizado de A["+i+"] é = "+a[i];
		msg = msg + "\n\n.........VALORES.B.........";
		for (i=0;i<=4;i++)
		msg = msg + "\nO valor atualizado de B["+i+"] é = "+b[i];
		JOptionPane.showMessageDialog(null,msg);
		System.out.println(msg);

	}

}
