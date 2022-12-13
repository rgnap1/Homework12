public class Book {
   private String name;

   private String author;
   private int theYearOfPublishing;

   private int totalPages;


   public Book (String name,String author, int theYearOfPublishing, int totalPages){
      this.name = name;
      this.author = author;
      this.theYearOfPublishing = theYearOfPublishing;
      this.totalPages = totalPages;

   }
   public String getName(){
      return this.name;
   }
   public String getAuthor(){
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
