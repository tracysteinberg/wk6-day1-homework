import static org.junit.Assert.assertEquals;
import org.junit.*;



public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {

      library = new Library("Classics", 5, 601.02, "Jane Eyre");
      book = new Book();
    }


    
    @Test
    public void hasSection() {
       assertEquals( "Classics", library.hasSection() );

    }

    @Test
    public void hasNumber() {
     assertEquals(5,  library.hasNumber() );


    }

    @Test
    public void hasDewey() {
     assertEquals(601.02, library.hasDewey(), 0.01);
    }

    @Test 

    public void readyToBuyIfGreaterThan600(){
      assertEquals(true, library.readyToBuy());

    }

   
    @Test
    public void notReadyToBuyIfLessThan600(){
      Library lowStock = new Library("Biology", 1, 590.01, "The Double Helix");
      assertEquals(false, lowStock.readyToBuy ());

    }


     @Test
    public void stockStartEmpty() {
      assertEquals(0, library.bookCount());


    }
    
  
    @Test
    public void cannotBuyBookWhenStockFull() {
       for( int i = 0; i < 10; i++) {
         library.buy(book);
       }
       assertEquals(5, library.bookCount());
    }

    

}