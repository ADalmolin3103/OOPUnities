import javax.swing.JOptionPane;

public class Sandbox {

    private Sandbox(){
        String teste = "abcdefg";
        String[] resultado = teste.split("cd");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        try{
            new Sandbox();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu ruim: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
