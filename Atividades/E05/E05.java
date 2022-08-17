package E05;

public class E05 {
    private E05(){
        InteiroPositivo X = new InteiroPositivo();
        InteiroPositivo Y = new InteiroPositivo();
        
        X.setNumero(3);
        //Y.setNumero(2);
        
        
        System.out.println(X.fibonacci());
    }
    public static void main(String[] args) {
        new E05();
    }
}
