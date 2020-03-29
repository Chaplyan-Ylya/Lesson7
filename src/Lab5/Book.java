package Lab5;

public class Book {
    static final private double price = 100;
    static final private String currency ="грн";
    private String title;
    private String author;
    private int pages;
    private int year;
    private boolean hardCover;
    private String[] tableOfContents;

    public static double getPrice() {
        return price;
    }

    public static String getCurrency() {
        return currency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isHardCover() {
        return hardCover;
    }

    public void isHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public String[] getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(String[] tableOfContents) {
        this.tableOfContents = tableOfContents;
    }
}

