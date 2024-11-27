package Atividade_500;

import javax.swing.JOptionPane;

public class Fun42 {
    public static void main(String[] args) {
        int flag = 0, flag1 = 0, op;
        int[] num = new int[5], num1 = new int[5];

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "VETORES\n"
                + "1 Dados do VETOR A\n"
                + "2 Dados do VETOR B\n"
                + "3 Imprime VETORES\n"
                + "4 Soma VETORES\n"
                + "5 Subtrai VETORES\n"
                + "6 Sai do programa\n"
                + "OPÇÃO:\n"));

            switch(op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;

                case 2:
                    entrada(num1, 5, "B");
                    flag1 = 1;
                    break;
                
                case 3:
                    if(flag != 0 && flag1 != 0) {
                        imprime(num, 5, "A");
                        imprime(num1, 5, "B");

                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro opções 1 e 2");
                    }

                    break;

                case 4:
                    if(flag != 0 && flag1 != 0) {
                        soma(num, num1, 5);

                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro opções 1 e 2");
                    }

                    break;

                case 5:
                    if(flag != 0 && flag1 != 0) {
                        subtrai(num, num1, 5);

                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro opções 1 e 2");
                    }

                    break;
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do Algoritmo");
                    break;

                default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                    
            }
            
        } while(op != 6);

       
    }

    public static int[] entrada(int[] vet, int t, String c) {
        int L;

        JOptionPane.showMessageDialog(null, "Entrada do VETOR " + c);

        for(L= 0; L < t ; L++) {
            vet[L] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite número %d: ", L + 1)));
        }

        return(vet);
    }

    public static int[] imprime(int[] vet, int t, String c) {
        int L;

        StringBuilder resultado = new StringBuilder(String.format("VETOR %s: \n", c));

        for(L = 0; L < t; L++) {
            resultado.append(String.format("%d - %d\n", L + 1, vet[L]));
        }

        JOptionPane.showMessageDialog(null, resultado.toString());

        return(vet);
    }

    public static void soma(int[] vet, int[] vet1, int t) {
        int L, s;

        StringBuilder resultado = new StringBuilder(String.format("SOMA\n"));

        for(L = 0; L < t; L++) {
            s = vet[L] + vet1[L];
            resultado.append(String.format("%d\n", s));
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static void subtrai(int[] vet, int[] vet1, int t) {
        int L, s;

        StringBuilder resultado = new StringBuilder(String.format("DIFERENÇA\n"));

        for(L = 0; L < t; L++) {
            s = vet[L] - vet1[L];
            resultado.append(String.format("%d\n", s));
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
