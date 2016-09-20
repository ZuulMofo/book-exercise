/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author James Emge
 * @version 9/19/16
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author, title, pages, refNumber, and courseText fields when this object
     * is constructed. refNumber is always initialized at zero.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourse)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourse;
    }
    
    /**
     * returns the author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * returns the title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * returns the number of pages
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * returns the refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * returns borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * sets the refNumber.
     * if there is less than three characters prints error messages
     */
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3){
            refNumber = ref;
        }
        else{
            System.out.println("ERROR: Use three characters or more");
        }
    }
    
    /**
     * increments the amount of times borrowed
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * prints by: + the author on a new line
     */
    public void printAuthor()
    {
        System.out.println("by: " + author);
    }
    
    /**
     * prints the title on a new line
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /**
     * prints the title, author, number of pages, reference number and number of times borrowed. 
     * If there is no reference number given it will print zzz
     */
    public void printDetails()
    {
        System.out.println(title);
        System.out.println("by " + author);
        System.out.println("no. of pages: " + pages);
        
        if(refNumber == ""){
            System.out.println("reference no.: zzz");
        }
        else{
            System.out.println("reference no.: " + refNumber);
        }
        
        System.out.println("no. of times borrowed: " + borrowed);
    }
    // Add the methods here ...
}
