package Atividade_470;

import javax.swing.JOptionPane;

public class Fun12 {
    public static void main(String[] args) {
        int num, pri;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número > 0: "));

        pri = primo(num);

        if(pri == 0) {
            JOptionPane.showMessageDialog(null, "É primo: " + num);

        } else {
            JOptionPane.showMessageDialog(null, "Não é primo: " + num);
        }
    }

    public static int primo(int n) {
        int c = 0, p = 2;

        while(c == 0 && p <= n / 2) {
            if(n % p == 0) {
                c = 1;
            }

            p++;
        }

        return c;

    }
}