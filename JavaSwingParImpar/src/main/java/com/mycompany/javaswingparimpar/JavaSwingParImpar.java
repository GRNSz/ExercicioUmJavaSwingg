import javax.swing.JOptionPane;

public class JavaSwingParImpar {
    public static void main(String[] args) {
        // Solicitar o número ao usuário
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        // Verificar paridade e exibir o resultado
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é Par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é Ímpar.");
        }
    }
}
