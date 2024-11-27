package Atividade_499;

import javax.swing.JOptionPane;

public class Fun41 {
    public static void main(String[] args) {
        int flag = 0, op;
        int[] num = new int[5];

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU VETOR - FUNÇÃO\n"
                + "1 Dados do VETOR\n"
                + "2 Ordena VETOR\n"
                + "3 Imprime VETOR\n"
                + "4 Sai do programa\n"
                + "OPÇÃO:\n"));

            switch(op) {
                case 1:
                    entrada(num, 5);
                    flag = 1;
                    break;

                case 2:
                    if(flag == 1) {
                        ordena(num, 5);

                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro opção 1");
                    }

                    break;
                
                case 3:
                    if(flag == 1) {
                        imprime(num, 5);

                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro opção 1");
                    }

                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do Algoritmo");
                    break;

                default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                    
            }
            
        } while(op != 4);

       
    }

    public static int[] entrada(int[] vet, int t) {
        int L;

        JOptionPane.showMessageDialog(null, "Entrada do VETOR");

        for(L= 0; L < t ; L++) {
            vet[L] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite número %d: ", L + 1)));
        }

        return(vet);
    }

    public static int[] imprime(int[] vet, int t) {
        int L;

        StringBuilder resultado = new StringBuilder("VETOR:\n");

        for(L = 0; L < t; L++) {
            resultado.append(String.format("%d - %d\n", L + 1, vet[L]));
        }

        JOptionPane.showMessageDialog(null, resultado.toString());

        return(vet);
    }

    public static int[] ordena(int[] vet, int tam) {
        int L1, cl, aux;
    
        for(L1 = 0; L1 < tam - 1; L1++) {
            for (cl = L1 + 1; cl < tam; cl++) {
                if (vet[L1] > vet[cl]) {
                    aux = vet[L1];
                    vet[L1] = vet[cl];
                    vet[cl] = aux;
                }
            }
        }
    
        return(vet);
    }
}
