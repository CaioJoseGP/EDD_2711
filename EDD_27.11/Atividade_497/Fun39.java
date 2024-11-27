package Atividade_497;

import javax.swing.JOptionPane;

public class Fun39 {
    public static void main(String[] args) {
        int L, c, n;
        int[] num = new int[10];

        for(L = 0; L < 10; L++) {
            num[L] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite num %d: ", L + 1)));
        }

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite num de busca: "));
        ordena(num, 10);
        c = busca(num, 10, n);

        StringBuilder resultado = new StringBuilder("VETOR:\n");

        for (L = 0; L < 10; L++) {
            resultado.append(String.format("%d - %d\n", L + 1, num[L]));
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
        
        c++;

        if(c != 0) {
            JOptionPane.showMessageDialog(null, String.format("Posição no vetor: %d", c));

        } else {
            JOptionPane.showMessageDialog(null, "NÃO ENCONTRADO");
        }
    }

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0, meio, fim = tam - 1;

        while(ini <= fim) {
            meio = (ini + fim) / 2;

            if(chave == vet[meio]) {
                return(meio);

            } else {
                if(chave < vet[meio]) {
                    fim = meio - 1;

                } else {
                    ini = meio + 1;
                }
            }
        }

        meio = -1;
        return(meio);
    }

    public static void ordena(int[] vet, int tam) {
        int L1, c1, aux;

        for(L1 = 0; L1 < tam - 1; L1++) {
            for(c1 = L1 + 1; c1 < tam; c1++) {
                if(vet[L1] > vet[c1]) {
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
