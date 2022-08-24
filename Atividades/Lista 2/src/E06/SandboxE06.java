package E06;

import javax.swing.JOptionPane;

public class SandboxE06 {
    private SandboxE06(){
        
    }

    public static void main(String[] args) throws Exception {
        try {
            new SandboxE06();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: "+ e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
