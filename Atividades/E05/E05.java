package E05;

public class E05 {
    private E05(){
        InteiroPositivo X = new InteiroPositivo();
        InteiroPositivo Y = new InteiroPositivo();
        
        X.setNumero(7);
        Y.setNumero(2);
        int fatorialX = X.fatorial();
        System.out.println(fatorialX);
        X.multiplicador(Y);
        System.out.println(X.pegarValor());
    }
    public static void main(String[] args) {
        new E05();
    }
}
