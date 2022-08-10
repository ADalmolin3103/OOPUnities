package E05;

import javax.print.attribute.standard.MediaSize.Other;

public class InteiroPositivo {
    private int x, xFatorial, xDivisores, fibonacci; //mover para os métodos
    public void setNumero(int num) {
        if (num >= 0) {
            this.x = num;
        }
    }

    public int pegarValor() {
        return this.x;
    }

    public int multiplicador(InteiroPositivo outro) {
        return this.x *= outro.pegarValor();
    }

    public int fatorial() {
        while (x > 0) {
            xFatorial = x;
            xFatorial *= xFatorial - 1;
            xFatorial -= 1;
        }
        return xFatorial;
    }

    public int numeroDivisores() {
        xDivisores = 0;
        for (int i = 0; i < x; i++) {
            if (x % i == 0) {
                xDivisores++;
            }
        }
        return xDivisores;
    }

    public int fibonacci() {

        return fibonacci;
    }
}
