public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }

    @Override
    public int hashCode() {
        return this.authorName.hashCode() + this.authorSurname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj) return true;
        if (this.authorName == ((Author) obj).authorName && this.authorSurname == ((Author) obj).authorSurname || this.hashCode() == obj.hashCode())
            return true;
        else return false;
    }
}

