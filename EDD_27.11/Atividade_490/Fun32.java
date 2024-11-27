package Atividade_490;

import javax.swing.JOptionPane;

public class Fun32 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        int L;

        for(L = 0; L < 10; L++) {
            nome[L] = JOptionPane.showInputDialog(null, "Digite palavra em letras minúsculas " + (L + 1) + ": ");

            nome[L] = restantes(nome[L], nome[L].length(), "c");
        }

        for(L = 0; L < 10; L++) {
            JOptionPane.showMessageDialog(null, (L + 1) + " - " + nome[L]);
        }
    }

    public static String restantes(String vet, int tam, String x) {
        int i;
        char caractere = x.charAt(0);

        StringBuilder novaPalavra = new StringBuilder(vet); 

        for (i = 0; i < tam; i++) {
            if (vet.charAt(i) == caractere) {
                novaPalavra.setCharAt(i, '*'); 
            }
        }

        return novaPalavra.toString();
    }
}
