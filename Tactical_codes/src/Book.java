import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public String toString(){return this.id+"****"+this.name+"****"+this.author+"****"+this.publisher+"****"+this.quantity;}

    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list=new ArrayList<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        //Traversing list
        for(Book itr:list){
            System.out.println(itr.id+" "+itr.name+" "+itr.author+" "+itr.publisher+" "+itr.quantity);
        }
        ListIterator<Book> itr=list.listIterator();
        while(itr.hasNext()){

            Book s=itr.next();
            System.out.println(s.toString());///    .id+" "+itr.next().name+" "+itr.next().author+" "+itr.next().publisher+" "+itr.next().quantity);
        }
    }
}
