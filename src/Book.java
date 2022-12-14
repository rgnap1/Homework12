public class Book {
   private String nameBook;

   private Author author;

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

}
