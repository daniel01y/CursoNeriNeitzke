package estudos.atividade;
import javax.swing.JOptionPane;
public class Vetor_crescente_15 {

	public static void main(String[] args) {
     	int a[] = {50,21,14,100,5,3,87,23,8,26,48,18,78,5,20};
     	int aux;
     	String msg="";
     	for(int i=0;i<=14;i++)
     	msg = msg + "O valor de a["+i+"] = "+a[i]+"\n";
     	for (int j=0;j<=13;j++)
     	for (int i=0;i<=13;i++)
     		if (a[i] > a[i + 1])
     		{
     			aux = a[i];
     			a[i] = a[i + 1];
     			a[i + 1] = aux;
     					
     		}
     	for(int i=0;i<=14;i++)
         	msg = msg + "\nO valor reordenado de a["+i+"] = "+a[i];
     	JOptionPane.showMessageDialog(null,msg);
     	System.out.println(msg);
		

	}

}
