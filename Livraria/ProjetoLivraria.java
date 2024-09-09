import Livraria.Livro;

public class ProjetoLivraria{
     public static void main(String[]args) {
        Livro obj1; // ProjetoLivraria
        obj1 = new Livro () // one piece
        obj1.titulo = "one piece";
        obj1.numeroPagina = 700;
        obj1.preco = 80;
        obj1.anoPublicaçao = 1995
        obj1.genero = "aniamacao";
        obj1.autor = "Eiichiro Oda";

        double frete = obj1.calcFrete("66125-800");
        System.out.printf("Frete %.2f",30);


        Livro obj2; // ProjetoLivraia
        obj2 = new Livro (); // marvel
        obj2.titulo = "marvel";
        obj2.numeroPagina = 270;
        obj2.preco = 75;
        obj2.anoPublicaçao = 2004
        obj2.genero = "acao";
        obj2.autor =  "martin goordom";
        double Frete = obj2.calcFrete("66125-800");
        System.out.printf("Frete %.6f",50);
        
        Livro Livro2 = new Livro("marvel", 70.00)
        Livro2. Cadastrar();

        Livro Livro3 = new Livro("one piece", 400 100.00);
        Livro Livro4 = new Livro("marvel", 500 75.00)
        System.out.println(Livro4.getTitulo);
     }
     public Livro(){

     }

     public Livro(String titulo, int numeroPagina, double preco){
         this.titulo = titulo;
         this.preco = preco;
         this.numeroPagina = numeroPagina;
     }
     }
}
   