import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        // Solicitar as notas ao usuário
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        
        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Verificar aprovação e exibir o resultado
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado com média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado com média: " + media);
        }
    }
}
