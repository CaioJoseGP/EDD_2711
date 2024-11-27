package Atividade_480;

import javax.swing.JOptionPane;

public class Fun22 {
    public static void main(String[] args) {
        int n, x;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        x = reverso(n);

        JOptionPane.showMessageDialog(null, n + " - " + x);

        if(x == n) {
            JOptionPane.showMessageDialog(null, "É um número capicua");

        } else {
            JOptionPane.showMessageDialog(null, "Não é um número capicua");
        }
    }

    public static int reverso(int num) {
        int soma = 0, r;

        while(num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }

        return(soma);
    }
}