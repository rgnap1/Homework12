public class Book {
   private String nameBook;

   private final Author author;

   private int theYearOfPublishing;

   private int totalPages;


   public Book (String nameBook,Author author, int theYearOfPublishing, int totalPages){
      this.nameBook = nameBook;
      this.author = author;
      this.theYearOfPublishing = theYearOfPublishing;
      this.totalPages = totalPages;

   }
   public String getNameBook(){

      return this.nameBook;
   }

   public Author getAuthor(){
      return this.author;
   }

   public int getTheYearOfPublishing(){

      return this.theYearOfPublishing;
   }
   public int getTotalPages(){

      return this.totalPages;
   }
   public void setTheYearOfPublishing(int theYearOfPublishing) {

      this.theYearOfPublishing = theYearOfPublishing;
   }
  @Override
   public String toString(){
      return nameBook + " - " + author + " - " + theYearOfPublishing + " - " + totalPages;
   }
   @Override
   public boolean equals(Object other){
       if (this == other)
           return true;
      if(other == null || this.getClass() != other.getClass())
          return false;
      Book book = (Book) other ;
      return theYearOfPublishing == book.theYearOfPublishing && nameBook.equals(nameBook) && author.equals(author) && totalPages == book.totalPages;
   }
   @Override
   public int hashCode(){
      return java.util.Objects.hash(nameBook);
   }

}
