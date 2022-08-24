package E06;

import javax.swing.JOptionPane;

public class VetorDeReais {
 
    //Atributo
    double[] vetReal;
    String nome;
    
    public VetorDeReais(int n, String nome){
        this.vetReal = new double[n];
        this.nome = nome;
    }

    public void definirValores(int posicao, double valor){
        this.vetReal[posicao]=valor;
    }

    public int retNumeroPar(){
        int numerosParesQtdd=0;
        for (int i = 0; i < this.vetReal.length; i++) {
            if((int)this.vetReal[i]%2==0){
                numerosParesQtdd++;
            }
        }
        return numerosParesQtdd;
    }

    public double[] divisorVetor(VetorDeReais outro){
    	if (this.vetReal.length != outro.vetReal.length) {
    		return null;
    	}
        double[] vetorRazao = new double[this.vetReal.length];
        for (int i = 0; i < vetorRazao.length; i++) {
            vetorRazao[i]=this.vetReal[i]/outro.vetReal[i];
        }
        return vetorRazao;
    }

    public double multiplicacao(VetorDeReais outro){
        double M = 0;
        for (int i = 0; i < this.vetReal.length; i++) {
            M += this.vetReal[i]*outro.vetReal[vetReal.length-i-1];             
        }
        return M;
    }

    public void inversor(){
        double bubble;
        for (int i = 0; i < vetReal.length/2; i++) {
            bubble = this.vetReal[i];
            this.vetReal[i]=this.vetReal[vetReal.length-i-1];
            this.vetReal[vetReal.length-i-1]=bubble;
        }
    }

    public double maiorDiferença() {
    	double maiorDiferenca=0;
    	for(int i = 0; i < this.vetReal.length-1; i++)
    	{
    		if(Math.abs( this.vetReal[i]-this.vetReal[i+1])>maiorDiferenca) {
    			maiorDiferenca = Math.abs(this.vetReal[i]-this.vetReal[i+1]);
    		}
    	}
    	return maiorDiferenca;
    }

    public static void main(String[] args) throws Exception{
        try{
            VetorDeReais vetorTeste1= new VetorDeReais(4);
            VetorDeReais vetorTeste2 = new VetorDeReais(2);

            vetorTeste1.definirValores(0,2);
            vetorTeste1.definirValores(1, 8);
            vetorTeste1.definirValores(2, 1);
            vetorTeste1.definirValores(3, 1);

            JOptionPane.showMessageDialog(null, vetorTeste1.maiorDiferença(), "MAIOR DIFERENÇA", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
