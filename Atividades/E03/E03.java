package E03;

public class E03 {
        public static void main(String[] args) {
            Produto A = new Produto();
            Produto B = new Produto();
            Produto C = new Produto();

            A.nome="Caderno";
            A.descricao="Caderno em espiral tamanho médio";
            A.preco = 4.50f;
            A.desconto = 10;

            B.nome = "Caneta ESF";
            B.descricao = "Caneta esferográfica 5mm";
            B.preco = 1.20f;
            B.desconto=2;

            C.nome = "Esquadro";
            C.descricao = "Esquadro acrílico 20cm";
            C.preco = 2.35f;
            C.desconto = 10f;

        }
}
