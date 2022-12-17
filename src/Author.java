public class Author {
   private String firstName;
   private String lastName;

   private String author;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.author = firstName + lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){

        return this.lastName;
    }
    public String getAuthor(){
        return this.author;
    }
    public String toString(){
        return firstName + " : " + lastName;
    }
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }else if (this.firstName != ((Author) other).firstName || this.lastName != ((Author) other).lastName){
            return false;
        }
        Author author1 = (Author) other;
        return author.equals(author1.author);
    }
    public int hashCode(){
        return java.util.Objects.hash(author);
    }




    
}

