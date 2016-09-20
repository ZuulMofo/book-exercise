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

    /**
     * Set the author, title, pages, and refNumber fields when this object
     * is constructed. refNumber is always initialized at zero.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
     * sets the refNumber
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
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
     * prints the title, author and number of pages
     */
    public void printDetails()
    {
        System.out.println(title);
        System.out.println("by " + author);
        System.out.println("no. of pages = " + pages);
    }
    // Add the methods here ...
}
