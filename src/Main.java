public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Лев", "Толстой");
        Book bookNumberOne = new Book("Война и мир", author1,1811);
        Book bookNumberTwo = new Book("Война и мир", author2,2020);

        System.out.println(bookNumberOne.toString());
        bookNumberOne.setYearBook(2020);
        System.out.println(bookNumberOne.toString());

        System.out.println("Сравнение авторов: " + author1.equals(author2) + "hashCode: " + author1.hashCode());
        System.out.println("Сравнение книг: " + bookNumberOne.equals(bookNumberTwo) + "hashCode: " + bookNumberOne.hashCode());


    }

}
