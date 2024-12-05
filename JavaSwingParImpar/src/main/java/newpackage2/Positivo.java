import javax.swing.JOptionPane;

public class Positivo {
    public static void main(String[] args) {
        // Solicitar o número ao usuário
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        // Verificar o sinal do número e exibir o resultado
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é Positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é Negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número é Zero.");
        }
    }
}
