public class Author {
   private String firstName;
   private String lastName;

   private String nameAuthor;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameAuthor = firstName + lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getnameAuthor(){
        return this.nameAuthor;
    }



    
}

