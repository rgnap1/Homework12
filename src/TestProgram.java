public class TestProgram {
 public static void main (String[] args){

  Author author = new Author("Joanne"," Rowling");
  Book book = new Book("Harry Potter",author,1997,8000);
  System.out.println("Book = " + book.getNameBook());
  System.out.println("Author = " + author.getAuthor());
  System.out.println("The year of publishing = " + book.getTheYearOfPublishing() + " year");
  System.out.println("Total pages in this book = " + book.getTotalPages() + " pages");
  System.out.println("  ");
  Author author1 = new Author("Leigh"," Bardugo");
  Book book1 = new Book("Shadow and Bone",author1,2012,8000);
  book1.setTheYearOfPublishing(2000);
  System.out.println("Название книги = " + book1.getNameBook());
  System.out.println("Автор = " + author1.getAuthor());
  System.out.println("Дата публикации = " + book1.getTheYearOfPublishing() + " год");
  System.out.println("Общее количество страниц в книге = " + book1.getTotalPages() + " страниц");



 }
}
