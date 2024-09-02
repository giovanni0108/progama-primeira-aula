public class ProjetoLivraria{
     public static void main(String[]args) {
        livro obj1; // ProjetoLivraria
        obj1 = new livro (); // one piece
        obj1.titulo = "one piece";
        obj1.numeroPagina = 700;
        obj1.preco = 80;
        obj1.anoPublicaçao = 1995
        obj1.genero = aniamacao;
        obj1.autor = Eiichiro Oda;

        double frete = obj1.calcFrete("66125-800");
        System.out.printf("Frete %.2f",30);


        obj2 = new livro (); // marvel
        obj2.titulo = "marvel";
        obj2.numeroPagina = 270;
        obj2.preco = 75;
        obj2.anoPublicaçao = 2004
        obj2.genero = acao;
        obj2.autor =  martin goordom;
        double frete = obj2.calcFrete("66125-800");
        System.out.printf("Frete %.6f",50);
     }
}
   