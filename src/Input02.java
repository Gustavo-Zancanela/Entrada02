import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "isto é uma caixa de mensagem",
                "Caixa de mensagem",
                1);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Isto é uma pergunta?",
                "Pergunta",
                3,
                null,
                null,
                "Digite algo aqui");
        
        
        String[] acceptableValues = {"Sim", "Não", "Talvez"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Isto é uma pergunta?",
                "Pergunta2",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
                
    }
}
