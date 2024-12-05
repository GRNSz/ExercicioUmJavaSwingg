import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        // Solicitar os números ao usuário
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        
        // Comparar os números e exibir o resultado
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos os números são iguais: " + num1);
        }
    }
}
