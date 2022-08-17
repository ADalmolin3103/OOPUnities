package E05;

public class InteiroPositivo {
    private int x, xFatorial, xDivisores, fibonacci; // mover para os métodos

    public void setNumero(int num) {//OK
        if (num >= 0) {
            this.x = num;
        }
    }

    public int pegarValor() { //OK
        return this.x;
    }

    public int multiplicador(InteiroPositivo outro) {  //OK
        return this.x *= outro.pegarValor();
    }

    public int fatorial() { //OK
        int indiceSubtracao = this.x;
        xFatorial = indiceSubtracao;
        while (indiceSubtracao > 1) {
            xFatorial *= indiceSubtracao - 1;
            indiceSubtracao -= 1;
        }
        return xFatorial;
    }

    public String numeroDivisores() { //OK
        xDivisores = 0;
        String resposta = "Os divisores são: ";
        for (int i = 1; i < x+1; i++) {
            if (x % i == 0) {
                xDivisores++;
                resposta += i + ", ";
            }
        }
        resposta += "e o numero de divisores é: " + xDivisores;
        return resposta;
    }

    public void fibonacci(int[] vetorDestino) { //OK
        for (int i = 0; i < vetorDestino.length; i++) {
            if(i<2){
                vetorDestino[i]=1;
            }
            if(i>=2){
                vetorDestino[i]=vetorDestino[i-1]+vetorDestino[i-2];
            }
        }
    }

    public double SerieHarmonica (){
        double H=1;
        for (int i = 1; i < this.pegarValor(); i++) {
            H += (1.0/(i+1));
        }
        return H;
    }

    /* Overloads que deixam mais preciso e autêntico, com limites em 0 e infinito
    public int SerieHarmonica(String limite){
        int resposta =0;
        if(limite.equals("infinito")){
            resposta =0;
        }
        return resposta;
    }
    
    public String SerieHarmonica(int limite){
        String infinito = "0";
        Double somatorio = 1.0;
        if(limite == 0){
            infinito = "infinito";
        }
        else{
            for (int i = 1; i < limite; i++) {
                limite += (1.0/(i+1));
            }
            return somatorio.toString();
        }
        return infinito;
    }
    */

    public double RazaoDivergente() //OK
    {
        double numerador = (double) this.pegarValor(), denominador = 1.0, razao=0;
        for (int i = 0; i < this.pegarValor(); i++) {
            razao+=(numerador-i)/(denominador+i);
        }
        return razao;
    }
    
    public double serieExpoentePeloFatorial() //OK
    {//20! > double; Hence the long
        double S=0, numerador=0, denominador=1;
        int x = this.pegarValor();
        for (int i = 1; i < 21; i++) {
            numerador = Math.pow(x, 21-i);
            for (int j = 0; j < i; j++) {
                denominador *= i-j;
            }
            S+=numerador/denominador;
        }
        return S;
    }

    public double serieFatorialPeloInteiro() //OK
    {
        double P =0;
        for (int i = 1; i < this.pegarValor()+1; i++) {
            P+= (2*i)/i;
        }
        return P;
    }
}
