package Atividade_495;

import javax.swing.JOptionPane;

public class Fun37 {
    public static void main(String[] args) {
        int L;
        String[] nome = new String[5];

        for(L = 0; L < 5; L++) {
            nome[L] = JOptionPane.showInputDialog(null, "Digite o nome:");
        }

        ordena(nome, 5);

        StringBuilder nomesOrdenados = new StringBuilder("NOMES ORDENADOS:\n");
        
        for(L = 0; L < 5; L++) {
            nomesOrdenados.append(String.format("%d - %s\n", L + 1, nome[L]));
        }

        JOptionPane.showMessageDialog(null, nomesOrdenados.toString());
    }

    public static void ordena(String[] vet, int tam) {
        int L1, c1;
        String aux;

        for (L1 = 0; L1 < tam - 1; L1++) {
            for (c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1].compareTo(vet[c1]) > 0) {
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
