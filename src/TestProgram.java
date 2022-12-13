public class TestProgram {
 public static void main (String[] args){

  Book book = new Book("Harry Potter","Joanne Rowling",1997,9000);
  Author author = new Author("Joanne"," Rowling");
  System.out.println("Book = " + book.getName());
  System.out.println("Author = " + author.getName());
  System.out.println("The year of publishing = " + book.getTheYearOfPublishing() + " year");
  System.out.println("Total pages in this book = " + book.getTotalPages() + " pages");
  System.out.println("  ");
  Book book1 = new Book("Shadow and Bone","Leigh Bardugo",2012,8000);
  Author author1 = new Author("Leigh"," Bardugo");
  book1.setTheYearOfPublishing(2000);
  System.out.println("Название книги = " + book1.getName());
  System.out.println("Автор = " + author1.getName());
  System.out.println("Дата публикации = " + book1.getTheYearOfPublishing() + " год");
  System.out.println("Общее количество страниц в книге = " + book1.getTotalPages() + " страниц");

 }
}
