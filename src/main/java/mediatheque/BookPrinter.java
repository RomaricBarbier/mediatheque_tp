package mediatheque;

public class BookPrinter extends ItemPrinter {

    @Override
    public void visite(CD cd) {  }

    @Override
    public void visite(Book bk) { bk.print(); }

}
