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
    @Override
    public String toString(){
        return firstName + " : " + lastName;
    }
    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Author author = (Author) other;
        return author.equals(author.firstName) && author.equals(author.lastName);
    }
    @Override
    public int hashCode(){

        return java.util.Objects.hash(author);
    }

}

