public class Book {
    private Author authorName;
    private int yearBook;
    private String nameBook;

    public Book(String nameBook, Author authorName, int yearBook) {
        this.yearBook = yearBook;
        this.nameBook = nameBook;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Книга: " + nameBook + "/ Автор: " + authorName + "/ Год издания: " + yearBook;
    }

    @Override
    public boolean equals(Object obj) {
        Book ob = (Book) obj;
        if (this == obj) return true;
        if (this.hashCode() == ob.hashCode() && this.nameBook == ob.getNameBook() && (this.authorName.equals(ob.getAuthorName())) && this.yearBook == ob.getYearBook()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.nameBook.hashCode() + getAuthorName().hashCode();
    }


    public int getYearBook() {
        return yearBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

}



