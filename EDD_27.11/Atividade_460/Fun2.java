package Atividade_460;

import javax.swing.JOptionPane;

public class Fun2 {
    public static void main(String[] args) {
        int a, c;

        for(c = 1; c <=3; c++) {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite número: "));
            JOptionPane.showMessageDialog(null, "Dobro: " + dob(a));
        }
    }

    public static int dob(int x) {
        return(x * 2);
    }
}