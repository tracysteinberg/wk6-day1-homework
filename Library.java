class Library {
  private String section;
  private int number;
  private double dewey;
  private String title;
  private Book[] stock;


  public Library(String section, int number, double dewey, String title) {
    this.section = section;
    this.number = number;
    this.dewey = dewey;
    this.title = title;
    this.stock = new Book[5];

  }

  public String hasSection() {
    return this.section;

  }


  public int hasNumber() {
    return this.number;

  }

  public double hasDewey() {
    return this.dewey;

  }
  public boolean readyToBuy(){
    // return this.dewey > 600.00;
    if( this.dewey >600) {
       return true;

    }

      return false;
    }
      



   public int bookCount() {
       int count=0;
       for( Book book : this.stock)  {
         if(book != null) {
         count++;

       }
    

     }
    return count;

   }

 public void buy( Book book ) {
    if ( stockIsFull() ) {
       return;
    }

   int bookCount = bookCount();
   stock[bookCount] = book;

   }
  public boolean stockIsFull() {
  return bookCount() == stock.length;

   }
  public void discard() {
    for( int i = 0; i < stock.length; i++) {
      stock[i] = null;

    }
  }

}