public class Book {
   private String name;
   private int theYearOfPublishing;

   private int totalPages;


   public Book (String name, int theYearOfPublishing, int totalPages){
      this.name = name;
      this.theYearOfPublishing = theYearOfPublishing;
      this.totalPages = totalPages;
   }
   public String getName(){
      return this.name;
   }
   public int getTheYearOfPublishing(){
       return this.theYearOfPublishing;
   }
   public int getTotalPages(){
      return this.totalPages;
   }
   public void setName(String name){
      this.name = name;
   }
   public void setTheYearOfPublishing(int theYearOfPublishing) {
      this.theYearOfPublishing = theYearOfPublishing;
   }
   public void setTotalPages (int totalPages){
      this.totalPages = totalPages;
   }
}
