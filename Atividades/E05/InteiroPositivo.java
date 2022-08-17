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

    public int numeroDivisores() { //OK
        xDivisores = 0;
        for (int i = 1; i < x+1; i++) {
            if (x % i == 0) {
                xDivisores++;
            }
        }
        return xDivisores;
    }

    public int fibonacci() { 
        int tamanhoSequencia = this.pegarValor();
        int[] fibSeq = new int[tamanhoSequencia];
        for (int i = 0; i < fibSeq.length; i++) {
            if(i<2){
                fibSeq[i]=1;
            }
            if(i>=2){
                fibSeq[i]=fibSeq[i-1]+fibSeq[i-2];
            }
        }
        return fibonacci;
    }
}
