
import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {
   public static void main(String[] args) {
    
    ArrayList<Livros> listaLivros = new ArrayList<Livros>();
    Livros livro = null;

    
    listaLivros.add(new Livros("Orgulho e Preconceito", "Martin Claret", 0));
    listaLivros.add(new Livros("Harry Potter", "Rocco", 1));
    listaLivros.add(new Livros("Corte de Espinhos e Rosas", "Galera", 2));
    listaLivros.add(new Livros("Senhor dos anéis", "HarperCollins", 3));

    

    System.out.println();
    System.out.println();

    Iterator<Livros> iLivro = listaLivros.iterator();


   while(iLivro.hasNext()){
       livro = (Livros) iLivro.next();
   

   System.out.println("Nome: " +livro.getNomeLivro());
   System.out.println("Editora: " +livro.getEditora());
   System.out.println("Id do livro: " +livro.getIdLivro());
   System.out.println();
   System.out.println();
   }
}
}
