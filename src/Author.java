public class Author {
   private String firstName;
   private String lastName;
   private String name;
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
    }
    public String getName(){
        return this.name;
    }

}

