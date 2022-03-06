package estudos.atividade;
import javax.swing.JOptionPane;
public class Matriz_13questoes {

	public static void main(String[] args) {
				int mat4[][] = new int [4] [4];
				int matneri[][] = new int [4][4];
				int vetor_neri[] = new int [4];
				int l,c,maior=0,menor=99999,soma=0,media,com_media=0,conta_pares=0,conta_impares=0;
				String elem_vert="",elem_sec="",elem_13="",elem_c2="",mostra_com_media="",
				pos_maior="",pos_menor="",mostra_pares="",mostra_impares="",vet_neri="";
				String mensagem_mat4="",mensagem_mat5="",mensagem_matneri="",mensagem_mat6="";
				for (l=0;l<=3;l++)
					for (c=0;c<=3;c++)
					{
						mat4[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de mat4["+l+","+c+"] = "));
						soma = soma + mat4[l][c];
					}
				media = soma / 16;
				for (l=0;l<=3;l++)
					for (c=0;c<=3;c++)
					{
						mensagem_mat4 = mensagem_mat4 + "O valor de mat4["+l+","+c+"] = "+mat4[l][c]+"\n";
						if (mat4[l][c] > maior)
						{
							maior = mat4[l][c];
						pos_maior = "mat4["+l+"]["+c+"]";
						}
						if (mat4[l][c] < menor)
						{
							menor = mat4[l][c];
						pos_menor = "mat4["+l+"]["+c+"]";
						}
						if (l == c)
							elem_vert = elem_vert + mat4[l][c]+ " - ";
						if (c == (3 - l))
							elem_sec = elem_sec + mat4[l][c] +" - ";
						if (l == 2)
							elem_13 = elem_13 + mat4[l][c] +" - ";
						if (c == 1)
							elem_c2 = elem_c2 + mat4[l][c] + " - ";
						if (mat4[l][c] >= media)
						{
							com_media = com_media + 1;
							mostra_com_media = mostra_com_media + mat4[l][c] + " - ";
						}
						
						matneri[l][c] = mat4[l][c] * 2;
						if (mat4[l][c] % 2 == 0)
						{
							conta_pares = conta_pares + 1;
							mostra_pares = mostra_pares + mat4[l][c] + " - ";
						}
						else 
						{
							conta_impares = conta_impares + 1;
							mostra_impares = mostra_impares + mat4[l][c] + " - ";
						}
						if (l == 1)
						{
							vetor_neri[c] = mat4[l][c];
							vet_neri = vet_neri + vetor_neri[c];
						}		
					}
						mensagem_mat4 = mensagem_mat4 + "\nA soma dos elementos da matriz ="+soma;
						mensagem_mat4 = mensagem_mat4 + "\nA média dos valores da matriz ="+media;
						mensagem_mat4 = mensagem_mat4 + "\nElementos da diagonal principal ="+elem_vert;
						mensagem_mat4 = mensagem_mat4 + "\nElementos da diagonal secundária ="+elem_sec;
						mensagem_mat5 = mensagem_mat5 + "\nElementos da linha 3 ="+elem_13;
						mensagem_mat5 = mensagem_mat5 + "\nElementos da coluna 2 ="+elem_c2;
						mensagem_mat5 = mensagem_mat5 + "\n"+com_media+" elementos que atingiram a média,eles são ="+mostra_com_media;
						mensagem_mat5 = mensagem_mat5 + "\nO maior valor está em "+pos_maior+" e o menor está em "+pos_menor;
						for (l=0;l<=3;l++)
							for (c=0;c<=3;c++)
							{
								mensagem_matneri = mensagem_matneri +"\nO valor de matNeri["+l+"]["+c+"] = "+matneri[l][c];
							}
						mensagem_mat6 = mensagem_mat6 + "\n"+conta_pares+" são pares,são eles = "+mostra_pares;
						mensagem_mat6 = mensagem_mat6 + "\n"+ conta_impares+" são ímpares,são eles ="+mostra_impares;
						mensagem_mat6 = mensagem_mat6 + "\nO vetor neri possui os elementos ="+vet_neri;
						JOptionPane.showMessageDialog(null, mensagem_mat4);
						JOptionPane.showMessageDialog(null, mensagem_mat5);
						JOptionPane.showMessageDialog(null, mensagem_mat6);
						JOptionPane.showMessageDialog(null,mensagem_matneri);
	}

}
