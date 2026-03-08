package practiceNested;
//Write a Java program to create an outer class called Library with an instance variable libraryName. Create an inner class Book with a method getLibraryName() that returns the name of the library. Instantiate the Book class and call the getLibraryName() method.
//


class Library{
   public String libraryName;

   Library(String libraryName){
       this.libraryName =libraryName;
   }

   class Book{

      public String getLibraryName(){
           return libraryName;
       }
   }
}

public class practiceNested4 {

    public static void main(String[] args){
        Library l1 = new Library("jkl");

        Library.Book b1 = l1.new Book();


        System.out.println(   b1.getLibraryName());
    }
}
